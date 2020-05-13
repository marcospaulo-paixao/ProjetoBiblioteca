package controle;

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
    
}
