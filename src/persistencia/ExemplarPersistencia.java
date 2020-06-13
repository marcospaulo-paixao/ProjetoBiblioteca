package persistencia;

import controle.LivroControle;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import modelos.classes.Exemplar;
import modelos.classes.Livro;
import modelos.interfaces.IcrudExemplar;
import modelos.interfaces.IcrudLivro;
import modelos.utilidades.CreateServer;
import modelos.utilidades.GeradorID;
import modelos.utilidades.TipoDeStatus;
import modelos.utilidades.TipoDeStatusEmprestimoExemplar;

public class ExemplarPersistencia implements IcrudExemplar {

    IcrudLivro livro = new LivroControle("livro.txt");
    String nomeDoArquivoNoDisco = null;

    public ExemplarPersistencia(String nomeDoArquivoNoDisco) {
        this.nomeDoArquivoNoDisco = nomeDoArquivoNoDisco;
    }

    @Override
    public void incluir(Exemplar objExemplar) throws Exception {
        try {
            GeradorID gId = new GeradorID();
            objExemplar.setId(gId.getID());
            gId.finalize();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            BufferedWriter bw = new BufferedWriter(fw);
            try {
                CreateServer comunicacao = new CreateServer();
                comunicacao.getComunicacao().enviarMensagem("post", objExemplar.getClass().getSimpleName(), objExemplar.toString() + "\n");
                comunicacao.getComunicacao().receberMensagem();
                comunicacao.getComunicacao().fecharConexao();
            } catch (Exception e) {
                bw.write(objExemplar.toString() + "\n");
            } finally {
                bw.close();
            }
        } catch (Exception erroIncluir) {
            throw erroIncluir;
        }
    }

    @Override
    public void alterar(Exemplar antigoExemplar, Exemplar atualExemplar) throws Exception {
        try {
            ArrayList<Exemplar> listaExemplar = listagem();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);
            atualExemplar.setId(antigoExemplar.getId());
            for (Exemplar exemplares : listaExemplar) {
                if (exemplares.getId() != antigoExemplar.getId()) {
                    bw.write(exemplares.toString() + "\n");
                } else {
                    bw.write(atualExemplar.toString() + "\n");
                }
            }
            bw.close();
        } catch (Exception erroLivroAlterar) {
            throw erroLivroAlterar;
        }
    }

    @Override
    public void excluir(int idExemplar) throws Exception {
        try {
            ArrayList<Exemplar> listaDeExemplares = listagem();
            FileWriter fr = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter br = new BufferedWriter(fr);

            for (int pos = 0; pos < listaDeExemplares.size(); pos++) {
                Exemplar aux = listaDeExemplares.get(pos);

                if (idExemplar != aux.getId()) {
                    br.write(aux.toString() + "\n");
                }
            }
            br.close();
        } catch (FileNotFoundException other) {
            throw other;
        }
    }

    @Override
    public Exemplar getExemplar(int idExemplar) throws Exception {
        try {
            ArrayList<Exemplar> exemplaresLista = listagem();
            for (Exemplar exemplaresNaLista : exemplaresLista) {
                if (exemplaresNaLista.getId() == idExemplar) {
                    return exemplaresNaLista;
                }
            }
        } catch (Exception ErroListarNomeLivro) {
            throw ErroListarNomeLivro;
        }
        return null;

    }

    @Override
    public ArrayList<Exemplar> listagem() throws Exception {
        try {
            ArrayList<Exemplar> listaDeExemplar = new ArrayList();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);

            String linha = "";
            while ((linha = br.readLine()) != null) {
                String[] vetor = linha.split(";");
                int id = Integer.parseInt(vetor[0]);
                String anoDePublicacoa = vetor[1];
                double preco = Double.parseDouble(vetor[2]);
                String dataDeAquisicao = vetor[3];
                int edicao = Integer.parseInt(vetor[4]);
                TipoDeStatus status = TipoDeStatus.valueOf(vetor[5]);
                TipoDeStatusEmprestimoExemplar statusEmprestimoExemplar = TipoDeStatusEmprestimoExemplar.valueOf(vetor[6]);
                String descricao = vetor[7];
                Livro livroListado = livro.getIdDoLivro(Integer.parseInt(vetor[8]));

                listaDeExemplar.add(new Exemplar(id, anoDePublicacoa, preco, dataDeAquisicao, edicao, status, statusEmprestimoExemplar, descricao, livroListado));
            }
            return listaDeExemplar;
        } catch (Exception listarLivros) {
            throw new Exception("Erro no controlador" + listarLivros.getMessage());
        }
    }
}
