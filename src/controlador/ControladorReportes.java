/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import logica.Pdf;

/**
 *
 * @author Alexandra
 */
public class ControladorReportes {
    private Pdf pdf;
    public  ControladorReportes(){
        pdf = new Pdf();
    }
    
    public boolean reporteInscripcionesEvento(String idEvento, String ruta, String nombreArchivo){
        boolean res = pdf.generarPdfConsulta("select id_cliente, pago from inscripciones WHERE id_evento = '" + idEvento + "'" , ruta, nombreArchivo, "Reporte de inscripciones al evento " + idEvento);
        return res;
    }
    
}
