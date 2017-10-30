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
public class Sede {
    private String   identificacion,nombre,informacion,ubicacion,estado;

    public Sede(){
        identificacion = "";
        nombre = "";
        informacion = "";
        ubicacion = "";
        estado = "";
    }
    
     public void setIdentificacion(String identificacion){
        this.identificacion = identificacion;
    }
      public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setInformacion(String informacion){
        this.informacion = informacion;
    }
    public void  setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public String getIdentificacion(){
        return identificacion;
    }
    public String getNombre(){
        return nombre;
    }
    public String getInformacion(){
        return informacion;
    }
    public String getUbicacion(){
        return ubicacion;
    }
    public String getEstado(){
        return estado;
    }
}