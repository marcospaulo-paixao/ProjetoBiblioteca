package controle;

import java.util.ArrayList;
import modelos.classes.Reserva;
import modelos.interfaces.IcrudReserva;
import persistencia.ReservaPersistencia;

public class ReservaControle implements IcrudReserva {

    IcrudReserva reservaIcrud = null;

    public ReservaControle(String nomeDoArquivoNoDisco) {
        reservaIcrud = new ReservaPersistencia(nomeDoArquivoNoDisco);
    }

    public IcrudReserva getReservaIcrud() {
        return reservaIcrud;
    }

    public void setReservaIcrud(IcrudReserva reservaIcrud) {
        this.reservaIcrud = reservaIcrud;
    }

    @Override
    public void incluir(Reserva objeto) throws Exception {
        try {
            reservaIcrud.incluir(objeto);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void excluir(String nome) throws Exception {
        try {
            reservaIcrud.excluir(nome);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public ArrayList<Reserva> listagem() throws Exception {
        try {
            return reservaIcrud.listagem();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Reserva getReservaColaborador(String nome) throws Exception {
        try {
            return reservaIcrud.getReservaColaborador(nome);
        } catch (Exception e) {
            throw e;
        }
    }

}
