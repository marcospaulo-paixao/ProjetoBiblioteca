package persistencia;

import controle.ColaboradorControle;
import controle.ExemplarControle;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import modelos.classes.Colaborador;
import modelos.classes.Exemplar;
import modelos.classes.Reserva;
import modelos.interfaces.ICRUDColaborador;
import modelos.utilidades.GeradorID;
import modelos.interfaces.ICRUDExemplar;
import modelos.interfaces.ICRUDReserva;

public class ReservaPersistencia implements ICRUDReserva {

    SimpleDateFormat data = new SimpleDateFormat("dd/mm/yyyy");
    String nomeDoAquivoNoDisco = "";
    ICRUDExemplar exemplar = new ExemplarControle("exemplar.txt");
    ICRUDColaborador colaborador = new ColaboradorControle("colaborador.txt");

    public ReservaPersistencia(String nomeDoAquivoNoDisco) {
        this.nomeDoAquivoNoDisco = nomeDoAquivoNoDisco;
    }

    public String getNomeDoAquivoNoDisco() {
        return nomeDoAquivoNoDisco;
    }

    public void setNomeDoAquivoNoDisco(String nomeDoAquivoNoDisco) {
        this.nomeDoAquivoNoDisco = nomeDoAquivoNoDisco;
    }

    public ICRUDExemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(ICRUDExemplar exemplar) {
        this.exemplar = exemplar;
    }

    public ICRUDColaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(ICRUDColaborador colaborador) {
        this.colaborador = colaborador;
    }

    @Override
    public void incluir(Reserva objeto) throws Exception {
        try {
            GeradorID igId = new GeradorID();
            objeto.setId(igId.getID());
            igId.finalize();
            FileWriter fw = new FileWriter(nomeDoAquivoNoDisco, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(objeto.toString() + "\n");
            bw.close();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void excluir(String nome) throws Exception {
        try {
            ArrayList<Reserva> listaReserva = listagem();
            FileWriter fr = new FileWriter(nomeDoAquivoNoDisco);
            BufferedWriter br = new BufferedWriter(fr);

            for (int pos = 0; pos < listaReserva.size(); pos++) {
                Reserva aux = listaReserva.get(pos);
                if (!nome.equalsIgnoreCase(aux.getColaborador().getNome())) {
                    br.write(aux.toString() + "\n");
                }
            }
            br.close();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public ArrayList<Reserva> listagem() throws Exception {
        try {
            ArrayList<Reserva> listaDeReservas = new ArrayList();
            FileReader fr = new FileReader(nomeDoAquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);

            String linha = "";
            while ((linha = br.readLine()) != null) {
                String[] vetor = linha.split(";");
                int id = Integer.parseInt(vetor[0]);
                String dataDaReserva = vetor[1];
                int periodo = Integer.parseInt(vetor[2]);

                Exemplar exemplarNaLista = exemplar.getExemplar(Integer.parseInt(vetor[3]));
                Colaborador colaboradorNaLista = colaborador.getColaborador((vetor[4]));
                listaDeReservas.add(new Reserva(id, dataDaReserva, periodo, exemplarNaLista, colaboradorNaLista));
            }
            return listaDeReservas;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Reserva getReservaColaborador(String nome) throws Exception {
        try {
            ArrayList<Reserva> listaDeReservas = listagem();
            for (Reserva reservas : listaDeReservas) {
                if (reservas.getColaborador().getNome().equalsIgnoreCase(nome)) {
                    return reservas;
                }
            }
        } catch (Exception e) {
            throw e;
        }
        return null;
    }

}
