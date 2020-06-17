/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.interfaces;

import java.util.ArrayList;
import modelos.classes.Usuario;

/**
 *
 * @author marcos
 */
public interface ICRUDUsuario {

    /**
     *
     * @param objeto
     * @throws Exception
     */
    void incluir(Usuario objeto) throws Exception;

    /**
     *
     * @param obejeto
     * @throws Exception
     */
    void deletar(Usuario objeto) throws Exception;

    /**
     *
     * @param velhoObjeto
     * @param novoObjeto
     * @throws Exception
     */
    void alterar(Usuario velhoObjeto, Usuario novoObjeto) throws Exception;

    /**
     *
     * @return ArrayList<Usuario>
     * @throws Exception
     */
    ArrayList<Usuario> listagem() throws Exception;

    /**
     *
     * @param nomeDoUsuario
     * @return Usuario
     * @throws Exception
     */
    Usuario getUsuario(String nomeDoUsuario) throws Exception;
    
    /**
     * 
     * @param login
     * @param senha
     * @return 
     */
    boolean validaUsuario(String login,String senha)throws Exception;
   
    /**
     * 
     * @param login
     * @param senha
     * @return
     * @throws Exception 
     */
    boolean validaAdministrador(String login,String senha)throws Exception;
    /**
     * 
     * @param  login
     * @return 
     * @throws Exception 
     */ 
    public boolean verificarLogin(String login) throws Exception ;
    /**
     * 
     * @param nome
     * @return 
     * @throws Exception 
     */ 
    public boolean verificarNomeDoUsuario(String nome) throws Exception ;
}