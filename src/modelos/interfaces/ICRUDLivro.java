package modelos.interfaces;

import java.util.ArrayList;
import modelos.classes.Livro;

public interface ICRUDLivro {

    void incluir(Livro livro) throws Exception;

    void alterar(Livro antigoLivro, Livro novoLivro) throws Exception;

    void excluir(String titulo) throws Exception;

    Livro getTituloLivro(String tituloLivro) throws Exception;

    ArrayList<Livro> listagem() throws Exception;

    public Livro getIdDoLivro(int iLivro) throws Exception;
}
