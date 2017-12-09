/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import logica.Evento;

/**
 *
 * @author Alexandra
 */
public class DAOEvento {

    AccesoBD acceso;

    public DAOEvento() {
        acceso = new AccesoBD();
    }

    public Evento consultarEvento(String identificacion) {
        Evento ev = new Evento();
        String sql_select;
        sql_select = "SELECT identificacion, nombre, sede, fecha, hora, ubicacion,costo, capacidad, estado FROM  eventos WHERE identificacion='" + identificacion + "'";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            while (tabla.next()) {

                ev.setIdentificacion(tabla.getString(1));
                ev.setNombre(tabla.getString(2));
                ev.setSede(tabla.getString(3));
                ev.setFecha(tabla.getString(4));
                ev.setHora(tabla.getString(5));
                ev.setUbicacion(tabla.getString(6));
                ev.setCosto(tabla.getInt(7));
                ev.setCapacidad(tabla.getInt(8));
                ev.setEstado(tabla.getString(9));
                System.out.println("ok");
            }

            return ev;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public boolean insertarEvento(Evento ev) {
        String sql_select;

        sql_select = "INSERT INTO eventos (identificacion, nombre, sede, fecha, hora, ubicacion, costo, capacidad, estado) VALUES ('"
                + ev.getIdentificacion() + "',"
                + "'" + ev.getNombre() + "', "
                + "'" + ev.getSede() + "', "
                + "'" + ev.getFecha() + "', "
                + "'" + ev.getHora() + "', "
                + "'" + ev.getUbicacion() + "', "
                + "'" + ev.getCosto() + "', "
                + "'" + ev.getCapacidad() + "', "
                + "'" + ev.getEstado() + "') ";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("insertando en la bd");
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_select);

            return true;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;

    }

    public boolean existeEvento(String identificacion) {
        Evento ev = new Evento();
        String sql_select;
        sql_select = "SELECT identificacion FROM  eventos WHERE identificacion='" + identificacion + "'";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            if (!tabla.isBeforeFirst()) {
                return false;
            } else {
                return true;
            }

        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

    public boolean updateEvento(Evento ev) {
        String sql_select;
        sql_select = "UPDATE eventos "
                + "SET "
                + "nombre='" + ev.getNombre() + "', "
                + "sede='" + ev.getSede() + "', "
                + "fecha='" + ev.getFecha() + "', "
                + "hora='" + ev.getHora() + "', "
                + "ubicacion='" + ev.getUbicacion() + "', "
                + "capacidad='" + ev.getCapacidad() + "',"
                + "estado='" + ev.getEstado() + "' WHERE identificacion='" + ev.getIdentificacion() + "' ";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("actualizando en  bd");
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_select);

            return true;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;

    }

    public ArrayList<String> todosEventos() {

        String sql_select;
        ArrayList<String> ve = new ArrayList<String>();

        sql_select = "SELECT * FROM  eventos WHERE estado='activo'";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando la sede en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                ve.add((tabla.getString(1)));

            }
            return ve;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
      public Vector retornarEventos() {

       String sql_select;
        Vector ve = new Vector();

        sql_select = "SELECT * FROM  eventos";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando la sede en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) 
            {
              
                  
                ve.add(tabla.getString(1));
                ve.add(tabla.getString(2));
                ve.add(tabla.getString(3));
                ve.add(tabla.getString(4));
                ve.add(tabla.getString(5));
                ve.add(tabla.getString(6));
                ve.add(tabla.getInt(7));
                ve.add(tabla.getInt(8));
                ve.add(tabla.getString(9));
     
            }
            return ve;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
}

}
