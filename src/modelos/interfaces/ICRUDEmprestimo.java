package modelos.interfaces;

import java.util.ArrayList;
import modelos.classes.Emprestimo;

public interface ICRUDEmprestimo {

    void incluir(Emprestimo objEmprestimo) throws Exception;

    Emprestimo getEmprestimo(int id) throws Exception;

    ArrayList<Emprestimo> listagem() throws Exception;
}
