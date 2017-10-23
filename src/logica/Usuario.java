/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author temp
 */
public class Usuario {
    private String login, password, tipo, estado, nombre, apellido;
    private int telefono;
    
    public Usuario(){
        login = "";
        password = "";
        tipo = "";
        estado = "";
        nombre = "";
        apellido = "";
        telefono = 0;
    }
    
    public void setLogin(String login){
        this.login = login;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    
    public String getLogin(){
        return login;
    }
    public String getPassword(){
        return password;
    }
    public String getTipo(){
        return tipo;
    }
    public String getEstado(){
        return estado;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getTelefono(){
        return telefono;
    }
}
