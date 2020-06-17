package modelos.classes;

import java.util.Objects;
import modelos.utilidades.enums.StatusReserva;
import modelos.utilidades.enums.TipoDeStatus;
import modelos.utilidades.enums.TipoDeStatusEmprestimoExemplar;

public class Exemplar {

    private int id = 0;
    private String anoDePublicacao = "";
    private double precoDeCompra = 0.0;
    private String dataDeAquisicao = "";
    private int edicao = 0;
    private TipoDeStatus tipoDeStatus = null;
    private TipoDeStatusEmprestimoExemplar statusEmprestimo = null;
    private StatusReserva statusReserva =  null;
    private String descricao = "";
    private Livro livro = null;

    public Exemplar(int id, String anoDePublicacao, double precoDeCompra, String dataDeAquisicao,
            int edicao, TipoDeStatus tipoDeStatus, TipoDeStatusEmprestimoExemplar statusEmprestimo, StatusReserva statusReserva, String descricao, Livro livro) {
        this.id = id;
        this.anoDePublicacao = anoDePublicacao;
        this.precoDeCompra = precoDeCompra;
        this.dataDeAquisicao = dataDeAquisicao;
        this.edicao = edicao;
        this.tipoDeStatus = tipoDeStatus;
        this.statusEmprestimo = statusEmprestimo;
        this.statusReserva = statusReserva;
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
        this.statusReserva = objExemplar.getStatusReserva();
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

    public StatusReserva getStatusReserva() {
        return statusReserva;
    }

    public void setStatusReserva(StatusReserva statusReserva) {
        this.statusReserva = statusReserva;
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
                + statusReserva + ";" + descricao + ";" + livro.getId() + ";";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.anoDePublicacao);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.precoDeCompra) ^ (Double.doubleToLongBits(this.precoDeCompra) >>> 32));
        hash = 67 * hash + Objects.hashCode(this.dataDeAquisicao);
        hash = 67 * hash + this.edicao;
        hash = 67 * hash + Objects.hashCode(this.tipoDeStatus);
        hash = 67 * hash + Objects.hashCode(this.statusEmprestimo);
        hash = 67 * hash + Objects.hashCode(this.descricao);
        hash = 67 * hash + Objects.hashCode(this.livro);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Exemplar other = (Exemplar) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.precoDeCompra) != Double.doubleToLongBits(other.precoDeCompra)) {
            return false;
        }
        if (this.edicao != other.edicao) {
            return false;
        }
        if (!Objects.equals(this.anoDePublicacao, other.anoDePublicacao)) {
            return false;
        }
        if (!Objects.equals(this.dataDeAquisicao, other.dataDeAquisicao)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (this.tipoDeStatus != other.tipoDeStatus) {
            return false;
        }
        if (this.statusEmprestimo != other.statusEmprestimo) {
            return false;
        }
        if (!Objects.equals(this.livro, other.livro)) {
            return false;
        }
        return true;
    }

}
