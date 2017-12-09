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
    
    public boolean reportePagos(String ruta, String nombreArchivo, java.sql.Date desde, java.sql.Date hasta){
        boolean res = pdf.generarPdfConsulta("select id_cliente,"
                                                  + "id_evento,"
                                                  + "pago,"
                                                  + "costo,"
                                                  + "fecha_pago "
                                                  + "from inscripciones inner join eventos "
                                                  + "ON inscripciones.id_evento = eventos.identificacion "
                                                  + "where fecha_pago >= '"+desde+"' and fecha_pago <= '"+hasta+"' and pago='si'", ruta, nombreArchivo, "HOLA SOY UN REPORTE DE PAGOS");
    
        return res;
    }
    
    public boolean reporteNoPagos(String ruta, String nombreArchivo, java.sql.Date desde, java.sql.Date hasta){
        boolean res = pdf.generarPdfConsulta("select id_cliente,"
                                                  + "id_evento,"
                                                  + "pago,"
                                                  + "costo,"
                                                  + "fecha_pago "
                                                  + "from inscripciones inner join eventos "
                                                  + "ON inscripciones.id_evento = eventos.identificacion "
                                                  + "where fecha_pago >= '"+desde+"' and fecha_pago <= '"+hasta+"' and pago='no'", ruta, nombreArchivo, "HOLA SOY UN REPORTE DE NO PAGOS");
        return res;
    }
    
    public boolean reportePagosYNoPagos(String ruta, String nombreArchivo, java.sql.Date desde, java.sql.Date hasta){
        boolean res = pdf.generarPdfConsulta("select id_cliente,"
                                                  + "id_evento,"
                                                  + "pago,"
                                                  + "costo,"
                                                  + "fecha_pago "
                                                  + "from inscripciones inner join eventos "
                                                  + "ON inscripciones.id_evento = eventos.identificacion "
                                                  + "where fecha_pago >= '"+desde+"' and fecha_pago <= '"+hasta+"'", ruta, nombreArchivo, "HOLA SOY UN REPORTE DE PAGOS Y NO PAGOS");
        return res;
    }
    
    
    
}
