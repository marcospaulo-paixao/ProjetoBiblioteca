package controle;

import java.util.ArrayList;
import modelos.classes.Exemplar;
import modelos.interfaces.IcrudExemplar;
import persistencia.ExemplarPersistencia;

public class ExemplarControle implements IcrudExemplar {

    private IcrudExemplar exemplar = null;

    public ExemplarControle(String nomeDoArquivoNoDisco) {
        this.exemplar = new ExemplarPersistencia(nomeDoArquivoNoDisco);
    }

    @Override
    public void incluir(Exemplar objExemplar) throws Exception {
        try {
            exemplar.incluir(objExemplar);
        } catch (Exception erroExemplar) {
            throw erroExemplar;
        }
    }

    @Override
    public void alterar(Exemplar antigoExemplar, Exemplar atualExemplar) throws Exception {
        try {
            exemplar.alterar(antigoExemplar, atualExemplar);
        } catch (Exception erroAlterar) {
            throw erroAlterar;
        }
    }

    @Override
    public void excluir(int idExemplar) throws Exception {
        try {
            exemplar.excluir(idExemplar);
        } catch (Exception erroExcluir) {
            throw erroExcluir;
        }
    }

    @Override
    public Exemplar getExemplar(int idExemplar) throws Exception {
        try {
            return exemplar.getExemplar(idExemplar);
        } catch (Exception erroGetDes) {
            throw erroGetDes;
        }
    }

    @Override
    public ArrayList<Exemplar> listagem() throws Exception {
        try {
            return exemplar.listagem();
        } catch (Exception erroListagem) {
            throw erroListagem;
        }
    }

}
