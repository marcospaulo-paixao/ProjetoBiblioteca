package modelos.classes;

public class Emprestimo {

    private int id = 0;
    private Colaborador colaborador = null;
    private Exemplar exemplar = null;
    private String dataDoEmprestimo = "";
    private String dataDeDevolucao = "";

    public Emprestimo(Colaborador colaborador, Exemplar exemplar) {
        this.colaborador = colaborador;
        this.exemplar = exemplar;
    }

    public Emprestimo(String linha) {
        String[] vetor = linha.split(";");
        id = Integer.parseInt(vetor[0]);
        exemplar = null;
        colaborador = null;
        dataDoEmprestimo = vetor[3];
        dataDeDevolucao = vetor[4];

    }

    @Override
    public String toString() {
        String saida = id + ";";
        saida += colaborador.getId() + ";";
        saida += exemplar.getId() + ";";
        saida += dataDoEmprestimo + ";";
        saida += dataDeDevolucao + ";";
        return saida;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the dataDoEmprestimo
     */
    public String getDataDoEmprestimo() {
        return dataDoEmprestimo;
    }

    /**
     * @param dataDoEmprestimo the dataDoEmprestimo to set
     */
    public void setDataDoEmprestimo(String dataDoEmprestimo) {
        this.dataDoEmprestimo = dataDoEmprestimo;
    }

    /**
     * @return the dataDeDevolucao
     */
    public String getDataDeDevolucao() {
        return dataDeDevolucao;
    }

    /**
     * @param dataDeDevolucao the dataDeDevolucao to set
     */
    public void setDataDeDevolucao(String dataDeDevolucao) {
        this.dataDeDevolucao = dataDeDevolucao;
    }

    /**
     * @return the exemplar
     */
    public Exemplar getExemplar() {
        return exemplar;
    }

    /**
     * @param exemplar the exemplar to set
     */
    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

    /**
     * @return the colaborador
     */
    public Colaborador getColaborador() {
        return colaborador;
    }

    /**
     * @param colaborador the colaborador to set
     */
    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

}
