package modelos.utilidades;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelos.classes.Exemplar;

public class ExemplarTableModel extends AbstractTableModel {

    ArrayList<Exemplar> dados = null;
    String[] colunas = null;

    public ExemplarTableModel(String[] colunas) {
        this.dados = new ArrayList<>();
        this.colunas = colunas;
    }

    private ExemplarTableModel() {
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
                return dados.get(rowIndex).getId() + "";
            case 1:
                return dados.get(rowIndex).getLivro().getTitulo();
            case 2:
                return dados.get(rowIndex).getEdicao() + "";
            case 3:
                return dados.get(rowIndex).getDataDeAquisicao();
            case 4:
                return dados.get(rowIndex).getAnoDePublicacao();
            case 5:
                return dados.get(rowIndex).getPrecoDeCompra() + "";
            case 6:
                return dados.get(rowIndex).getDescricao();
            case 7:
                return dados.get(rowIndex).getStatusEmprestimo() + "";
            case 8:
                return dados.get(rowIndex).getTipoDeStatus() + "";
            default:
                throw new AssertionError();
        }
    }

    public void addRow(Exemplar exeplarLivro) {
        this.dados.add(exeplarLivro);
    }

    public void update(ArrayList<Exemplar> lista) {
        try {
            dados.removeAll(dados);
            lista.forEach((exemplares) -> {
                this.addRow(exemplares);
            });
            this.fireTableDataChanged();
        } catch (Exception errorAutor) {
        }
    }

    public void update(String[] dadosDoExemplar) {
        try {
            ArrayList<Exemplar> lista = new ArrayList<>();
            for (int i = 0; i < dados.size(); i++) {
                for (int j = 0; j < dadosDoExemplar.length; j++) {
                    if (dados.get(i).getLivro().getTitulo().equals(dadosDoExemplar[j])) {
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
