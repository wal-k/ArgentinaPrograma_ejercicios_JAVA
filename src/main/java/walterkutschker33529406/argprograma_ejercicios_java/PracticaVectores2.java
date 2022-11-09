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
 * @consigna: 2.En un vector de 15 posiciones se almacenan las edades de 15 alumnos. 
 * Se desea un programa que sea capaz de determinar cuál es la mayor edad y cuál es la menor edad que se encuentra entre los estudiantes.
 * 
 */

public class PracticaVectores2 {
    

    public static void run () {
        
        System.out.println(" ");
        System.out.println("EJERCICIO VECTORES 2:");
        
        int vector_edades[] = new int[15];
        
        System.out.println("Generando vector (len=15) con edades aleatorias rango(18,99)...");
        
        for (int i = 0; i < 15; i++) {
            
            vector_edades[i] = ThreadLocalRandom.current().nextInt(18,99);
            
        }
        
        System.out.println(Arrays.toString(vector_edades));
        
        int menor_edad = f.min(vector_edades);
        int mayor_edad = f.max(vector_edades);
        
        System.out.println("El estudiante de menor edad tiene "+ String.valueOf(menor_edad)+" años.");
        System.out.println("El estudiante de mayor edad tiene "+ String.valueOf(mayor_edad)+" años.");
        System.out.println("FIN EJERCICIO VECTORES 2.");
        
    }
}