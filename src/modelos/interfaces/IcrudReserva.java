package modelos.interfaces;

import java.util.ArrayList;
import modelos.classes.Reserva;

public interface IcrudReserva {

    void incluir(Reserva objeto) throws Exception;

    void alterar(Reserva velhaReserva, Reserva novaReserva) throws Exception;

    ArrayList<Reserva> listagem() throws Exception;

    Reserva getReservaColaborador(String nome) throws Exception;
}
