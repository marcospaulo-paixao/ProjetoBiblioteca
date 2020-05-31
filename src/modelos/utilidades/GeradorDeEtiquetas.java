package modelos.utilidades;

import modelos.classes.Livro;

public class GeradorDeEtiquetas {

    String numeroDaEtiqueta = "";
    String armario = "";
    Livro livro = null;

    public GeradorDeEtiquetas(Livro livro, String numeroDaEtiqueta, String armario) {
        this.numeroDaEtiqueta = livro.getCodigo() + "." + armario;
    }

    public GeradorDeEtiquetas(GeradorDeEtiquetas obj) {
        this.numeroDaEtiqueta = obj.livro.getCodigo() + "." + obj.armario;
    }

    public GeradorDeEtiquetas(String codigoDoLivro, String armario) {
        this.numeroDaEtiqueta = codigoDoLivro + "." + armario;
    }

    public String getNumeroDaEtiqueta() {
        return numeroDaEtiqueta;
    }

    public void setNumeroDaEtiqueta(String numeroDaEtiqueta) {
        this.numeroDaEtiqueta = numeroDaEtiqueta;
    }

    public String getArmario() {
        return armario;
    }

    public void setArmario(String armario) {
        this.armario = armario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public String toString() {
        return this.numeroDaEtiqueta;
    }

}
