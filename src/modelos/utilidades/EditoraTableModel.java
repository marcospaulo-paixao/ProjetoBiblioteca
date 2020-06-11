
package modelos.utilidades;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelos.classes.Editora;


public class EditoraTableModel extends AbstractTableModel{


    ArrayList<Editora> dados = null;
    String[] colunas = null;

    public EditoraTableModel(String[] colunas) {
        this.dados = new ArrayList<>();
        this.colunas = colunas;
    }

    private EditoraTableModel() {
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
                return dados.get(rowIndex).getNome();
            case 1:
                return dados.get(rowIndex).getDescricao()+"";                        
            default:
                throw new AssertionError();
        }
    }

    public void addRow(Editora editora) {
        this.dados.add(editora);
    }

    public void update(ArrayList<Editora> lista) {
        try {
            dados.removeAll(dados);
            lista.forEach((editora) -> {
                this.addRow(editora);
            });
            this.fireTableDataChanged();
        } catch (Exception errorEditora) {
        }
    }

    public void update(String[] dadosEditoraListada) {
        try {
            ArrayList<Editora> lista = new ArrayList<>();
            for (int i = 0; i < dados.size(); i++) {
                for (int j = 0; j < dadosEditoraListada.length; j++) {
                    if (dados.get(i).getNome().equals(dadosEditoraListada[j])) {
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


