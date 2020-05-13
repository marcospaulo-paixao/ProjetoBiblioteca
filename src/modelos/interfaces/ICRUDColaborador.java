/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.interfaces;

import java.util.ArrayList;
import modelos.classes.Colaborador;

/**
 *
 * @author marcos
 */
public interface ICRUDColaborador {

    /**
     *
     * @param objeto
     * @throws Exception
     */
    void incluir(Colaborador objeto) throws Exception;

    /**
     *
     * @param velhoColaborador
     * @param novoColaborador
     * @throws Exception
     */
    void alterar(Colaborador velhoColaborador, Colaborador novoColaborador) throws Exception;

    /**
     *
     * @return @throws Exception
     */
    ArrayList<Colaborador> listagem() throws Exception;
    /**
     * 
     * @param id
     * @return Colaborador
     * @throws Exception 
     */
    Colaborador getColaborador(int id) throws Exception;
}
