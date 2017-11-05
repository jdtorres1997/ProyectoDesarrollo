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
import logica.Cliente;
/**
 *
 * @author Alexandra
 */
public class DAOCliente {
    AccesoBD acceso;
    
    public DAOCliente(){
        acceso = new AccesoBD();
        
    }
        public boolean insertarCliente(Cliente c){
        String sql_select;
        sql_select = "INSERT INTO clientes ("
                + "identificacion, "
                + "nombre, "
                + "apellido, "
                + "direccion, "
                + "email, "
                + "telefono)"
                + "VALUES ('" +c.getIdentificacion()+ "',"
                        + "'" +c.getNombre()+ "', "
                        + "'" +c.getApellido()+ "', "
                        + "'" +c.getDireccion()+ "', "
                        + "'" +c.getEmail()+ "', "  
                        + "'" +c.getTelefono()+ "')";
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
        public boolean existeCliente(String identificacion) {
        Cliente c = new Cliente();
        String sql_select;
        sql_select = "SELECT identificacion FROM  clientes WHERE identificacion='" + identificacion + "'";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando en la bd");
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
        public Cliente consultarCliente(String identificacion) {
        Cliente c = new Cliente();
        String sql_select;
        sql_select = "SELECT identificacion, nombre, apellido, direccion, email,telefono FROM  clientes WHERE identificacion='" + identificacion + "'";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            while (tabla.next()) {
                    c.setIdentificacion(tabla.getString(1));
                    c.setNombre(tabla.getString(2));
                    c.setApellido(tabla.getString(3));
                    c.setDireccion(tabla.getString(4));
                    c.setEmail(tabla.getString(5));
                    c.setTelefono(tabla.getInt(6));
                    
               
                System.out.println("ok");
            }

            return c;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
        public boolean updateCliente(Cliente c){
      String sql_select;
        sql_select = "UPDATE clientes "
                + "SET "
                        + "nombre='" +c.getNombre()+ "', "
                        + "apellido='" +c.getApellido()+ "', "
                        + "direccion='" +c.getDireccion()+ "', "
                        + "email='" +c.getEmail()+ "', "
                        + "telefono='" +c.getTelefono()+ "' WHERE identificacion='"+c.getIdentificacion()+"' ";
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
}
