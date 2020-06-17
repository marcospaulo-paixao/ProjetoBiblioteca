/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import controle.UsuarioControle;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Base64;
import modelos.classes.Usuario;
import modelos.utilidades.GeradorID;
import modelos.utilidades.enums.TipoDeStatus;

/**
 *
 * @author marcos
 */
public class main {

    public static void main(String[] args) {
        UsuarioControle uc = new UsuarioControle("usuario.txt");
        try {
            FileWriter fw = new FileWriter("usuario.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            Usuario usuario = new Usuario();
            usuario.setNomeDoUsuario("Marco Paulo Paixão");
            usuario.setLogin("marcos");
            usuario.setSenha("macos3526");
            usuario.setStatus(TipoDeStatus.ATIVO);
            GeradorID gi = new GeradorID();
            usuario.setId(gi.getID());
            gi.finalize();
            String senha = usuario.getSenha();
            String senhaSerializada = Base64.getEncoder().encodeToString(senha.getBytes());
            usuario.setSenha(senhaSerializada);
            bw.write(usuario.toString() + "\n");

            bw.close();

        } catch (Exception e) {

        }
    }
}
