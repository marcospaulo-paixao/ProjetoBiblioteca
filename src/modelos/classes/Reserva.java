package modelos.classes;

import java.text.SimpleDateFormat;

public class Reserva {

    SimpleDateFormat sd = new SimpleDateFormat("dd/mm/yyyy");
    private int id = 0;
    private String dataDaReserva = null;
    private int periodo = 1;
    private Exemplar exemplar = null;
    private Colaborador colaborador = null;

    public Reserva(int id, String dataDaReserva, int periodo, Exemplar exemplar, Colaborador colaborador) {
        this.id = id;
        this.dataDaReserva = dataDaReserva;
        this.periodo = 1;
        this.exemplar = new Exemplar(exemplar.getId(), exemplar.getAnoDePublicacao(), exemplar.getPrecoDeCompra(),
                exemplar.getDataDeAquisicao(), exemplar.getEdicao(), exemplar.getTipoDeStatus(), exemplar.getStatusEmprestimo(),
                exemplar.getStatusReserva(), exemplar.getDescricao(), exemplar.getLivro());
        this.colaborador = new Colaborador(colaborador);
    }

    public Reserva(Reserva reserva) {
        this.id = reserva.getId();
        this.dataDaReserva = reserva.getDataDaReserva();
        this.periodo = reserva.getPeriodo();
        this.exemplar = reserva.getExemplar();
        this.colaborador = reserva.getColaborador();
    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPeriodo() {
        return periodo;
    }

    public String getDataDaReserva() {
        return dataDaReserva;
    }

    public void setDataDaReserva(String dataDaReserva) {
        this.dataDaReserva = dataDaReserva;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return id + ";" + dataDaReserva + ";" + periodo + ";"
                + exemplar.getId() + ";" + colaborador.getNome() + ";";
    }
}
