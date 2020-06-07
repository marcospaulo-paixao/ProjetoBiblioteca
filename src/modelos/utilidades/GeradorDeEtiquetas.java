package modelos.utilidades;

import controle.ExemplarControle;
import controle.LivroControle;
import modelos.classes.Exemplar;
import modelos.interfaces.IcrudExemplar;
import modelos.interfaces.IcrudLivro;

public class GeradorDeEtiquetas {

    String numeroDaEtiqueta = "";
    String armario = "";
    IcrudExemplar exemplar = new ExemplarControle("exemplar.txt");
    IcrudLivro livro = new LivroControle("livro.txt");

    public GeradorDeEtiquetas(Exemplar livro, String armario) throws Exception {
        Exemplar exemplarEtiqueta = exemplar.getExemplar(livro.getId());
        this.numeroDaEtiqueta = "0." + livro.getId() + " - " + exemplarEtiqueta.getLivro().getAreaDoLivro().getId() + " - "
                + armario + " - " + exemplarEtiqueta.getLivro().getIsbn() + " - " + exemplarEtiqueta.getEdicao();
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

    public IcrudExemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(IcrudExemplar exemplar) {
        this.exemplar = exemplar;
    }

    public IcrudLivro getLivro() {
        return livro;
    }

    public void setLivro(IcrudLivro livro) {
        this.livro = livro;
    }

    @Override
    public String toString() {
        return "\n\n\n\n"
                + "+--------------------------------------------------------------------+\n"
                + "|      " + numeroDaEtiqueta + "                                |\n"
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
