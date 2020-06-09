package controle;

import java.util.ArrayList;
import modelos.classes.AreaDoLivro;
import modelos.interfaces.IcrudAreaDoLivro;
import persistencia.AreaDoLivroPersistencia;

public class AreaDoLivroControle implements IcrudAreaDoLivro {

    IcrudAreaDoLivro areaDoLivro = null;

    public AreaDoLivroControle(String caminhoDoArquivo) {
        areaDoLivro = new AreaDoLivroPersistencia(caminhoDoArquivo);
    }

    public IcrudAreaDoLivro getAreaDoLivro() {
        return areaDoLivro;
    }

    public void setAreaDoLivro(IcrudAreaDoLivro areaDoLivro) {
        this.areaDoLivro = areaDoLivro;
    }

    @Override
    public void incluir(AreaDoLivro areaLivro) throws Exception {
        try {
            areaDoLivro.incluir(areaLivro);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void alterar(AreaDoLivro areaAntiga, AreaDoLivro areaAtual) throws Exception {
        try {
            areaDoLivro.alterar(areaAntiga, areaAtual);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void excluir(String descricao) throws Exception {
        try {
            areaDoLivro.excluir(descricao);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public AreaDoLivro getDescricaoLivro(String descricao) throws Exception {
        try {
            return areaDoLivro.getDescricaoLivro(descricao);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public ArrayList<AreaDoLivro> listagem() throws Exception {
        try {
            return areaDoLivro.listagem();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public AreaDoLivro getIdLivro(int idArea) throws Exception {
        try {
            return areaDoLivro.getIdLivro(idArea);
        } catch (Exception e) {
            throw e;
        }
    }
}
