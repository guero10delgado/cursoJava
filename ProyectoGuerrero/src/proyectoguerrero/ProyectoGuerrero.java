
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
        
        //System.out.println("Bienvenidos...");
        //System.out.print("Hola al curso de Java: " + nombre);
        //System.err.println("Tuvimos un problema...");
        
        /*
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        String nombre = lectura.next(); //Solo acepta cadenas sin espacio
        String nombre2 = lectura.nextLine(); //Acepta todo tipo de cadena con espacio
        
        System.out.println("Ingrese su edad: ");
        int edad = lectura.nextInt();
        
        System.out.println("Su nombre es: " + nombre + " y su edad: " + edad);
        */
        
        
        
        /* Operadores Matematicos */
        
        int suma = 5 + 10;
        int resta = 10 - 5;
        int multi = 10 * 5;
        double divion = 10 / 5;
        int residuo = 10 % 4;
        
        /*
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multi);
        System.out.println(divion);
        System.out.println(residuo);
        */
        
        
        
        
        /* Operadores Relacionales */ 
        
        /*
        
            ==      Igual a
            !=      Diferente
            >       Mayor que
            >=      Mayor o igual
            <       Menor
            <=      Menor o igual
        
        */
        
        /*
        int var1 = 5;
        int var2 = 3;
        
        
        System.out.println( var1 ==  var2 ); // false
        System.out.println( var1 !=  var2 ); // true
        System.out.println( var1 >= var2 ); // true
        System.out.println( var1 <= var2 ); //false
        
        
        System.out.println( 5 <= 5 ); //true
        System.out.println( 5 >= 5 ); //true
        */
        
        /* Operadores logicos */
        
        //int var1 = 5;
        //int var2 = 15;
        
        /*
            &&  Operador AND
            ||  Operador OR
            ?:  Operador Ternario
        */
        
        //System.out.println( var1 > 3 && var2 <= 15 && var1 != var2 ); // true
        
        //System.out.println( var1 > 5 || var2 <= 10 ); // false
        
        
        
        /* IF , IF ternario */
        
        /*
        int edad = 17;
        boolean band = false;
        
        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        }
        
        if(band){
            System.out.println("Es verdadero");
        }
        
        ///// If else /////
        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("No eres mayor de edad");
        }
        
        
        ///// If anidados /////
        
        int temperatura = 30;
        
        
        if(temperatura >= 30){
            System.out.println("Hace calor");
        }
        else if(temperatura >= 20 && temperatura < 30){
            System.out.println("Esta agradable el clima");
        }
        else{
            System.out.println("Hace frio");
        }
        
        // If Ternario
        
        String clima = (temperatura >= 30) ? "Hace calor (ternario)" : "Hace frio (ternario)";
        System.out.println(clima);
        
        
        /// switch ///
        
        int day = 5;
        String nombre_dia = "";
        
        switch(day){
            case 1: 
                nombre_dia = "Lunes";
                break;
            case 2: 
                nombre_dia = "Martes";
                break;
            case 3: 
                nombre_dia = "Miercoles";
                break;
            case 4: 
                nombre_dia = "Jueves";
                break;
            case 5: 
                nombre_dia = "Viernes";
                break;
            case 6: 
                nombre_dia = "Sabado";
                break;
            case 7: 
                nombre_dia = "Domingo";
                break;
            default:
                nombre_dia = "No hay dia";
        }
        
        System.out.println(nombre_dia);
        */
        
        /* ciclos */
        
        /*
            for(inicializacion; condicion; incremento/decremento)
        */
        
        for(int x = 1; x <= 100; x++){
           // System.out.println("Hola mundo: " + x);
        }
        
        
        
        /*
            while (condicion){
                sentencia
        */
        
        int x = 1;
        
        while(x <= 10){
            //System.out.println("Hola mundo: " + x);
            x++;
        }
        
        
        /*
            do
              sentencia
            while(condicion)
        */
        
        
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while ( i <= 10 );
        
        
        
    }
    
}
