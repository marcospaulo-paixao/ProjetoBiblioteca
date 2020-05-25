package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import modelos.classes.Autor;
import modelos.interfaces.IcrudAutor;
import modelos.utilidades.GeradorID;

public class AutorPersistencia implements IcrudAutor {

    private String nomeDoArquivoNoDisco = "";

    public AutorPersistencia(String nomeDoArquivoNoDisco) {
        this.nomeDoArquivoNoDisco = nomeDoArquivoNoDisco;
    }

    @Override
    public void incluir(Autor autorObj) throws Exception {
        try {
            GeradorID gId = new GeradorID();
            autorObj.setId(gId.getID());
            gId.finalize();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(autorObj.toString() + "\n");
            bw.close();
        } catch (IOException errorAutor) {
            throw errorAutor;
        }
    }

    @Override
    public void alterar(Autor antigoAuto, Autor autorAtual) throws Exception {
        try {

            ArrayList<Autor> listaDeAutores = listagem();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Autor autor : listaDeAutores) {
                if (autor.getNome() != antigoAuto.getNome()) {
                    bw.write(autor.toString() + "\n");
                } else {
                    bw.write(autorAtual.toString() + "\n");
                }
            }
            bw.close();
        } catch (Exception erroAutorAlterar) {
            throw erroAutorAlterar;
        }
    }

    @Override
    public ArrayList<Autor> listagem() throws Exception {
        try {
            ArrayList<Autor> listaDeAutores = new ArrayList<>();

            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);

            String linha = "";
            while ((linha = br.readLine()) != null) {
                String[] vetor = linha.split(";");
                int id = Integer.parseInt(vetor[0]);
                String nome = vetor[1];
                Autor autorList = new Autor(id, nome);
                listaDeAutores.add(autorList);
            }
            return listaDeAutores;
        } catch (Exception erroConsultaAutor) {
            throw erroConsultaAutor;
        }
    }

    @Override
    public void excluir(String nome) throws Exception {
        try {
            ArrayList<Autor> listaDeContatos = listagem();
            FileWriter fr = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter br = new BufferedWriter(fr);

            for (int pos = 0; pos < listaDeContatos.size(); pos++) {
                Autor aux = listaDeContatos.get(pos);

                if (!nome.equalsIgnoreCase(aux.getNome())) {
                    br.write(aux.toString() + "\n");
                }
            }
            br.close();
        } catch (FileNotFoundException other) {
            throw other;
        }
    }

    public Autor listarAutorNome(String nome) throws Exception {
        try {
            ArrayList<Autor> listaDeAutores = new ArrayList<>();

            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);

            String linha = "";
            while ((linha = br.readLine()) != null) {
                String[] vetor = linha.split(";");
                int id = Integer.parseInt(vetor[0]);
                String nomearq = vetor[1];
                Autor autorList = new Autor(id, nomearq);
                listaDeAutores.add(autorList);
            }

            for (int aut = 0; aut < listaDeAutores.size(); aut++) {
                if (nome.equalsIgnoreCase(listaDeAutores.get(aut).getNome())) {
                    return listaDeAutores.get(aut);
                }
            }
            return null;
        } catch (Exception erroConsultaAutor) {
            throw erroConsultaAutor;
        }
    }

}