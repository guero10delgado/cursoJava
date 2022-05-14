/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoguerrero;


public class Persona {
    
    //Modificadores de acceso
    //public 
    //private
    //protected
    //default
    
    private String nombre = "A";
    private int edad = 10;
    
    public Persona(){
        //System.out.println("Este es el constructor");
    }
    
    public Persona(String Nombre){
        System.out.println("Este es el constructor sobrecargado: " + Nombre);
    }
    
    //Setter
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    private void cambiarEdad(){
        this.edad = 18;
    }
    
}
