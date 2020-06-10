/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.utilidades;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelos.classes.Livro;

/**
 *
 * @author marcos
 */
public class LivroTableModel extends AbstractTableModel{


    ArrayList<Livro> dados = null;
    String[] colunas = null;

    public LivroTableModel(String[] colunas) {
        this.dados = new ArrayList<>();
        this.colunas = colunas;
    }

    private LivroTableModel() {
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
                return dados.get(rowIndex).getTitulo();
            case 1:
                return dados.get(rowIndex).getCodigo()+"";
            case 2:
                return dados.get(rowIndex).getIsbn()+"";
            case 3:
                return dados.get(rowIndex).getAutor().getNome();
            case 4:
                return dados.get(rowIndex).getEditora().getNome();
            case 5:
                return dados.get(rowIndex).getAreaDoLivro().getDescricao();                         
            default:
                throw new AssertionError();
        }
    }

    public void addRow(Livro Livro) {
        this.dados.add(Livro);
    }

    public void update(ArrayList<Livro> lista) {
        try {
            dados.removeAll(dados);
            lista.forEach((livro) -> {
                this.addRow(livro);
            });
            this.fireTableDataChanged();
        } catch (Exception e) {
        }
    }

    public void update(String[] dadosSV) {
        try {
            ArrayList<Livro> lista = new ArrayList<>();
            for (int i = 0; i < dados.size(); i++) {
                for (int j = 0; j < dadosSV.length; j++) {
                    if (dados.get(i).getTitulo().equals(dadosSV[j])) {
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


