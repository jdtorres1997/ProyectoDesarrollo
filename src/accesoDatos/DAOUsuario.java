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

    public void cerrarConexionBD() {
        acceso.closeConection(acceso.getConnetion());
    }
}
