
package modelos.utilidades;

import java.io.IOException;

public class CreateServer {
   private final ComunicadorTCP comunicacao;

    public CreateServer() throws IOException {
        this.comunicacao = new ComunicadorTCP("127.0.0.1", 6789);
    }

    public ComunicadorTCP getComunicacao() {
        return comunicacao;
    }
    
}
