package persistencia;

import modelos.classes.Editora;
import modelos.interfaces.IcrudEditora;

public class EditoraPersistencia implements IcrudEditora {

    private String nomeDoArquivoNoDisco;

    public EditoraPersistencia(String nomeDoArquivo) {
        this.nomeDoArquivoNoDisco = nomeDoArquivo;
    }

    @Override
    public void incluir(Editora editoraObjeto) throws Exception {
        System.out.println("Estou gravando no arquivo! ");
    }

}
