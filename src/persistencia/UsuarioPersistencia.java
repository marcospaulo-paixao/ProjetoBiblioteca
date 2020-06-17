/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Base64;
import modelos.classes.Usuario;
import modelos.interfaces.ICRUDUsuario;
import modelos.utilidades.GeradorID;
import modelos.utilidades.enums.TipoDeUsuario;

/**
 *
 * @author marcos
 */
public class UsuarioPersistencia implements ICRUDUsuario {

    /**
     * #Atributos
     */
    private String nomeDoArquivoNoDisco = "";

    /**
     * #Métodos
     *
     * @param nomeDoArquivoNoDisco
     */
    public UsuarioPersistencia(String nomeDoArquivoNoDisco) {
        this.nomeDoArquivoNoDisco = nomeDoArquivoNoDisco;
    }

    /**
     *
     * @param objeto
     * @throws Exception
     */
    @Override
    public void incluir(Usuario objeto) throws Exception {
        try {

            GeradorID id = new GeradorID();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            BufferedWriter bw = new BufferedWriter(fw);
            verificarNomeDoUsuario(objeto.getNomeDoUsuario());
            verificarLogin(objeto.getLogin());
            objeto.setId(id.getID());
            objeto.setSenha(Base64.getEncoder().encodeToString(objeto.getSenha().getBytes()));

            bw.write(objeto.toString() + "\n");
            bw.close();
            id.finalize();
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
            ArrayList<Usuario> listaDeUsuario = listagem();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);
            novoObjeto.setSenha(Base64.getEncoder().encodeToString(novoObjeto.getSenha().getBytes()));
            for (Usuario usuario : listaDeUsuario) {
                if (!usuario.getNomeDoUsuario().equals(velhoObjeto.getNomeDoUsuario())) {
                    bw.write(usuario.toString() + "\n");
                } else {
                    bw.write(novoObjeto.toString() + "\n");
                }
            }
            bw.close();
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     *
     * @return @throws Exception
     */
    @Override
    public ArrayList<Usuario> listagem() throws Exception {
        try {

            ArrayList<Usuario> listaDeUsuario = new ArrayList<>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                listaDeUsuario.add(new Usuario(linha));
            }
            br.close();
            return listaDeUsuario;
        } catch (Exception e) {
        }
        return null;
    }

    /**
     *
     * @param nomeDoUsuario
     * @return
     * @throws Exception
     */
    @Override
    public Usuario getUsuario(String nomeDoUsuario) throws Exception {
        try {
            ArrayList<Usuario> listaDeUsuario = listagem();

            for (Usuario usuario : listaDeUsuario) {
                if (usuario.getNomeDoUsuario().equals(nomeDoUsuario)) {
                    return usuario;
                }
            }
        } catch (Exception e) {
            throw e;
        }
        return null;
    }

    /**
     *
     * @param objeto
     * @throws Exception
     */
    @Override
    public void deletar(Usuario objeto) throws Exception {
        ArrayList<Usuario> listaDeUsuario = listagem();
        try {

            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Usuario usuario : listaDeUsuario) {
                if (usuario.getId() != objeto.getId()) {
                    bw.write(usuario.toString() + "\n");
                }
            }
            bw.close();
        } catch (Exception e) {
            throw e;

        }
    }

    /**
     *
     * @param login
     * @param senha
     * @return
     * @throws java.lang.Exception
     */
    @Override
    public boolean validaUsuario(String login, String senha) throws Exception {
        try {
            ArrayList<Usuario> lista = listagem();
            String s = Base64.getEncoder().encodeToString(senha.getBytes());

            for (Usuario usuario : lista) {
                if (usuario.getLogin().equals(login)) {
                    if (usuario.getSenha().equals(s)) {
                        return true;
                    }
                }
            }

        } catch (Exception e) {
            throw e;
        }
        return false;
    }

    @Override
    public boolean validaAdministrador(String login, String senha) throws Exception {
        try {
            ArrayList<Usuario> lista = listagem();
            String s = Base64.getEncoder().encodeToString(senha.getBytes());

            for (Usuario usuario : lista) {
                if (usuario.getTipoDeUsuario().equals(TipoDeUsuario.ADMINISTRADOR)) {
                    if (usuario.getLogin().equals(login)) {
                        if (usuario.getSenha().equals(s)) {
                            return true;
                        }
                    }
                }
            }

        } catch (Exception e) {
            throw e;
        }
        return false;
    }

    public boolean verificarLogin(String login) throws Exception {
        for (Usuario usuario : listagem()) {
            if (login.toLowerCase().equals(usuario.getLogin().toLowerCase())) {
                throw new Exception("Este login ja está em uso. Tente outro!");
            }
        }
        return true;
    }

    @Override
    public boolean verificarNomeDoUsuario(String nome) throws Exception {
        for (Usuario usuario : listagem()) {
            if (nome.toLowerCase().equals(usuario.getNomeDoUsuario().toLowerCase())) {
                throw new Exception("Este usuário está cadastrado!");
            }
        }
        return true;

    }
}
