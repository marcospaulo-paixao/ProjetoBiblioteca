package modelos.interfaces;

import java.util.ArrayList;
import modelos.classes.Autor;

public interface IcrudAutor {

    void incluir(Autor autorObj) throws Exception;

    void alterar(Autor antigoAutor, Autor autorAtual) throws Exception;

    void excluir(String nome) throws Exception;

    Autor getNomeAutor(String nomeAutor) throws Exception;

    ArrayList<Autor> listagem() throws Exception;
}
