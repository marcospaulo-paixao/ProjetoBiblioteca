package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import modelos.classes.AreaDoLivro;
import modelos.interfaces.IcrudAreaDoLivro;
import modelos.utilidades.CreateServer;
import modelos.utilidades.GeradorID;

public class AreaDoLivroPersistencia implements IcrudAreaDoLivro {

    private String nomeDoArquivoNoDisco = "";

    public AreaDoLivroPersistencia(String nomeDoArquivoNoDisco) {
        this.nomeDoArquivoNoDisco = nomeDoArquivoNoDisco;
    }

    @Override
    public void incluir(AreaDoLivro areaDoLivro) throws Exception {
        try {
            GeradorID gId = new GeradorID();
            areaDoLivro.setId(gId.getID());
            gId.finalize();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            BufferedWriter bw = new BufferedWriter(fw);

            CreateServer comunicacao = new CreateServer();
            comunicacao.getComunicacao().enviarMensagem("post", areaDoLivro.getClass().getSimpleName(), areaDoLivro.toString() + "\n");
            comunicacao.getComunicacao().receberMensagem();
            comunicacao.getComunicacao().fecharConexao();

            bw.write(areaDoLivro.toString() + "\n");
            bw.close();
        } catch (Exception erroincluir) {
            throw erroincluir;
        }
    }

    @Override
    public void alterar(AreaDoLivro areaAntiga, AreaDoLivro areaAtual) throws Exception {
        try {
            ArrayList<AreaDoLivro> listaDeAutor = listagem();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);
            areaAtual.setId(areaAntiga.getId());
            for (AreaDoLivro areasDoLivro : listaDeAutor) {
                if (!areaAntiga.getDescricao().equalsIgnoreCase(areasDoLivro.getDescricao())) {
                    bw.write(areasDoLivro.toString() + "\n");
                } else {
                    bw.write(areaAtual.toString() + "\n");
                }
            }
            bw.close();
        } catch (Exception erroAreaAlterar) {
            throw erroAreaAlterar;
        }
    }

    @Override
    public void excluir(String descricao) throws Exception {
        try {
            ArrayList<AreaDoLivro> listaAreaDoLivro = listagem();
            FileWriter fr = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter br = new BufferedWriter(fr);

            for (int pos = 0; pos < listaAreaDoLivro.size(); pos++) {
                AreaDoLivro aux = listaAreaDoLivro.get(pos);

                if (!descricao.equalsIgnoreCase(aux.getDescricao())) {
                    br.write(aux.toString() + "\n");
                }
            }
            br.close();
        } catch (FileNotFoundException other) {
            throw other;
        }
    }

    @Override
    public AreaDoLivro getDescricaoLivro(String descricao) throws Exception {
        try {
            ArrayList<AreaDoLivro> AreasDosLivros = listagem();
            for (AreaDoLivro AreaDoLivroNaLista : AreasDosLivros) {
                if (descricao.equalsIgnoreCase(AreaDoLivroNaLista.getDescricao())) {
                    return AreaDoLivroNaLista;
                }
            }
        } catch (Exception ErroListarAreaDoLivroNaLista) {
            throw ErroListarAreaDoLivroNaLista;
        }
        return null;
    }

    @Override
    public ArrayList<AreaDoLivro> listagem() throws Exception {
        try {
            AreaDoLivro areasInternas = null;
            ArrayList<AreaDoLivro> listaAreaDosLivros = new ArrayList<>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);

            String linha = "";
            while ((linha = br.readLine()) != null) {
                String[] vetor = linha.split(";");
                int id = Integer.parseInt(vetor[0]);
                String descricao = vetor[1];
                areasInternas = new AreaDoLivro(id, descricao);
                listaAreaDosLivros.add(areasInternas);
            }
            return listaAreaDosLivros;
        } catch (Exception erroConsultalistaAreaDosLivros) {
            throw erroConsultalistaAreaDosLivros;
        }
    }

    @Override
    public AreaDoLivro getIdLivro(int idArea) throws Exception {
        ArrayList<AreaDoLivro> AreasDosLivros = listagem();
        try {
            for (AreaDoLivro AreaDoLivroNaLista : AreasDosLivros) {
                if (AreaDoLivroNaLista.getId() == idArea) {
                    return AreaDoLivroNaLista;
                }
            }
        } catch (Exception ErroListarAreaDoLivroNaLista) {
            throw ErroListarAreaDoLivroNaLista;
        }
        return null;
    }
}
