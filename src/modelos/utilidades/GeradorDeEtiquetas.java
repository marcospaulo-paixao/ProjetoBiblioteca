package modelos.utilidades;

public class GeradorDeEtiquetas {

    int id = 0;
    String areaDoLivro = null;
    String edicaoDoLivro = null;
    long localizacaoNaEstante = 0;
    String anoDeEdicao = null;

    public GeradorDeEtiquetas(int id, String areaDoLivro, String edicaoDoLivro, long localizacaoNaEstante, String anoDeEdicao) {
        this.id = id;
        this.areaDoLivro = areaDoLivro;
        this.edicaoDoLivro = edicaoDoLivro;
        this.localizacaoNaEstante = localizacaoNaEstante;
        this.anoDeEdicao = anoDeEdicao;
    }

    public GeradorDeEtiquetas(GeradorDeEtiquetas obj) {
        this.id = obj.getId();
        this.areaDoLivro = obj.getAreaDoLivro();
        this.edicaoDoLivro = obj.getEdicaoDoLivro();
        this.localizacaoNaEstante = obj.getLocalizacaoNaEstante();
        this.anoDeEdicao = obj.getAnoDeEdicao();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAreaDoLivro() {
        return areaDoLivro;
    }

    public void setAreaDoLivro(String areaDoLivro) {
        this.areaDoLivro = areaDoLivro;
    }

    public String getEdicaoDoLivro() {
        return edicaoDoLivro;
    }

    public void setEdicaoDoLivro(String edicaoDoLivro) {
        this.edicaoDoLivro = edicaoDoLivro;
    }

    public long getLocalizacaoNaEstante() {
        return localizacaoNaEstante;
    }

    public void setLocalizacaoNaEstante(long localizacaoNaEstante) {
        this.localizacaoNaEstante = localizacaoNaEstante;
    }

    public String getAnoDeEdicao() {
        return anoDeEdicao;
    }

    public void setAnoDeEdicao(String anoDeEdicao) {
        this.anoDeEdicao = anoDeEdicao;
    }

    @Override
    public String toString() {
        return id + ";" + areaDoLivro + ";" + edicaoDoLivro + ";"
                + localizacaoNaEstante + ";" + anoDeEdicao;
    }
}