package controle;

import java.util.ArrayList;
import modelos.classes.Livro;
import modelos.interfaces.IcrudLivro;
import persistencia.LivroPersistencia;

public class LivroControle implements IcrudLivro {

    IcrudLivro livroControle = null;

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Livro> listagem() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
