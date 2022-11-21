package walterkutschker33529406.argprograma_ejercicios_java;
import java.text.DecimalFormat;
import java.util.Scanner;


// 3.Se desea un programa que sea capaz de rellenar completamente con números 1 una matriz de 4 x 4
// a excepción de su diagonal principal, la cual debe ser rellenada con números 0. 
// Una vez realizada la carga, se desea mostrar la matriz de forma ordenada por pantalla. 



public class PracticaMatrices3 {

    public static void run () {
        
        int[][] matDiagonalNula = new int[4][4];
       
        

        // Iterando sobre filas
       
        for (int i = 0; i < matDiagonalNula.length ; i++) {
         
            // Iterando sobre columnas
           
            for (int j = 0; j < matDiagonalNula.length; j++) { 
                
               // asigno 1 a cada posición de la matriz
                
               matDiagonalNula[i][j] = 1;
             
            }

            // asigno 0 a los elementos de la diagonal

            matDiagonalNula[i][i] = 0;
             
        }

        // Impresión de la matriz...

        for (int i = 0; i < matDiagonalNula.length; i++) {

            System.out.println(" "); 
            
            for (int j = 0; j < 4; j++) {

                System.out.print(matDiagonalNula[i][j]+" "); 

            }

        }

        System.out.println(" "); 

    }
    
}
