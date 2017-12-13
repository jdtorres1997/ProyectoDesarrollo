/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import accesoDatos.DAOCliente;
import accesoDatos.DAOEvento;
import com.itextpdf.text.DocumentException;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Cliente;
import logica.Evento;
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
    
 

    public boolean generarCertificado(String idCliente, String idEvento, String ruta, String nombreArchivo) throws IOException, DocumentException {
        DAOCliente dc = new DAOCliente();
        Cliente c = dc.consultarCliente(idCliente);
        
        DAOEvento de = new DAOEvento();
        Evento e = de.consultarEvento(idEvento);
        
        String[] dateParts = e.getFecha().split("-");
        boolean res;
        if(this.sololetras(nombreArchivo)){
            res=false;
        }else {
            res = pdf.crearCertificado(c.getNombre() + " " + c.getApellido(), e.getNombre(), ruta, nombreArchivo, dateParts[0], dateParts[1], dateParts[2] );
        }
        return res;
    }

    
    
    public boolean generarEscarapela(String idCliente, String idEvento, String ruta, String nombreArchivo) throws IOException, DocumentException {
        DAOCliente dc = new DAOCliente();
        Cliente c = dc.consultarCliente(idCliente);
        
        DAOEvento de = new DAOEvento();
        Evento e = de.consultarEvento(idEvento);
        
        String[] dateParts = e.getFecha().split("-");
        boolean res;
        if(this.sololetras(nombreArchivo)){
            res=false;
        }else {
            res = pdf.crearEscarapela(c.getNombre() + " " + c.getApellido(), e.getNombre(), ruta, nombreArchivo, dateParts[0], dateParts[1], dateParts[2] );
        }
        return res;
    }



    public static boolean sololetras(String prueba) {
        boolean result = false;
        String comparacion = "!!#$%&/()=?¡*¨][_:;°¬|@·~½¬{[]}~µ";
        for (int i = prueba.length() - 1; i >= 0; i--) {
            for (int j = comparacion.length() - 1; j >= 0; j--) {
                if (prueba.charAt(i) == comparacion.charAt(j)) {
                    result = true;
                    return result;
                }
            }
        }
        return result;
    }
    
}
