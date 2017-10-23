/*
 * Clase que hace de intermediario entre la interfaz y el codigo para hacer consultas a la BD
 */
package controlador;

import accesoDatos.*;
import logica.*;

/**
 *
 * @author jdtorres
 */
public class ControladorUsuarios {

    DAOUsuario daoUsuario;

    public ControladorUsuarios() {
        daoUsuario = new DAOUsuario();
    }

    public Usuario consultarUsuario(String login) {
        //Vector v= new Vector();

        Usuario u = new Usuario();

        System.out.println("Se va a consultar un usuario");

        u = daoUsuario.consultarUsuario(login);

        return u;
    }

    public void cerrarConexionBD() {
        daoUsuario.cerrarConexionBD();
    }
}
