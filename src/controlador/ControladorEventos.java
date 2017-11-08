/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import accesoDatos.DAOEvento;
import java.util.ArrayList;
import logica.Evento;

/**
 *
 * @author Alexandra
 */
public class ControladorEventos {

    DAOEvento daoEvento;

    public ControladorEventos() {
        daoEvento = new DAOEvento();
    }

    public boolean agregarEvento(Evento ev) {
        boolean respuesta = daoEvento.insertarEvento(ev);
        System.out.println(respuesta);
        return respuesta;

    }

    public Evento consultarEvento(String identificacion) {

        Evento ev = new Evento();
        System.out.println("Se va a consultar un usuario");
        ev = daoEvento.consultarEvento(identificacion);
        return ev;

    }

    public boolean existeEvento(String identificacion) {
        boolean respuesta = daoEvento.existeEvento(identificacion);
        return respuesta;
    }

    public boolean modificarEvento(Evento ev) {
        boolean respuesta = daoEvento.updateEvento(ev);
        return respuesta;

    }
    
    public ArrayList<String> retornar(){
       
      ArrayList<String> ve= new ArrayList<String>();

        ve = daoEvento.todosEventos();
        System.out.print(ve);
        return ve;
    }
}
