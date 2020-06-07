package modelos.utilidades;

import modelos.classes.Exemplar;
import modelos.classes.Livro;

public class GeradorDeEtiquetas {

    String numeroDaEtiqueta = "";
    String armario = "";
    Exemplar exemplar = null;
    Livro livro = null;

    public GeradorDeEtiquetas(Livro livro, String armario) {
        this.numeroDaEtiqueta = "00" + exemplar.getLivro().getAreaDoLivro().getId() + "-"
                + armario + "-" + exemplar.getLivro().getIsbn().toString() + exemplar.getEdicao();
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
        return "\n\n\n\n"
                + "+--------------------------------------------------------------------+\n"
                + "|      " + this.numeroDaEtiqueta + "                                 |\n"
                + "+--------------------------------------------------------------------+";
    }

}

/*
Área de conhecimento-000 ok
Edição do livro-111
Localização estante-222 ok
Ano de edição-33333333
ID livro - 4444 ok
ISBN - 12121 OK
numeração final exemplo = 000-111-222-33333333-4444 - 12121

 */
