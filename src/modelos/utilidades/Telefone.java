/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.utilidades;

/**
 *
 * @author marcos
 */
public class Telefone {

    /**
     * # Atributos
     */
    private int ddd = 0;
    private int prefixo = 0;
    private int sufixo = 0;

    /**
     * # Métodos
     */
    /**
     * @param ddd
     * @param numero
     */
    public Telefone(int ddd, int numero) {
        this.ddd = ddd;
        prefixo = numero / 10000;
        sufixo = numero % 10000;
    }
    /**
     * 
     * @param telefone 
     */
    public Telefone(Telefone telefone) {
        this.ddd = telefone.ddd;
        this.prefixo = telefone.prefixo;
        this.sufixo = telefone.sufixo;

    }
    /**
     * 
     * @param telefone 
     */
    public Telefone(String telefone) {
        String numero = "";
        telefone = telefone.replace("(", "");
        telefone = telefone.replace(")", "");
        telefone = telefone.replace(" ", "");
        telefone = telefone.replace("-", "");
        String ddd = telefone.substring(0, 2);
        numero = telefone.substring(2);
        this.ddd = Integer.parseInt(ddd);
        this.prefixo = Integer.parseInt(numero) / 10000;
        this.sufixo = Integer.parseInt(numero) % 10000;
    }

    /**
     * @return String numero de telefone
     */
    public String getTelefone() {
        return "(" + ddd + ") " + prefixo + " - " + sufixo;
    }

    /**
     * @return int ddd
     */
    public int getDdd() {
        return ddd;
    }

    /**
     * @return int prefixo e sufixo juntos
     */
    public int getNumero() {
        return Integer.parseInt("" + prefixo + sufixo);
    }
}
