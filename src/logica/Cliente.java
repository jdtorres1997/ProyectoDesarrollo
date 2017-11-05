/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Alexandra
 */
public class Cliente {
    
   private String identificacion,nombre,apellido,direccion,email;
   private long telefono;
   
   public Cliente(){
       identificacion="";
       nombre="";
       apellido="";
       direccion="";
       email="";
       telefono= 0;
   }
   public void setIdentificacion(String identificacion){
       this.identificacion=identificacion;
   }
   public void setNombre(String nombre){
       this.nombre= nombre;
   }
   public void setApellido(String apellido){
       this.apellido= apellido;
   }
   public void setDireccion (String direccion){
       this.direccion=direccion;
   }
   public void setEmail(String email){
       this.email=email;
   }
   public void setTelefono(long telefono){
       this.telefono = telefono;
   }
    public String getNombre(){
        return nombre;
    }
      public String getApellido(){
        return apellido;
    }
    public String getIdentificacion(){
        return identificacion;
    }
     public String getDireccion(){
        return direccion;
    }
     
    public String getEmail(){
        return email;
    }
    
    public long getTelefono(){
        return telefono;
    }
}
