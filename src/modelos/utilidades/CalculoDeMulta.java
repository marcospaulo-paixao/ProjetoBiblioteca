package modelos.utilidades;

import java.util.Calendar;
import java.util.Date;

public class CalculoDeMulta {

    private double taxaPorAtraso = 0.0;
    private int periodoDeEmprestimo = 0;

    public CalculoDeMulta(double taxa, int periodo) {
        this.taxaPorAtraso = taxa;
        this.periodoDeEmprestimo = periodo;
    }

    public CalculoDeMulta() {
    }

    public double getTavaPorAtraso() {
        return taxaPorAtraso;
    }

    public void setTavaPorAtraso(double tavaPorAtraso) {
        this.taxaPorAtraso = tavaPorAtraso;
    }

    public int getPeriodoDeEmprestimo() {
        return periodoDeEmprestimo;
    }

    public void setPeriodoDeEmprestimo(int periodoDeEmprestimo) {
        this.periodoDeEmprestimo = periodoDeEmprestimo;
    }

    public double taxaPorAtraso(Date dataEmprestimo) {
        Date dataDevolucao = new Date();

        Date dataPrevistaDeDevolucao = dataEmprestimo;
        Calendar calDev = Calendar.getInstance();
        calDev.setTime(dataPrevistaDeDevolucao);
        calDev.add(Calendar.DATE, this.periodoDeEmprestimo);
        dataPrevistaDeDevolucao = calDev.getTime();
        int diaProjetado = calDev.get(Calendar.DATE);

        Calendar devReal = Calendar.getInstance();
        devReal.setTime(dataDevolucao);
        int diaRealDeDevolucao = devReal.get(Calendar.DATE);

        double multa = (diaRealDeDevolucao - diaProjetado) * this.taxaPorAtraso;
        return multa;
    }

    public double diasParaReserva(Date dataEmprestimo, Date dataDevolucao) {

        Calendar calDev = Calendar.getInstance();
        calDev.setTime(dataDevolucao);

        int diaProjetado = calDev.get(Calendar.DATE);

        Calendar empres = Calendar.getInstance();
        empres.setTime(dataEmprestimo);
        int diaRealDeDevolucao = empres.get(Calendar.DATE);

        int dataDias = (diaRealDeDevolucao - diaProjetado) - 5;
        return dataDias;
    }
}
