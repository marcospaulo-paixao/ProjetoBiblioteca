/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.utilidades.enums;

/**
 *
 * @author marcos
 */
public enum TipoDeStatus {
    /**
     * #Atributos
     */
    ATIVO(0), INATIVO(1), INDEFINIDO(2);
    
    int valor;

    /**
     * #Metodos
     */
    /**
     *
     * @param valor
     */
    TipoDeStatus(int valor) {
        this.valor = valor;
    }

    /**
     *
     * @return valor
     */
    public int getValor() {
        return valor;
    }
}
