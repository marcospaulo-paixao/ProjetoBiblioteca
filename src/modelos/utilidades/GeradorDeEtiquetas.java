package modelos.utilidades;

import controle.ExemplarControle;
import controle.LivroControle;
import modelos.classes.Exemplar;
import modelos.interfaces.ICRUDExemplar;
import modelos.interfaces.ICRUDLivro;

public class GeradorDeEtiquetas {

    String numeroDaEtiqueta = "";
    String armario = "";
    ICRUDExemplar exemplar = new ExemplarControle("./database/exemplar.txt");
    ICRUDLivro livro = new LivroControle("./database/livro.txt");

    public GeradorDeEtiquetas(Exemplar livro, String armario) throws Exception {
        Exemplar exemplarEtiqueta = exemplar.getExemplar(livro.getId());
        this.numeroDaEtiqueta = "0." + exemplarEtiqueta.getLivro().getAreaDoLivro().getId() + " - "
                + armario + " - " + exemplarEtiqueta.getLivro().getIsbn();
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

    public ICRUDExemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(ICRUDExemplar exemplar) {
        this.exemplar = exemplar;
    }

    public ICRUDLivro getLivro() {
        return livro;
    }

    public void setLivro(ICRUDLivro livro) {
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
