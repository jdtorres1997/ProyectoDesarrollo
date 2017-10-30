/*
 * Clase que se encarga de hacer consultas a la BD, construyendo secuencias sql y ejecutandolas
 */
package accesoDatos;

import java.sql.*;
import logica.*;

/**
 *
 * @author temp
 */
public class DAOUsuario {

    AccesoBD acceso;

    public DAOUsuario() {
        acceso = new AccesoBD();
    }
    public boolean insertarUsuario(Usuario u){
        String sql_select;
        sql_select = "INSERT INTO usuarios ("
                + "login, "
                + "password, "
                + "tipo, "
                + "estado, "
                + "telefono, "
                + "nombre, "
                + "apellido)"
                + "VALUES ('" +u.getLogin()+ "',"
                        + "'" +u.getPassword()+ "', "
                        + "'" +u.getTipo()+ "', "
                        + "'" +u.getEstado()+ "', "
                        + "'" +u.getTelefono()+ "', "
                        + "'" +u.getNombre()+ "', "
                        + "'" +u.getApellido()+ "')";
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
    public Usuario consultarUsuario(String login) {
        Usuario u = new Usuario();
        String sql_select;
        sql_select = "SELECT login, password, tipo, estado, telefono, nombre, apellido FROM  usuarios WHERE login='" + login + "'";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            while (tabla.next()) {

                u.setLogin(tabla.getString(1));
                u.setPassword(tabla.getString(2));
                u.setTipo(tabla.getString(3));
                u.setEstado(tabla.getString(4));
                u.setTelefono(tabla.getLong(5));
                u.setNombre(tabla.getString(6));
                u.setApellido(tabla.getString(7));

                System.out.println("ok");
            }

            return u;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }//end consultarUsuario
    public boolean updateUsuario(Usuario u){
      String sql_select;
        sql_select = "UPDATE usuarios "
                + "SET "
                        + "tipo='" +u.getTipo()+ "', "
                        + "estado='" +u.getEstado()+ "', "
                        + "telefono='" +u.getTelefono()+ "', "
                        + "nombre='" +u.getNombre()+ "', "
                        + "apellido='" +u.getApellido()+ "' WHERE login='"+u.getLogin()+"' ";
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
    public void cerrarConexionBD() {
        acceso.closeConection(acceso.getConnetion());
    }

    public boolean existeUsuario(String login) {
        Usuario u = new Usuario();
        String sql_select;
        sql_select = "SELECT login FROM  usuarios WHERE login='" + login + "'";
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
}
