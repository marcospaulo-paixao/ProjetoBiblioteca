package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import modelos.classes.Editora;
import modelos.interfaces.IcrudEditora;
import modelos.utilidades.GeradorID;

public class EditoraPersistencia implements IcrudEditora {

    private String nomeDoArquivoNoDisco;

    public EditoraPersistencia(String nomeDoArquivo) {
        this.nomeDoArquivoNoDisco = nomeDoArquivo;
    }

    @Override
    public void incluir(Editora editoraObjeto) throws Exception {
        try {
            GeradorID gId = new GeradorID();
            editoraObjeto.setId(gId.getID());
            gId.finalize();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(editoraObjeto.toString() + "\n");
            bw.close();
        } catch (IOException errorEditora) {
            throw errorEditora;
        }
    }

    @Override
    public void alterar(Editora antigoEditora, Editora atualEditora) throws Exception {
        try {

            ArrayList<Editora> listaDeAutores = listagem();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Editora editora : listaDeAutores) {
                if (editora.getId() != antigoEditora.getId()) {
                    bw.write(editora.toString() + "\n");
                } else {
                    bw.write(atualEditora.toString() + "\n");
                }
            }
            bw.close();
        } catch (Exception erroEditoraAlterar) {
            throw erroEditoraAlterar;
        }
    }

    @Override
    public ArrayList<Editora> listagem() throws Exception {
        try {
            ArrayList<Editora> listaDeEditoras = new ArrayList<>();

            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);

            String linha = "";
            while ((linha = br.readLine()) != null) {
                String[] vetor = linha.split(";");
                int id = Integer.parseInt(vetor[0]);
                String nome = vetor[1];
                String descricao = vetor[2];
                Editora editoraLis = new Editora(id, nome, descricao);
                listaDeEditoras.add(editoraLis);
            }
            return listaDeEditoras;
        } catch (Exception erroConsultaAutor) {
            throw erroConsultaAutor;
        }
    }

}
