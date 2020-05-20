/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.utilidades;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelos.classes.Colaborador;

/**
 *
 * @author marcosNome();
 */
public class ColaboradorTableModel extends AbstractTableModel {

    ArrayList<Colaborador> dados = null;
    String[] colunas = null;

    public ColaboradorTableModel(String[] colunas) {
        this.dados = new ArrayList<>();
        this.colunas = colunas;
    }

    private ColaboradorTableModel() {
        dados = null;
        colunas = null;
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
                return String.format("%03d", dados.get(rowIndex).getId());
            case 1:
//                return dados.get(rowIndex).getNome();
                return (dados.get(rowIndex).getNome().equals("-"))?"":dados.get(rowIndex).getNome();
            case 2:
                return dados.get(rowIndex).getMatricula()+"";
            case 3:
                return dados.get(rowIndex).getOAB()+"";
            case 4:
//                return dados.get(rowIndex).getEmail();
                return (dados.get(rowIndex).getEmail().equals("-"))?"":dados.get(rowIndex).getEmail();
            case 5:
                return dados.get(rowIndex).getTelefone()+"";
            case 6:
                if (dados.get(rowIndex).getTipoDeColaborador()==TipoDeColadoradores.ADVOGADO) return "Advogado";
                if (dados.get(rowIndex).getTipoDeColaborador()==TipoDeColadoradores.ESTAGIARIO) return "Estagiario";
                if (dados.get(rowIndex).getTipoDeColaborador()==TipoDeColadoradores.FUNCIONARIO) return "Funcionario";
                if (dados.get(rowIndex).getTipoDeColaborador()==TipoDeColadoradores.INDEFINIDO) return "Indefinido";
            case 7:
                if (dados.get(rowIndex).getTipoDeStatus()==TipoDeStatus.ATIVO) return "Ativo";
                if (dados.get(rowIndex).getTipoDeStatus()==TipoDeStatus.INATIVO) return "Inativo";
                if (dados.get(rowIndex).getTipoDeStatus()==TipoDeStatus.INDEFINIDO) return "Indefinido";
            default:
                throw new AssertionError();
        }
    }

    public void addRow(Colaborador coladorador) {
        this.dados.add(coladorador);
    }

    public void update(ArrayList<Colaborador> lista) {
        try {
            dados.removeAll(dados);
            lista.forEach((colaborador) -> {
                this.addRow(colaborador);
            });
            this.fireTableDataChanged();
        } catch (Exception e) {
        }
    }
}
