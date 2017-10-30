/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import accesoDatos.DAOSede;
import accesoDatos.DAOUsuario;
import logica.Sede;

/**
 *
 * @author Alexandra
 */
public class ControladorSedes {
    DAOSede daoSedes;
    
     public ControladorSedes() {
        daoSedes = new DAOSede();
    }
  public Sede consultarSede(String identificacion) {
        //Vector v= new Vector();

        Sede s = new Sede();

        System.out.println("Se va a consultar un usuario");

        s = daoSedes.consultarSede(identificacion);

        return s;
    }
    public boolean agregarSede(Sede s) {
        
        boolean respuesta = daoSedes.insertarSede(s);
        System.out.println(respuesta);
        return respuesta;
        
    }
    public boolean modificarSede(Sede s){
        boolean respuesta = daoSedes.updateSede(s);
        System.out.println(respuesta);
        return respuesta;
    }
    
    public boolean existeSede(String identificacion){
        boolean respuesta = daoSedes.existeSede(identificacion);
        return respuesta;
    }
            
    public void cerrarConexionBD() {
        daoSedes.cerrarConexionBD();
    }
    
    
}
