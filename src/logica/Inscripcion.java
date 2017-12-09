/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Date;

/**
 *
 * @author jdtorres
 */
public class Inscripcion {

    private String id_cliente, id_evento, pago;
    private java.sql.Date fechaPreinscripcion;
    private java.sql.Date fechaPago;


    public Inscripcion() {
        id_cliente = "";
        id_evento = "";
        pago = "";
        fechaPreinscripcion = null;
        fechaPago = null;
    }

    public void setIdCliente(String id) {
        id_cliente = id;
    }

    public void setIdEvento(String id) {
        id_evento = id;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }
    
    public String getIdCliente(){
        return id_cliente;
    }
    public String getIdEvento(){
        return id_evento;
    }
    public String getPago(){
        return pago;
    }
    public java.sql.Date getFechaPreinscripcion(){
        return fechaPreinscripcion;
    }
    
    public java.sql.Date getFechaPago(){
        return fechaPago;
    }
    
    public void actualizarFechaPreinscripcion(){
        java.util.Date d = new java.util.Date();  
        fechaPreinscripcion = new java.sql.Date(d.getTime());
        System.out.print(fechaPreinscripcion);
    }
    
    public void actualizarFechaPago(){
        java.util.Date d = new java.util.Date();  
        fechaPago= new java.sql.Date(d.getTime());
    }
}
