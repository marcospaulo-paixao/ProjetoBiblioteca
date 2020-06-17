/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.classes;

import modelos.utilidades.enums.TipoDeStatus;
import modelos.utilidades.enums.TipoDeUsuario;

/**
 *
 * @author marcos
 */
public class Usuario {

    /**
     * #Atributos
     */
    protected int id = 0;
    protected String nomeDoUsuario = "";
    protected String login = "";
    protected String senha = "";
    protected TipoDeStatus status = null;
    private TipoDeUsuario tipoDeUsuario =null;

    /**
     * #Métodos
     */
    /**
     * @default
     */
    public Usuario() {
        id = 0;
        nomeDoUsuario = "";
        login = "";
        senha = "";
        status = null;
        tipoDeUsuario =null;
    }
    /**
     * 
     * @param objeto 
     */
    public Usuario(Usuario objeto) {
        this.id = objeto.id;
        this.nomeDoUsuario = objeto.nomeDoUsuario;
        this.login = objeto.login;
        this.senha = objeto.senha;
        this.status = objeto.status;
        tipoDeUsuario = objeto.tipoDeUsuario;
    }
    /**
     * 
     * @param nomeDoUsuario
     * @param login
     * @param senha
     * @param status 
     * @param tipoDeUsuario 
     */
    public Usuario(String nomeDoUsuario, String login, String senha, TipoDeStatus status, TipoDeUsuario tipoDeUsuario) {
        this.nomeDoUsuario = nomeDoUsuario;
        this.login = login;
        this.senha = senha;
        this.status = status;
        this.tipoDeUsuario =tipoDeUsuario;
    }
    /**
     * 
     * @param toString 
     */
    public Usuario(String toString) {
        String[] vetor = toString.split(";");
        this.id = Integer.parseInt(vetor[0]);
        this.nomeDoUsuario = vetor[1];
        this.login = vetor[2];
        this.senha = vetor[3];
        this.status = TipoDeStatus.valueOf(vetor[4]);
        this.tipoDeUsuario = TipoDeUsuario.valueOf(vetor[5]);
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nomeDoUsuario
     */
    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }

    /**
     * @param nomeDoUsuario the nomeDoUsuario to set
     */
    public void setNomeDoUsuario(String nomeDoUsuario) {
        this.nomeDoUsuario = nomeDoUsuario;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the status
     */
    public TipoDeStatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(TipoDeStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        String saida = "";
        saida += id + ";";
        saida += nomeDoUsuario + ";";
        saida += login + ";";
        saida += senha + ";";
        saida += status + ";";
        saida += tipoDeUsuario.name()+ ";";
        return saida;
    }

    /**
     * @return the tipoDeUsuario
     */
    public TipoDeUsuario getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    /**
     * @param tipoDeUsuario the tipoDeUsuario to set
     */
    public void setTipoDeUsuario(TipoDeUsuario tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }

}
