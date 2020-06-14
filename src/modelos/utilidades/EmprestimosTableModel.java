/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.utilidades;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelos.classes.Emprestimo;

/**
 *
 * @author marcos
 */
public class EmprestimosTableModel extends AbstractTableModel {

    ArrayList<Emprestimo> dados = null;
    String[] colunas = null;

    public EmprestimosTableModel(String[] colunas) {
        this.dados = new ArrayList<>();
        this.colunas = colunas;
    }


    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return dados.get(rowIndex).getId()+"";
            case 1:
                return dados.get(rowIndex).getColaborador().getNome();
            case 2:
                return dados.get(rowIndex).getExemplar().getLivro().getTitulo();
            case 3:
                return dados.get(rowIndex).getDataDoEmprestimo();
            case 4:
                return dados.get(rowIndex).getDataDeDevolucao();
            default:
                throw new AssertionError();
        }
    }

    public void addRow(Emprestimo emprestimo) {
        this.dados.add(emprestimo);
    }

    public void update(ArrayList<Emprestimo> lista) {
        try {
           dados.removeAll(dados);
            for (Emprestimo emprestimo : lista) {
                dados.add(emprestimo);
            }
          
            this.fireTableDataChanged();
        } catch (Exception errorEmprestimo) {
        }
    }

    public void update(String[] dadosEmprestimoListada) {
        try {
            ArrayList<Emprestimo> lista = new ArrayList<>();
            for (int i = 0; i < dados.size(); i++) {
                for (int j = 0; j < dadosEmprestimoListada.length; j++) {
                    if (dados.get(i).getId() == Integer.parseInt(dadosEmprestimoListada[j])) {
                        lista.add(dados.get(i));
                    }
                }
            }
            update(lista);
        } catch (Exception e) {
            throw e;
        }
    }
}
