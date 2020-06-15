/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelos.classes.Devolucao;
import modelos.interfaces.ICRUDDevolucao;
import persistencia.DevolucaoPersistencia;

/**
 *
 * @author marcos
 */
public class DevolucaoControle implements ICRUDDevolucao {

    ICRUDDevolucao persistenciaDevolucao = null;

    public DevolucaoControle(String nomeDoArquivoNoDisco) {
        persistenciaDevolucao = new DevolucaoPersistencia(nomeDoArquivoNoDisco);
    }

    @Override
    public void incluir(Devolucao devolucao) throws Exception {
        try {
            persistenciaDevolucao.incluir(devolucao);
        } catch (Exception e) {
            throw e;
        }
    }

}
