package controle;

import java.util.ArrayList;
import modelos.classes.Editora;
import modelos.interfaces.IcrudEditora;
import persistencia.EditoraPersistencia;

public class EditoraControle implements IcrudEditora {

    private IcrudEditora objEditora = null;

    public EditoraControle(String nomeDoArquivoNoDisco) {
        objEditora = new EditoraPersistencia(nomeDoArquivoNoDisco);
    }

    public IcrudEditora getObjEditora() {
        return objEditora;
    }

    public void setObjEditora(IcrudEditora objEditora) {
        this.objEditora = objEditora;
    }

    @Override
    public void incluir(Editora editoraObjeto) throws Exception {
        try {
            objEditora.incluir(editoraObjeto);
        } catch (Exception erroEditora) {
            throw erroEditora;
        }
    }

    @Override
    public void alterar(Editora antigoEditora, Editora atualEditora) throws Exception {
        try {
            objEditora.alterar(antigoEditora, atualEditora);
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public ArrayList<Editora> listagem() throws Exception {
        try {
            return objEditora.listagem();
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public void excluir(String nome) throws Exception {
        try {
            objEditora.excluir(nome);
        } catch (Exception errorExcluirEditora) {
            throw errorExcluirEditora;
        }
    }

    @Override
    public Editora getEditoraNome(String nomeEditora) throws Exception {
        try {
            return objEditora.getEditoraNome(nomeEditora);
        } catch (Exception erroEditora) {
            throw erroEditora;
        }
    }
}
