/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import modelos.classes.Emprestimo;
import modelos.interfaces.ICRUDEmprestimo;
import persistencia.EmprestimoPersistencia;

/**
 *
 * @author marcos
 */
public class EmprestimoControle implements ICRUDEmprestimo {

    ICRUDEmprestimo emprestimoPersistencia = null;

    public EmprestimoControle(String nomeDoArquivoNoDisco) {
        emprestimoPersistencia = new EmprestimoPersistencia(nomeDoArquivoNoDisco);
    }

    @Override
    public void incluir(Emprestimo objEmprestimo) throws Exception {
        try {
            emprestimoPersistencia.incluir(objEmprestimo);
        } catch (Exception e) {
        }
    }

    @Override
    public Emprestimo getEmprestimo(int id) throws Exception {
        try {
            return emprestimoPersistencia.getEmprestimo(id);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public ArrayList<Emprestimo> listagem() throws Exception {
        try {

            return emprestimoPersistencia.listagem();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void deletar(Emprestimo objEmprestimo) throws Exception {
        try {
            emprestimoPersistencia.deletar(objEmprestimo);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void altera(Emprestimo velhoObjEmprestimo, Emprestimo novoObjEmprestimo) throws Exception {
        try {
            emprestimoPersistencia.altera(velhoObjEmprestimo, novoObjEmprestimo);
        } catch (Exception e) {
            throw e;
        }
    }

}
