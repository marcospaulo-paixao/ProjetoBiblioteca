/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.utilidades;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelos.classes.Usuario;

/**
 *
 * @author marcos
 */
public class UsuarioTableModel extends AbstractTableModel {

    /**
     * #Atributos
     */
    ArrayList<Usuario> dados = null;
    String[] colunas = null;

    /**
     * #Métodos
     */
    /**
     *
     * @param colunas
     */
    public UsuarioTableModel(String[] colunas) {
        this.colunas = colunas;
        this.dados = new ArrayList<>();
    }

    /**
     *
     * @param column
     * @return
     */
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    /**
     *
     * @return dados.size()
     */
    @Override
    public int getRowCount() {
        return dados.size();
    }

    /**
     *
     * @return colunas.length
     */
    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    /**
     *
     * @param rowIndex
     * @param columnIndex
     * @return
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return dados.get(rowIndex).getNomeDoUsuario();
            case 1:
                return dados.get(rowIndex).getLogin();
            case 2:
                return dados.get(rowIndex).getStatus();
            default:
                throw new AssertionError();
        }
    }

    public void addRow(Usuario usuario) {
        dados.add(usuario);
    }

    public void update(ArrayList<Usuario> listaDeUsuarios) {
        dados.removeAll(dados);
        for (Usuario usuario : listaDeUsuarios) {
            dados.add(usuario);
        }
        this.fireTableDataChanged();
    }

}
