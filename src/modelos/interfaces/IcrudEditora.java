package modelos.interfaces;

import java.util.ArrayList;
import modelos.classes.Editora;

public interface IcrudEditora {

    void incluir(Editora editoraObjeto) throws Exception;

    void alterar(Editora antigoEditora, Editora atualEditora) throws Exception;

    void excluir(String nome) throws Exception;

    Editora getEditoraNome(String nomeEditora) throws Exception;

    ArrayList<Editora> listagem() throws Exception;
}
