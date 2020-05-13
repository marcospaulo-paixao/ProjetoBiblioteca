package modelos.interfaces;

import java.util.ArrayList;
import modelos.classes.Editora;

public interface IcrudEditora {

    void incluir(Editora editoraObjeto) throws Exception;
    void alterar(Editora antigoEditora, Editora atualEditora) throws Exception;

    ArrayList<Editora> listagem() throws Exception;
}
