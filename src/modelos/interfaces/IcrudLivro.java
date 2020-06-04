package modelos.interfaces;

import java.util.ArrayList;
import modelos.classes.Livro;

public interface IcrudLivro {

    void incluir(Livro livro) throws Exception;

    void alterar(Livro antigoLivro, Livro novoLivro) throws Exception;

    void excluir(String titulo) throws Exception;

    Livro getTituloLivro(String tituloLivro) throws Exception;

    ArrayList<Livro> listagem() throws Exception;
}
