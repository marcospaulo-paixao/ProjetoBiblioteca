/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import modelos.classes.Colaborador;
import modelos.interfaces.ICRUDColaborador;
import persistencia.ColaboradorPersistencia;

/**
 *
 * @author marcos
 */
public class ColaboradorControle implements ICRUDColaborador {

    /**
     * #Atributos
     */
    ICRUDColaborador colaboradorPersistencia = null;

    /**
     * @param nomeDoArquivoNoDisco
     */
    public ColaboradorControle(String nomeDoArquivoNoDisco) {
        colaboradorPersistencia = new ColaboradorPersistencia(nomeDoArquivoNoDisco);
    }

    /**
     *
     * @param objeto
     * @throws Exception
     */
    @Override
    public void incluir(Colaborador objeto) throws Exception {
        try {
            colaboradorPersistencia.incluir(objeto);
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     *
     * @param velhoColaborador
     * @param novoColaborador
     * @throws Exception
     */
    @Override
    public void alterar(Colaborador velhoColaborador, Colaborador novoColaborador) throws Exception {
        try {
            colaboradorPersistencia.alterar(velhoColaborador, novoColaborador);
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     *
     * @return @throws Exception
     */
    @Override
    public ArrayList<Colaborador> listagem() throws Exception {
        try {
             ArrayList<Colaborador> listaDeContatos = colaboradorPersistencia.listagem();
             //Comparador de Strings
            Comparator c = (Comparator<Colaborador>) (Colaborador o1, Colaborador o2) -> o1.getNome().compareToIgnoreCase(o2.getNome());
            //Biblioteca para ordenar por ordem alfabética
            Collections.sort(listaDeContatos, c);
            return colaboradorPersistencia.listagem();
        } catch (Exception e) {
            throw e;
        }
    }
    @Override
    public Colaborador getColaborador(String nome) throws Exception {
        try {
            return colaboradorPersistencia.getColaborador(nome);
        } catch (Exception e) {
            throw e;
        }
    }
}
