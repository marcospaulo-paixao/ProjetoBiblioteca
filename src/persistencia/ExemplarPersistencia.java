package persistencia;

import java.util.ArrayList;
import modelos.classes.Exemplar;
import modelos.interfaces.IcrudExemplar;

public class ExemplarPersistencia implements IcrudExemplar {

    String nomeDoArquivoNoDisco = "";

    public ExemplarPersistencia(String nomeDoArquivoNoDisco) {
        this.nomeDoArquivoNoDisco = nomeDoArquivoNoDisco;
    }

    @Override
    public void incluir(Exemplar objExemplar) throws Exception {

    }

    @Override
    public void alterar(Exemplar antigoExemplar, Exemplar atualExemplar) throws Exception {
    }

    @Override
    public void excluir(int idExemplar) throws Exception {
    }

    @Override
    public Exemplar getExemplar(String descricaoExemplar) throws Exception {
        return null;

    }

    @Override
    public ArrayList<Exemplar> listagem() throws Exception {
        return null;

    }

}
