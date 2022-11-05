/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package walterkutschker33529406.argprograma_ejercicios_java;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;


/**
 *
 * @author walterk
 * 
 * @consigna 3.Se tienen tres vectores. En el primero de ellos se guarda un número de dni, en el segundo un nombre y en el tercero un apellido.
 * Se desea un programa que sea capaz de recorrer los tres vectores AL MISMO TIEMPO y mostrar cada uno de estos datos por pantalla.
 * Pista: tener en cuenta que el índice de cada vector es correspondiente al índice de los demás, 
 * es decir, los datos contenidos en el índice cero del vector de dni, se corresponde con el índice cero del vector de nombres y el de apellidos.
 */

public class PracticaVectores3 {
    
    
    public static void imprimirDatos(String[] vec_apellido,String[] vec_nombre, int[] vec_dni){
        
        for (int i = 0; i < vec_dni.length; i++) {
            
            System.out.println("");
            System.out.println("Dni: " +  String.valueOf(vec_dni[i]));
            System.out.println("Apellido: " + vec_apellido[i]);
            System.out.println("Nombre: " + vec_nombre[i]);
            System.out.println("");
              
        }
        
          
    }
    
    public static int generarDniAleatorio(){
        
        return ThreadLocalRandom.current().nextInt(18000000,40000000);
             
    }
    
    
    
     public static void run () {
        
        System.out.println(" ");
        System.out.println("EJERCICIO VECTORES 3:");
        
        int vector_dni[] = { generarDniAleatorio(), generarDniAleatorio(), generarDniAleatorio(), generarDniAleatorio(), generarDniAleatorio()};
        String vector_nombre[] =  {"Ariel","Belén","Cecilia","Dante","Emilio"};
        String vector_apellido[] = {"Alarcón","Benitez","Castillos","Díaz","Echeverría"};
        
        System.out.println("Imprimiendo datos...");
        imprimirDatos(vector_apellido, vector_nombre, vector_dni);
            
        }
        
        
        
        
       
    
    
    
    
}
