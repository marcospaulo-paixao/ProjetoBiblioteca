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
public enum TipoDeColadoradores {
    ADVOGADO(1), ESTAGIARIO(2),
    FUNCIONARIO(3), INDEFINIDO(0);

    int valor;

    TipoDeColadoradores(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
