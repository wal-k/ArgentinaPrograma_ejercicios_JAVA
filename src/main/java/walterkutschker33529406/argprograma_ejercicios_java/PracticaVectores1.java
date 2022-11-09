/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package walterkutschker33529406.argprograma_ejercicios_java;
import java.util.Scanner;

/**
 *
 * @author walterk
 * 
 * @consigna: Se necesita de un vector que sea capaz de almacenar 10 números enteros entre 1 y 100.
 * Realizar un programa que permita la carga por teclado de los 10 números solicitados.
 * 
 */
public class PracticaVectores1 {
    
    
    public static int validarEntrada(){
      
        int numero;
        Scanner scan = new Scanner (System.in);
        numero = scan.nextInt();
        
        
        if (numero>0 && numero<=100){
        
            return numero;
    
        }else{
            
            System.out.println("Número fuera de rango, ingrese un numero del 1 al 100.");
            return validarEntrada();
            
        }
       

        
    }

 
    public static void run () {
        
        System.out.println("EJERCICIO VECTORES 1");
        System.out.println(" ");
        
        int vector[] = new int[10];
        
       
        for (int i = 0; i < 10; i++) {
           
            System.out.print("Por favor, cargue un numero del 1 al 100 por teclado, enter para confirmar."+" vec"+"["+i+"] <--  ");    
            vector[i] = validarEntrada();
            f.cls();
            
            
        }
        
        System.out.print("Vector cargado. Componentes del vector: ");
        
        for (int i = 0; i < 10; i++) {
            
            System.out.print(vector[i]+",");
            
        }
        
        System.out.println("  ");
        System.out.println("FIN EJERCICIO VECTORES 1");
        System.out.println("  ");
    
    
    }
}