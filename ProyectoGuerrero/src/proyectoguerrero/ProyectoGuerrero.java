
package proyectoguerrero;

import java.util.Scanner;

public class ProyectoGuerrero {

    public static void main(String[] args) {
        
        //Tipos de datos
        byte a;
        short b;
        int c;
        long d;
        float e;
        double f;
        boolean g;
        char h;
        
        //Variables
        //int edad = 20;
        float valor = 5.5f;
        double valor2 = 30.6;
        boolean bandera = true;
        char caracter = 'C';
        
        //Constantes
        final double pi = 3.14;
        final long v = 0;
        //final String nombre = "Jorge";
        
        
        /* Consola */
        
        System.out.println("Bienvenidos...");
        //System.out.print("Hola al curso de Java: " + nombre);
        //System.err.println("Tuvimos un problema...");
        
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        String nombre = lectura.next(); //Solo acepta cadenas sin espacio
        String nombre2 = lectura.nextLine(); //Acepta todo tipo de cadena con espacio
        
        System.out.println("Ingrese su edad: ");
        int edad = lectura.nextInt();
        
        System.out.println("Su nombre es: " + nombre + " y su edad: " + edad);
        
    }
    
}
