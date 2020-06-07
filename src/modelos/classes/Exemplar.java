package modelos.classes;

import modelos.utilidades.TipoDeStatus;
import modelos.utilidades.TipoDeStatusEmprestimoExemplar;

public class Exemplar {

    private int id = 0;
    private String anoDePublicacao = "";
    private double precoDeCompra = 0.0;
    private String dataDeAquisicao = "";
    private int edicao = 0;
    private TipoDeStatus tipoDeStatus = null;
    private TipoDeStatusEmprestimoExemplar statusEmprestimo = null;
    private String descricao = "";
    private Livro livro = null;

    public Exemplar(int id, String anoDePublicacao, double precoDeCompra, String dataDeAquisicao,
            int edicao, TipoDeStatus tipoDeStatus, TipoDeStatusEmprestimoExemplar statusEmprestimo, String descricao, Livro livro) {
        this.id = id;
        this.anoDePublicacao = anoDePublicacao;
        this.precoDeCompra = precoDeCompra;
        this.dataDeAquisicao = dataDeAquisicao;
        this.edicao = edicao;
        this.tipoDeStatus = tipoDeStatus;
        this.statusEmprestimo = statusEmprestimo;
        this.descricao = descricao;
        this.livro = new Livro(livro.getId(), livro.getCodigo(), livro.getIsbn(), livro.getTitulo(),
                livro.getEditora(), livro.getAutor(), livro.getAreaDoLivro());
    }

    public Exemplar(Exemplar objExemplar) {
        this.id = objExemplar.getId();
        this.anoDePublicacao = objExemplar.getAnoDePublicacao();
        this.precoDeCompra = objExemplar.getPrecoDeCompra();
        this.dataDeAquisicao = objExemplar.dataDeAquisicao;
        this.edicao = objExemplar.getEdicao();
        this.tipoDeStatus = objExemplar.tipoDeStatus;
        this.statusEmprestimo = objExemplar.statusEmprestimo;
        this.descricao = objExemplar.getDescricao();
        this.livro = objExemplar.getLivro();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(String anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public double getPrecoDeCompra() {
        return precoDeCompra;
    }

    public void setPrecoDeCompra(double precoDeCompra) {
        this.precoDeCompra = precoDeCompra;
    }

    public String getDataDeAquisicao() {
        return dataDeAquisicao;
    }

    public void setDataDeAquisicao(String dataDeAquisicao) {
        this.dataDeAquisicao = dataDeAquisicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public TipoDeStatusEmprestimoExemplar getStatusEmprestimo() {
        return statusEmprestimo;
    }

    public void setStatusEmprestimo(TipoDeStatusEmprestimoExemplar statusEmprestimo) {
        this.statusEmprestimo = statusEmprestimo;
    }

    public TipoDeStatus getTipoDeStatus() {
        return tipoDeStatus;
    }

    public void setTipoDeStatus(TipoDeStatus tipoDeStatus) {
        this.tipoDeStatus = tipoDeStatus;
    }

    public Livro getLivro() {
        return livro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public String toString() {
        return id + ";"
                + anoDePublicacao + ";" + precoDeCompra + ";"
                + dataDeAquisicao + ";" + edicao + ";" 
                + tipoDeStatus + ";" + statusEmprestimo + ";"
                + descricao + ";" + livro.getId() + ";";
    }

}
