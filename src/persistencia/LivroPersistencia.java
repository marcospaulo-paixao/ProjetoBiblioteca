package persistencia;

import controle.AreaDoLivroControle;
import controle.AutorControle;
import controle.EditoraControle;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import modelos.classes.AreaDoLivro;
import modelos.classes.Autor;
import modelos.classes.Editora;
import modelos.classes.Livro;
import modelos.interfaces.IcrudAreaDoLivro;
import modelos.interfaces.IcrudAutor;
import modelos.interfaces.IcrudEditora;
import modelos.interfaces.IcrudLivro;
import modelos.utilidades.CreateServer;
import modelos.utilidades.GeradorID;

public class LivroPersistencia implements IcrudLivro {

    IcrudAutor autor = new AutorControle("autor.txt");
    IcrudEditora editora = new EditoraControle("editora.txt");
    IcrudAreaDoLivro areaDoLivro = new AreaDoLivroControle("areaDoLivro.txt");

    String nomeDoArquivoNoDisco = "";

    public LivroPersistencia(String nomeDoArquivoNoDisco) {
        this.nomeDoArquivoNoDisco = nomeDoArquivoNoDisco;
    }

    public String getNomeDoArquivo() {
        return nomeDoArquivoNoDisco;
    }

    @Override
    public void incluir(Livro livro) throws Exception {
        try {
            GeradorID gId = new GeradorID();
            livro.setId(gId.getID());
            gId.finalize();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            CreateServer comunicacao = new CreateServer();
            comunicacao.getComunicacao().enviarMensagem(livro.getClass().getSimpleName(), livro.toString() + "\n");
            comunicacao.getComunicacao().receberMensagem();
            comunicacao.getComunicacao().fecharConexao();
            
            bw.write(livro.toString() + "\n");
            bw.close();
        } catch (Exception erroIncluir) {
            throw erroIncluir;
        }
    }

    @Override
    public void alterar(Livro antigoLivro, Livro novoLivro) throws Exception {
        try {
            ArrayList<Livro> listaLivros = listagem();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);
            novoLivro.setId(antigoLivro.getId());
            for (Livro livros : listaLivros) {
                if (!antigoLivro.getTitulo().equalsIgnoreCase(livros.getTitulo())) {
                    bw.write(livros.toString() + "\n");
                } else {
                    bw.write(novoLivro.toString() + "\n");
                }
            }
            bw.close();
        } catch (Exception erroLivroAlterar) {
            throw erroLivroAlterar;
        }
    }

    @Override
    public void excluir(String titulo) throws Exception {
        try {
            ArrayList<Livro> listaLivro = listagem();
            FileWriter fr = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter br = new BufferedWriter(fr);

            for (int pos = 0; pos < listaLivro.size(); pos++) {
                Livro aux = listaLivro.get(pos);

                if (!titulo.equalsIgnoreCase(aux.getTitulo())) {
                    br.write(aux.toString() + "\n");
                }
            }
            br.close();
        } catch (FileNotFoundException other) {
            throw other;
        }
    }

    @Override
    public Livro getTituloLivro(String tituloLivro) throws Exception {
        try {
            ArrayList<Livro> livrosLista = listagem();
            for (Livro livrosNaLista : livrosLista) {
                if (livrosNaLista.getTitulo().equalsIgnoreCase(tituloLivro)) {
                    return (Livro) livrosNaLista;
                }
            }
        } catch (Exception ErroListarNomeLivro) {
            throw ErroListarNomeLivro;
        }
        return null;
    }

    @Override
    public ArrayList<Livro> listagem() throws Exception {
        try {
            ArrayList<Livro> listaDeLivros = new ArrayList();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);

            String linha = "";
            while ((linha = br.readLine()) != null) {
                String[] vetor = linha.split(";");
                int id = Integer.parseInt(vetor[0]);
                int codigo = Integer.parseInt(vetor[1]);
                String isbn = "" + vetor[2];
                String titulo = vetor[3];
                Editora editoraIncluir = editora.getEditoraId(Integer.parseInt(vetor[4]));
                Autor autorIncluir = autor.getIdAutor(Integer.parseInt(vetor[5]));
                AreaDoLivro areaIncluir = areaDoLivro.getIdLivro(Integer.parseInt(vetor[6]));
                listaDeLivros.add(new Livro(id, codigo, isbn, titulo, editoraIncluir, autorIncluir, areaIncluir));
            }
            return listaDeLivros;
        } catch (Exception listarLivros) {
            throw listarLivros;
        }
    }

    @Override
    public Livro getIdDoLivro(int iLivro) throws Exception {
        ArrayList<Livro> livros = listagem();
        for (Livro livrosNaLista : livros) {
            if (livrosNaLista.getId() == iLivro) {
                return livrosNaLista;
            }
        }
        return null;

    }

}
