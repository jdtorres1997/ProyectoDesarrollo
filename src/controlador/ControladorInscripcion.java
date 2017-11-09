/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import logica.Inscripcion;
import accesoDatos.DAOInscripcion;

/**
 *
 * @author jdtorres
 */
public class ControladorInscripcion {

    DAOInscripcion daoInscripcion;

    public ControladorInscripcion() {
        daoInscripcion = new DAOInscripcion();

    }

    public boolean agregarInscripcion(Inscripcion i) {
        boolean respuesta = daoInscripcion.insertarInscripcion(i);
        System.out.println(respuesta);
        return respuesta;

    }

    public boolean existeInscripcion(String id_cliente, String id_evento) {
        boolean respuesta = daoInscripcion.existeInscripcion(id_cliente, id_evento);
        return respuesta;
    }

    public boolean modificarInscripcion(Inscripcion i) {
        boolean respuesta = daoInscripcion.updateInscripcion(i);
        return respuesta;
    }

    public Inscripcion consultarInscripcion(String id_cliente, String id_evento) {
        Inscripcion i = new Inscripcion();
        i = daoInscripcion.consultarInscripcion(id_cliente, id_evento);
        return i;
    }
}
