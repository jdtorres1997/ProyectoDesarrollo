/*
 * Clase que hace de intermediario entre la interfaz y el codigo para hacer consultas a la BD
 */
package controlador;

import accesoDatos.*;
import java.util.ArrayList;
import java.util.Vector;
import logica.*;

/**
 *
 * @author jdtorres
 */
public class ControladorUsuarios {

    public  boolean existeUsuario(String login) {
        boolean respuesta = daoUsuario.existeUsuario(login);
        return respuesta;
    }

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
    public boolean agregarUsuario(Usuario u) {
        
        boolean respuesta = daoUsuario.insertarUsuario(u);
        System.out.println(respuesta);
        return respuesta;
        
    }
    public boolean modificarUsuario(Usuario u){
        boolean respuesta = daoUsuario.updateUsuario(u);
        System.out.println(respuesta);
        return respuesta;
    }
            
    public void cerrarConexionBD() {
        daoUsuario.cerrarConexionBD();
    }
     public Vector retornar(){
       
      Vector ve= new Vector();

        ve = daoUsuario.todosUsuarios();
   
        return ve;
    }
}
