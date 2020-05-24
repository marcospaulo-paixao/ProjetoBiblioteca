package modelos.interfaces;

import java.util.ArrayList;
import modelos.classes.Autor;

public interface IcrudAutor {

    void incluir(Autor autorObj) throws Exception;

    void alterar(Autor antigoAuto, Autor autorAtual) throws Exception;

    void excluir(String nome) throws Exception;

    ArrayList<Autor> listagem() throws Exception;
    Autor listarAutorNome(String nome) throws Exception;
}
