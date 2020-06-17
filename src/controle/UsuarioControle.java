/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import modelos.classes.Usuario;
import modelos.interfaces.ICRUDUsuario;
import persistencia.UsuarioPersistencia;

/**
 *
 * @author marcos
 */
public class UsuarioControle implements ICRUDUsuario {

    /**
     * #Atributos
     */
    ICRUDUsuario usuarioPersistencia;

    /**
     * #Métodos
     */
    /**
     *
     * @param nomeDoArquivoNoDisco
     */
    public UsuarioControle(String nomeDoArquivoNoDisco) {
        this.usuarioPersistencia = new UsuarioPersistencia(nomeDoArquivoNoDisco);
    }

    /**
     *
     * @param objeto
     * @throws Exception
     */
    @Override
    public void incluir(Usuario objeto) throws Exception {
        try {
            usuarioPersistencia.incluir(objeto);
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     *
     * @param velhoObjeto
     * @param novoObjeto
     * @throws Exception
     */
    @Override
    public void alterar(Usuario velhoObjeto, Usuario novoObjeto) throws Exception {
        try {
            usuarioPersistencia.alterar(velhoObjeto, novoObjeto);
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     *
     * @return ArrayList<Usuario>
     * @throws Exception
     */
    @Override
    public ArrayList<Usuario> listagem() throws Exception {
        try {
            ArrayList<Usuario> listaDeUsuario = usuarioPersistencia.listagem();;
            //Comparador de Strings
            Comparator c = (Comparator<Usuario>) (Usuario o1, Usuario o2) -> o1.getNomeDoUsuario().compareToIgnoreCase(o2.getNomeDoUsuario());
            //Biblioteca para ordenar por ordem alfabética
            Collections.sort(listaDeUsuario, c);
            return listaDeUsuario;
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     *
     * @param nomeDoUsuario
     * @return Usuario
     * @throws Exception
     */
    @Override
    public Usuario getUsuario(String nomeDoUsuario) throws Exception {
        try {
            return usuarioPersistencia.getUsuario(nomeDoUsuario);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void deletar(Usuario objeto) throws Exception {
        try {
            usuarioPersistencia.deletar(objeto);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public boolean validaUsuario(String login, String senha) throws Exception {
        try {
            return usuarioPersistencia.validaUsuario(login, senha);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public boolean validaAdministrador(String login, String senha) throws Exception {
        try {
            return usuarioPersistencia.validaAdministrador(login, senha);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public boolean verificarLogin(String login) throws Exception {
        try {
            return usuarioPersistencia.verificarLogin(login);
        } catch (Exception e) {
            throw e;
        }

    }

    @Override
    public boolean verificarNomeDoUsuario(String nome) throws Exception {
         try {
            return usuarioPersistencia.verificarNomeDoUsuario(nome);
        } catch (Exception e) {
            throw e;
        }
    }
}
