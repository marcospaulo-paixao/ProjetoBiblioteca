package modelos.interfaces;

import java.util.ArrayList;
import modelos.classes.Reserva;

public interface ICRUDReserva {

    void incluir(Reserva objeto) throws Exception;

    void excluir(String nome) throws Exception;

    ArrayList<Reserva> listagem() throws Exception;

    Reserva getReservaColaborador(String nome) throws Exception;
}
