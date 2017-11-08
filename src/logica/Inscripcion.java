/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author jdtorres
 */
public class Inscripcion {

    private String id_cliente, id_evento, pago;

    public Inscripcion() {
        id_cliente = "";
        id_evento = "";
        pago = "";
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
}
