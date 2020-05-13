package modelos.utilidades;

<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author eugeniojulio
 */
public class GeradorID {
    private int id = 0;
    String nomeDoArquivo ="IdGerado.txt";
    public GeradorID() throws FileNotFoundException, IOException{
        FileReader fr = new FileReader(nomeDoArquivo);
        BufferedReader br  = new BufferedReader(fr);
        String linha=br.readLine();
        id = Integer.parseInt(linha);
        br.close();
    }
    public int getID(){
        return ++id;
    }
    public void finalize() throws IOException{
         //cria o arquivo
         FileWriter fw = new FileWriter(nomeDoArquivo,false);
         //Criar o buffer do arquivo
         BufferedWriter bw =new BufferedWriter(fw);
         //Escreve no arquivo
         String saida = id+"";
         bw.write(saida);
         //fecha o arquivo
         bw.close();		
    }
=======
public class GeradorId {
    
>>>>>>> bc7f8c66e5dcec56cafd849d3f9f0dc39f76d9d4
}
