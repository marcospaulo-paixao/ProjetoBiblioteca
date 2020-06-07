package modelos.classes;

public class Reservar {

    private int id = 0;
    private String dataDaReserva = "";
    private int periodo = 1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataDaReserva() {
        return dataDaReserva;
    }

    public void setDataDaReserva(String dataDaReserva) {
        this.dataDaReserva = dataDaReserva;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String dataDeExpiracaoReserva() {
        String datadesm[] = dataDaReserva.split("/");
        int dateAjuste = Integer.parseInt(datadesm[0]);
        dateAjuste += 1;
        datadesm[0] = dateAjuste + "";
        String datafinal = datadesm[0] + "/" + datadesm[1] + "/" + datadesm[3];
        return datafinal;
    }

    @Override
    public String toString() {
        return id + ";" + dataDaReserva + ";" + periodo + ";";
    }
}
