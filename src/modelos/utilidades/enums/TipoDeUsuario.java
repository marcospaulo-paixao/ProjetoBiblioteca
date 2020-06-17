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
public enum TipoDeUsuario {
    USUARIO(1), ADMINISTRADOR(2);

    int valor;

    TipoDeUsuario(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
