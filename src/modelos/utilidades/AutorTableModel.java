package modelos.utilidades;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelos.classes.Autor;

public class AutorTableModel extends AbstractTableModel {

    ArrayList<Autor> dados = null;
    String[] colunas = null;

    public AutorTableModel(String[] colunas) {
        this.dados = new ArrayList<>();
        this.colunas = colunas;
    }

    private AutorTableModel() {
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
                return dados.get(rowIndex).getId() + "";
            default:
                throw new AssertionError();
        }
    }

    public void addRow(Autor autorLivro) {
        this.dados.add(autorLivro);
    }

    public void update(ArrayList<Autor> lista) {
        try {
            dados.removeAll(dados);
            lista.forEach((autorDoLivro) -> {
                this.addRow(autorDoLivro);
            });
            this.fireTableDataChanged();
        } catch (Exception errorAutor) {
        }
    }

    public void update(String[] dadosAutorDoLivro) {
        try {
            ArrayList<Autor> lista = new ArrayList<>();
            for (int i = 0; i < dados.size(); i++) {
                for (int j = 0; j < dadosAutorDoLivro.length; j++) {
                    if (dados.get(i).getNome().equals(dadosAutorDoLivro[j])) {
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
