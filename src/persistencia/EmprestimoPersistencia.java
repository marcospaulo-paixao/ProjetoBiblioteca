/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import controle.ColaboradorControle;
import controle.ExemplarControle;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import modelos.classes.Colaborador;
import modelos.classes.Emprestimo;
import modelos.classes.Exemplar;
import modelos.interfaces.ICRUDColaborador;
import modelos.interfaces.ICRUDEmprestimo;
import modelos.utilidades.Data;
import modelos.utilidades.GeradorID;
import modelos.interfaces.ICRUDExemplar;

/**
 *
 * @author marcos
 */
public class EmprestimoPersistencia implements ICRUDEmprestimo {

    String nomeDoArquivoNoDisco = "";

    public EmprestimoPersistencia(String nomeDoArquivoNoDisco) {
        this.nomeDoArquivoNoDisco = nomeDoArquivoNoDisco;

    }

    @Override
    public void incluir(Emprestimo objeto) throws Exception {
        try {
            GeradorID gd = new GeradorID();
            objeto.setId(gd.getID());
            gd.finalize();

            Data data = new Data();
            objeto.setDataDoEmprestimo(data.getData());
            objeto.setDataDeDevolucao(data.somarData(3));

            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(objeto.toString() + "\n");
            bw.close();

        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Emprestimo getEmprestimo(int id) throws Exception {
        try {

            ArrayList<Emprestimo> lista = listagem();
            for (Emprestimo emprestimo : lista) {
                if (emprestimo.getId() == id) {
                    return emprestimo;
                }
            }
        } catch (Exception e) {
            throw e;
        }
        return null;
    }

    @Override
    public ArrayList<Emprestimo> listagem() throws Exception {
        try {
            ICRUDColaborador cc = new ColaboradorControle("colaborador.txt");
            ICRUDExemplar ec = new ExemplarControle("exemplar.txt");

            ArrayList<Emprestimo> lista = new ArrayList<>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                String vetor[] = linha.split(";");
                int id = Integer.parseInt(vetor[0]);
                Colaborador c = cc.getColaborador(Integer.parseInt(vetor[1]));
                Exemplar e = ec.getExemplar(Integer.parseInt(vetor[2]));
                String dataDoEmprestimo = vetor[3];
                String dataDeDevolucao = vetor[4];
                Emprestimo ep = new Emprestimo(c, e);
                ep.setId(id);
                ep.setDataDoEmprestimo(dataDoEmprestimo);
                ep.setDataDeDevolucao(dataDeDevolucao);
                lista.add(ep);
            }
            br.close();
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void deletar(Emprestimo objEmprestimo) throws Exception {
        try {
            ArrayList<Emprestimo> lista = listagem();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Emprestimo emprestimo : lista) {
                if (emprestimo.getId() != objEmprestimo.getId()) {
                    bw.write(emprestimo.toString());
                }
            }
            bw.close();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void altera(Emprestimo velhoObjEmprestimo, Emprestimo novoObjEmprestimo) throws Exception {

        try {

        } catch (Exception e) {
            throw e;
        }
    }

}
