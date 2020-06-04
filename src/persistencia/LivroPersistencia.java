package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import modelos.classes.Livro;
import modelos.interfaces.IcrudLivro;
import modelos.utilidades.GeradorID;

public class LivroPersistencia implements IcrudLivro {

    String nomeDoArquivoNoDisco = "";

    public LivroPersistencia(String nomeDoArquivoNoDisco) {
        this.nomeDoArquivoNoDisco = nomeDoArquivoNoDisco;
    }

    public String getNomeDoArquivo() {
        return nomeDoArquivoNoDisco;
    }

    @Override
    public void incluir(Livro livro) throws Exception {
        try {
            GeradorID gId = new GeradorID();
            livro.setId(gId.getID());
            gId.finalize();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(livro.toString() + "\n");
            bw.close();
        } catch (Exception erroIncluir) {
            throw erroIncluir;
        }
    }

    @Override
    public void alterar(Livro antigoLivro, Livro novoLivro) throws Exception {
        try {
            ArrayList<Livro> listaLivros = listagem();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);
            novoLivro.setId(antigoLivro.getId());
            for (Livro livros : listaLivros) {
                if (!antigoLivro.getTitulo().equalsIgnoreCase(livros.getTitulo())) {
                    bw.write(livros.toString() + "\n");
                } else {
                    bw.write(novoLivro.toString() + "\n");
                }
            }
            bw.close();
        } catch (Exception erroLivroAlterar) {
            throw erroLivroAlterar;
        }
    }

    @Override
    public void excluir(String titulo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Livro getTituloLivro(String tituloLivro) throws Exception {
        try {
            ArrayList<Livro> livrosLista = listagem();
            for (Livro livrosNaLista : livrosLista) {
                if (livrosNaLista.getTitulo().equalsIgnoreCase(tituloLivro)) {
                    return (Livro) livrosNaLista;
                }
            }
        } catch (Exception ErroListarNomeLivro) {
            throw ErroListarNomeLivro;
        }
        return null;
    }

    @Override
    public ArrayList<Livro> listagem() throws Exception {
        try {
            ArrayList<Livro> listaDeLivros = new ArrayList();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";

            while ((linha = br.readLine()) != null) {
                linha = br.readLine();
            }

            return listaDeLivros;
        } catch (Exception listarLivros) {
            throw listarLivros;
        }
    }

}
