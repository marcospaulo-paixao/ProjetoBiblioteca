package controle;

import java.util.ArrayList;
import modelos.classes.Editora;
import modelos.interfaces.IcrudEditora;
import persistencia.EditoraPersistencia;

public class EditoraControle implements IcrudEditora {
    
    private IcrudEditora objEditora = null;
    
    public EditoraControle() {
        objEditora = new EditoraPersistencia("Nome");
    }
    
    @Override
    public void incluir(Editora editoraObjeto) throws Exception {
        this.objEditora.incluir(editoraObjeto);
    }

    @Override
    public void alterar(Editora antigoEditora, Editora atualEditora) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Editora> listagem() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
