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
import modelos.utilidades.GeradorID;
import modelos.utilidades.TipoDeStatus;

public class ExemplarPersistencia implements IcrudExemplar {

    IcrudLivro livro = new LivroControle("livro.txt");
    String nomeDoArquivoNoDisco;

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
            bw.write(objExemplar.toString() + "\n");
            bw.close();
        } catch (Exception erroIncluir) {
            throw erroIncluir;
        }
    }

    @Override
    public void alterar(Exemplar antigoExemplar, Exemplar atualExemplar) throws Exception {
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
    public Exemplar getExemplar(String descricaoExemplar) throws Exception {
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
                String anoDePublicacao = vetor[1];
                double preco = Double.parseDouble(vetor[2]);
                String dataDeAquisicao = vetor[3];
                int edicao = Integer.parseInt(vetor[4]);
                String descricao = vetor[6];
                TipoDeStatus status = (vetor[5].equals("Ativo") ? TipoDeStatus.ATIVO : TipoDeStatus.INATIVO);
                Livro livroListagem = livro.getIdDoLivro(Integer.parseInt(vetor[7]));

                listaDeExemplar.add(new Exemplar(id, anoDePublicacao, preco, dataDeAquisicao, edicao, status, descricao, livroListagem));
            }
            return listaDeExemplar;
        } catch (Exception listarLivros) {
            throw listarLivros;
        }
    }
}
