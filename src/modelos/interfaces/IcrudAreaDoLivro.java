package modelos.interfaces;

import java.util.ArrayList;
import modelos.classes.AreaDoLivro;

public interface IcrudAreaDoLivro {

    void incluir(AreaDoLivro areaDoLivro) throws Exception;

    void alterar(AreaDoLivro areaAntiga, AreaDoLivro areaAtual) throws Exception;

    void excluir(String descricao) throws Exception;

    AreaDoLivro getDescricaoLivro(String descricao) throws Exception;

    ArrayList<AreaDoLivro> listagem() throws Exception;
}
