package modelos.interfaces;

import java.util.ArrayList;
import modelos.classes.Exemplar;

public interface ICRUDExemplar {

    void incluir(Exemplar objExemplar) throws Exception;

    void alterar(Exemplar antigoExemplar, Exemplar atualExemplar) throws Exception;

    void excluir(int idExemplar) throws Exception;

    Exemplar getExemplar(int idExemplar) throws Exception;

    Exemplar getExemplar(String titulo) throws Exception;
    
    ArrayList<Exemplar> listagem() throws Exception;
}
