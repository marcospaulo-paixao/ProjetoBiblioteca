package controle;

import java.util.ArrayList;
import modelos.classes.Livro;
import persistencia.LivroPersistencia;
import modelos.interfaces.ICRUDLivro;

public class LivroControle implements ICRUDLivro {

    ICRUDLivro livroControle = null;

    public LivroControle(String nomeDoArquivoNoDisco) {
        this.livroControle = new LivroPersistencia(nomeDoArquivoNoDisco);
    }

    @Override
    public void incluir(Livro livro) throws Exception {
        try {
            livroControle.incluir(livro);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void alterar(Livro antigoLivro, Livro novoLivro) throws Exception {
        try {
            livroControle.alterar(antigoLivro, novoLivro);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void excluir(String titulo) throws Exception {
        try {
            livroControle.excluir(titulo);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Livro getTituloLivro(String tituloLivro) throws Exception {
        try {
            return livroControle.getTituloLivro(tituloLivro);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public ArrayList<Livro> listagem() throws Exception {
        try {
            return livroControle.listagem();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Livro getIdDoLivro(int iLivro) throws Exception {
        try {
            return livroControle.getIdDoLivro(iLivro);
        } catch (Exception e) {
            throw e;
        }
    }

}
