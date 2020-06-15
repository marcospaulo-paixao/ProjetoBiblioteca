package modelos.utilidades;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelos.classes.Reserva;

public class ReservaTableModel extends AbstractTableModel {

    ArrayList<Reserva> dados = null;
    String[] colunas = null;

    public ReservaTableModel(String[] colunas) {
        this.dados = new ArrayList<>();
        this.colunas = colunas;
    }

    private ReservaTableModel() {
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
                return dados.get(rowIndex).getColaborador().getNome();
            case 1:
                return dados.get(rowIndex).getExemplar().getLivro().getTitulo();
            case 2:
                return dados.get(rowIndex).getExemplar().getId() + "";
            case 3:
                return dados.get(rowIndex).getDataDaReserva();
            case 4:
                return dados.get(rowIndex).getExemplar().getEdicao() + "";
            case 5:
                return dados.get(rowIndex).getPeriodo() + " Dias";
            default:
                throw new AssertionError();
        }
    }

    public void addRow(Reserva reservaLivro) {
        this.dados.add(reservaLivro);
    }

    public void update(ArrayList<Reserva> lista) {
        try {
            dados.removeAll(dados);
            lista.forEach((reserva) -> {
                this.addRow(reserva);
            });
            this.fireTableDataChanged();
        } catch (Exception errorAutor) {
        }
    }

    public void update(String[] dadosReserva) {
        try {
            ArrayList<Reserva> lista = new ArrayList<>();
            for (int i = 0; i < dados.size(); i++) {
                for (int j = 0; j < dadosReserva.length; j++) {
                    if (dados.get(i).getColaborador().getNome().equals(dadosReserva[j])) {
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
