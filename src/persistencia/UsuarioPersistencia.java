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
import modelos.classes.Usuario;
import modelos.interfaces.ICRUDUsuario;
import modelos.utilidades.GeradorID;

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
        GeradorID id = new GeradorID();
        FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
        BufferedWriter bw = new BufferedWriter(fw);
        objeto.setId(id.getID());
        bw.write(objeto.toString() + "\n");
        id.finalize();
        bw.close();
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
            ArrayList<Usuario> listaDeUsuario = listar();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);
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
    public ArrayList<Usuario> listar() throws Exception {
        ArrayList<Usuario> listaDeUsuario = new ArrayList<>();
        FileReader fr = new FileReader(nomeDoArquivoNoDisco);
        BufferedReader br = new BufferedReader(fr);
        String linha = "";
        while ((linha = br.readLine()) != null) {
            listaDeUsuario.add(new Usuario(linha));
        }
        br.close();
        return listaDeUsuario;
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
            ArrayList<Usuario> listaDeUsuario = listar();

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
        ArrayList<Usuario> listaDeUsuario = listar();
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
        }
    }
}
