/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
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
    public ArrayList<Usuario> listar() throws Exception {
        try {
            return usuarioPersistencia.listar();
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
}
