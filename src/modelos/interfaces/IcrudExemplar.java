package modelos.interfaces;

import java.util.ArrayList;
import modelos.classes.Exemplar;

public interface IcrudExemplar {

    void incluir(Exemplar objExemplar) throws Exception;

    void alterar(Exemplar antigoExemplar, Exemplar atualExemplar) throws Exception;

    void excluir(int idExemplar) throws Exception;

    Exemplar getExemplar(String descricaoExemplar) throws Exception;

    ArrayList<Exemplar> listagem() throws Exception;
}
