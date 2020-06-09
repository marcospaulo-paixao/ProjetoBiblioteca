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
    public void alterar(Autor antigoAutor, Autor autorAtual) throws Exception {
        try {
            ArrayList<Autor> listaDeAutor = listagem();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);
            autorAtual.setId(antigoAutor.getId());
            for (Autor autores : listaDeAutor) {
                if (!antigoAutor.getNome().equalsIgnoreCase(autores.getNome())) {
                    bw.write(autores.toString() + "\n");
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

    @Override
    public Autor getNomeAutor(String nomeAutor) throws Exception {
        try {
            ArrayList<Autor> autores = listagem();
            for (Autor autoresNaLista : autores) {
                if (nomeAutor.equalsIgnoreCase(autoresNaLista.getNome())) {
                    return autoresNaLista;
                }
            }
        } catch (Exception ErroListarNomeAutor) {
            throw ErroListarNomeAutor;
        }
        return null;
    }

    @Override
    public Autor getIdAutor(int idAutor) throws Exception {
        try {
            ArrayList<Autor> autores = listagem();
            for (Autor autoresNaLista : autores) {
                if (autoresNaLista.getId() == idAutor) {
                    return autoresNaLista;
                }
            }
        } catch (Exception ErroListarIdAutor) {
            throw ErroListarIdAutor;
        }
        return null;
    }

}
