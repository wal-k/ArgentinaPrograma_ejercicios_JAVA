/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package walterkutschker33529406.argprograma_ejercicios_java;
import java.util.Scanner;
import java.util.function.Function;
import java.util.Arrays;


/**
 *
 * @author walterk
 * @consigna 5.Se necesita un vector que permita cargar por teclado el nombre de 10 animales.
 *  A partir de esta carga, se desea otro vector que copie los mismos nombres pero en el orden inverso,
 *  es decir, si los nombres son: perro, gato, lagartija, el nuevo vector debe contener:
 *  lagartija, gato, perro. Una vez realizado el cambio,
 *  mostrar por pantalla ambos vectores para compararlos.
 * 
 * 
 */


public class PracticaVectores5 {
    
    public static String cargaTecladoValidada_StrNoNull(){
         
         Scanner scan = new Scanner (System.in);
         String entrada = scan.next();
         
       
         
        if (entrada.length() > 0) {
             
            System.out.println("--> Len: "+ Integer.toString(entrada.length()) );    
            f.cls();
            return entrada;
                 
        }else{ 

            System.out.println("Ha ingresado una cadena vacía. Por favor, ingresese el nombre de un animal.");    
            f.cls();
            return "noanimal";      
            
      
        }
    }


    public static String[] invertirVector(String[] vector) {

        String[] vector_invertido = new String[vector.length];

        for (int i = 0; i < vector.length; i++) {
            
            vector_invertido[i] = vector[vector.length-1-i];
            
        }

        return vector_invertido;

    }

    
        
     public static void run () {
        
        String[] vector_animales = new String[10];   
         
        for (int i = 0; i < 10; i++) {

              System.out.println("Por favor, cargue el nombre de un animal, enter para confirmar."); 
              System.out.println(Arrays.toString(vector_animales));   
              vector_animales[i] = cargaTecladoValidada_StrNoNull();

            }

        String[] vector_animales_invertido = invertirVector(vector_animales);

        
        System.out.print("Vector inicial: ");    
        System.out.println(Arrays.toString(vector_animales));    

        System.out.print("Vector ivertido: ");    
        System.out.println(Arrays.toString(vector_animales_invertido));    
    
      
      
    }
    
}
