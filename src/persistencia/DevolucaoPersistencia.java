/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.BufferedWriter;
import java.io.FileWriter;
import modelos.classes.Devolucao;
import modelos.interfaces.ICRUDDevolucao;
import modelos.utilidades.GeradorID;

/**
 *
 * @author marcos
 */
public class DevolucaoPersistencia implements ICRUDDevolucao {

    private String nomeDoArquivoNoDisco = "";

    public DevolucaoPersistencia(String nomeDoArquivoNoDisco) {
        this.nomeDoArquivoNoDisco = nomeDoArquivoNoDisco;

    }

    @Override
    public void incluir(Devolucao devolucao) throws Exception {
        try {
            GeradorID id = new GeradorID();
            devolucao.setId(id.getID());
            id.finalize();
            
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(devolucao.toString()+"\n");
            bw.close();
        } catch (Exception e) {
            throw e;
        }
    }

}
