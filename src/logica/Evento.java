/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;
import logica.Sede;


/**
 *
 * @author Alexandra
 */
public class Evento {
    private String identificacion,nombre,sede,fecha,hora,ubicacion;
    private int costo,capacidad;
    public Evento(){
        identificacion ="";
        nombre ="";
        sede ="";
        fecha ="";
        hora="";
        ubicacion="";
        costo=0;
        capacidad=0;
    }
     
    public void setIdentificacion(String identificacion){
        this.identificacion = identificacion;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setSede(String sede){
        this.sede = sede;
    }
    public void  setFecha(String fecha){
        this.fecha = fecha;
    }
     public void  setHora(String hora){
        this.hora = hora;
    }
    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }
    public void  setCosto(int costo){
        this.costo= costo;
    }
    
    public void setCapacidad(int capacidad){
        this.capacidad= capacidad;
    }
    
    public String getIdentificacion(){
        return identificacion;
    }
    public String getNombre(){
        return nombre;
    }
  
   public String getSede(){
        return sede;
    }
   
    public String getFecha(){
        return fecha;
    }
    public String getHora(){
        return hora;
    }
    public String getUbicacion(){
        return ubicacion;
    }
    public int getCosto(){   
        return costo;
    }
    public int getCapacidad(){
        return capacidad;
    }
   
    
    
    
}
