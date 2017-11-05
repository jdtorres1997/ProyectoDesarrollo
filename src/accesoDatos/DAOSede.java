/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import java.awt.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import logica.Sede;
import logica.Usuario;

/**
 *
 * @author Alexandra
 */
public class DAOSede {
   
      AccesoBD acceso;
     
    public DAOSede() {
        acceso = new AccesoBD();
    }
      
        
    public boolean insertarSede(Sede s){
        String sql_select;
        sql_select = "INSERT INTO sedes ("
                + "identificacion, "
                + "nombre, "
                + "informacion, "
                + "ubicacion, "
                + "estado) "
                + "VALUES ('" +s.getIdentificacion()+ "',"
                        + "'" +s.getNombre()+ "', "
                        + "'" +s.getInformacion()+ "', "
                        + "'" +s.getUbicacion()+ "', "
                        + "'" +s.getEstado()+ "') ";
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
          
    public Sede consultarSede(String identificacion) {
        Sede s = new Sede();
        String sql_select;
        sql_select = "SELECT identificacion, nombre, informacion, ubicacion, estado FROM  sedes WHERE identificacion='" + identificacion + "'";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando la sede en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {

                
                s.setIdentificacion(tabla.getString(1));
                s.setNombre(tabla.getString(2));
                s.setInformacion(tabla.getString(3));
                s.setUbicacion(tabla.getString(4));
                s.setEstado(tabla.getString(5));
               

                System.out.println("ok");
            }

            return s;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }//end consultarUsuario
    
    
      public boolean updateSede(Sede s){
      String sql_select;
        sql_select = "UPDATE sedes "
                + "SET "
                        + "nombre='" +s.getNombre()+ "', "
                        + "informacion='" +s.getInformacion()+ "', "
                        + "ubicacion='" +s.getUbicacion()+ "', "
                        + "estado='" +s.getEstado()+ "' WHERE identificacion='"+s.getIdentificacion()+"' ";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("actualizando sede  en  bd");
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
      
       public void cerrarConexionBD() {
        acceso.closeConection(acceso.getConnetion());
    }

    public boolean existeSede(String identificacion) {
                Sede s = new Sede();
        String sql_select;
        sql_select = "SELECT * FROM  sedes WHERE identificacion='" + identificacion + "'";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando la sede en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            if(!tabla.isBeforeFirst()){
                return false;
            }else{
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
          return true;
    }
    
   
    public ArrayList<String> todasSedes() {
         Sede s = new Sede();
         String sql_select;
         ArrayList<String> ve= new ArrayList<String>();
         
        sql_select = "SELECT * FROM  sedes WHERE estado='activa'";
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
   
       
}
