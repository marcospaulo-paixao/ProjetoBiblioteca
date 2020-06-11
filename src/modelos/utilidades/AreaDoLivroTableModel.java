package modelos.utilidades;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelos.classes.AreaDoLivro;

public class AreaDoLivroTableModel extends AbstractTableModel {

    ArrayList<AreaDoLivro> dados = null;
    String[] colunas = null;

    public AreaDoLivroTableModel(String[] colunas) {
        this.dados = new ArrayList<>();
        this.colunas = colunas;
    }

    private AreaDoLivroTableModel() {
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
                return dados.get(rowIndex).getDescricao();
                case 1:
                return dados.get(rowIndex).getId() + "";
            default:
                throw new AssertionError();
        }
    }

    public void addRow(AreaDoLivro areaDoLivro) {
        this.dados.add(areaDoLivro);
    }

    public void update(ArrayList<AreaDoLivro> lista) {
        try {
            dados.removeAll(dados);
            lista.forEach((areaLivro) -> {
                this.addRow(areaLivro);
            });
            this.fireTableDataChanged();
        } catch (Exception errorAreaDoLivro) {
        }
    }

    public void update(String[] dadosAreaDoLivro) {
        try {
            ArrayList<AreaDoLivro> lista = new ArrayList<>();
            for (int i = 0; i < dados.size(); i++) {
                for (int j = 0; j < dadosAreaDoLivro.length; j++) {
                    if (dados.get(i).getDescricao().equals(dadosAreaDoLivro[j])) {
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
