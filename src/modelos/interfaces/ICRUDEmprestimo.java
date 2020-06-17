package modelos.interfaces;

import java.util.ArrayList;
import modelos.classes.Emprestimo;

public interface ICRUDEmprestimo {

    /**
     *
     * @param objEmprestimo
     * @throws Exception
     */
    void incluir(Emprestimo objEmprestimo) throws Exception;

    /**
     *
     * @param objEmprestimo
     * @throws Exception
     */
    void deletar(Emprestimo objEmprestimo) throws Exception;

    /**
     *
     * @param objEmprestimo
     * @throws Exception
     */
    void altera(Emprestimo velhoObjEmprestimo,Emprestimo novoObjEmprestimo) throws Exception;

    /**
     *
     * @param id
     * @return
     * @throws Exception
     */
    Emprestimo getEmprestimo(int id) throws Exception;

    /**
     *
     * @return @throws Exception
     */
    ArrayList<Emprestimo> listagem() throws Exception;
    public Emprestimo getEmprestimoExe(int id) throws Exception;
}
