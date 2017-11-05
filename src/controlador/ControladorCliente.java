/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import accesoDatos.DAOCliente;
import logica.Cliente;

/**
 *
 * @author Alexandra
 */
public class ControladorCliente {
    DAOCliente daoCliente;
   
    public ControladorCliente(){
       daoCliente = new DAOCliente(); 
       
    }
     public boolean agregarCliente(Cliente c){
        boolean respuesta = daoCliente.insertarCliente(c);
        System.out.println(respuesta);
        return respuesta;   
         
     }
     public boolean existeCliente(String identificacion){
         boolean respuesta = daoCliente.existeCliente(identificacion);
         return respuesta;
     }
     public boolean modificarCliente(Cliente c){
         boolean respuesta = daoCliente.updateCliente(c);
         return respuesta;
     }
     public Cliente consultarCliente(String identificacion){
         Cliente c = new Cliente();
         System.out.println("Se va a consultar un cliente");
         c= daoCliente.consultarCliente(identificacion);
         return c;
     }
}
