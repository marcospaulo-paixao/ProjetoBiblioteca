/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.classes;

import modelos.utilidades.Telefone;
import modelos.utilidades.enums.TipoDeColadoradores;
import modelos.utilidades.enums.TipoDeStatus;

/**
 *
 * @author marcos
 */
public class Colaborador {

    /**
     * #Atributos
     */
    private int id = 0;
    private int matricula = 0;
    private String nome = "";
    private int OAB = 0;
    private String email = "";
    private Telefone telefone = null;
    private TipoDeColadoradores tipoDeColaborador = null;
    private TipoDeStatus tipoDeStatus = null;
    private String uf = null; 
    /**
     * #Métedos
     */
    /**
     * @default
     */
    public Colaborador() {
        id = 0;
        matricula = 0;
        nome = "";
        OAB = 0;
        email = "";
        telefone = null;
        tipoDeColaborador = null;
        tipoDeStatus = null;
    }

    /**
     *
     * @param matricula
     * @param nome
     * @param OAB
     * @param email
     * @param ddd
     * @param telefone
     * @param tipoDeColaborador
     * @param tipoDeStatus
     * @param uf
     */
    public Colaborador(int matricula, String nome, int OAB, String email,
            int ddd,int telefone, TipoDeColadoradores tipoDeColaborador, TipoDeStatus tipoDeStatus,String uf) throws Exception{

         this.OAB = OAB;
        this.matricula = matricula;
        this.nome = nome;
       
        this.email = email;
        this.telefone =new Telefone(ddd,telefone);
        this.tipoDeColaborador = tipoDeColaborador;
        this.tipoDeStatus = tipoDeStatus;
        this.uf = uf;
    }

    /**
     *
     * @param objeto
     */
    public Colaborador(Colaborador objeto) {
        this.id = objeto.id;
        this.matricula = objeto.matricula;
        this.nome = objeto.nome;
        this.OAB = objeto.OAB;
        this.email = objeto.email;
        this.telefone = objeto.telefone;
        this.tipoDeColaborador = objeto.tipoDeColaborador;
        this.tipoDeStatus = objeto.tipoDeStatus;
        this.uf = objeto.uf;

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
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the OAB
     */
    public int getOAB() {
        return OAB;
    }

    /**
     * @param OAB the OAB to set
     */
    public void setOAB(int OAB) {
        this.OAB = OAB;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefone
     */
    public Telefone getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int ddd,int telefone) {
        this.setTelefone(new Telefone(ddd,telefone));
    }

    /**
     * @return the tipoDeColaborador
     */
    public TipoDeColadoradores getTipoDeColaborador() {
        return tipoDeColaborador;
    }

    /**
     * @param tipoDeColaborador the tipoDeColaborador to set
     */
    public void setTipoDeColaborador(TipoDeColadoradores tipoDeColaborador) {
        this.tipoDeColaborador = tipoDeColaborador;
    }

    /**
     * @return the tipoDeStatus
     */
    public TipoDeStatus getTipoDeStatus() {
        return tipoDeStatus;
    }

    /**
     * @param tipoDeStatus the tipoDeStatus to set
     */
    public void setTipoDeStatus(TipoDeStatus tipoDeStatus) {
        this.tipoDeStatus = tipoDeStatus;
    }

    @Override
    public String toString() {
        String saida = id + ";";
        saida += matricula + ";";
        saida += nome + ";";
        saida += OAB + ";";
        saida += email + ";";
        saida += telefone.getDdd() + ";";
        saida += telefone.getNumero() + ";";
        saida += tipoDeColaborador + ";";
        saida += tipoDeStatus + ";";
        saida += getUf() + ";";

        return saida;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the uf
     */
    public String getUf() {
        return uf;
    }

    /**
     * @param uf the uf to set
     */
    public void setUf(String uf) {
        this.uf = uf;
    }
    

    }
