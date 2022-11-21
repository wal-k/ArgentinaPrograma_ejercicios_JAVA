package walterkutschker33529406.argprograma_ejercicios_java;
import java.text.DecimalFormat;
import java.util.Scanner;

// 2.Una escuela primaria utiliza una matriz para calcular los promedios de sus alumnos. 
// Para ello tienen una matriz de 10 filas, donde cada fila representa a un alumno y 4 columnas.
// Las primeras 3 columnas representan las notas de cada uno de los alumnos, mientras que la 4 es el promedio de las mismas. 
// Se desea un programa que sea capaz de permitir la carga por teclado de las 3 notas de cada alumno, 
// de realizar el cálculo automático del promedio, de guardar el mismo en la 4 columna 
// y luego mostrar por pantalla cada una de las notas y el promedio obtenido. 


public class PracticaMatrices2 {


    public static int validarEntrada(){

        int numero;
        Scanner scan = new Scanner (System.in);
        numero = scan.nextInt();
        
        
        if (numero>0 && numero <11){
        
            return numero;
    
        }else{
            
            System.out.println("Entrada invalida.Ingrese un numero entero positivo entre 1 y 10...");
            return validarEntrada();
            
        }
       
    }



    public static void run () {
        
        // Carga de la matriz y calculo de promedios...

        int[][] mat_alumnosXnotas = new int[10][4];
        String[] nombres_alumnos = {"Alumno A", 
                                      "Alumno B",
                                      "Alumno C",
                                      "Alumno D",
                                      "Alumno E",
                                      "Alumno F", 
                                      "Alumno G",
                                      "Alumno H",
                                      "Alumno I",
                                      "Alumno J",
                                    };


        double[] promedios = new double[10];

        // Iterando sobre filas
        for (int i = 0; i < 10 ; i++) {

            f.cls();
            System.out.print(nombres_alumnos[i]+" ; ");
            System.out.println("Ingrese la nota obtenida: ");
            int acumulador = 0;

            // Iterando sobre columnas
            for (int j = 0; j < 4; j++) { 
                
                System.out.println("Exámen n " + (j+1));
                mat_alumnosXnotas[i][j] = validarEntrada();
                acumulador += mat_alumnosXnotas[i][j];
            }

            promedios[i] = Double.valueOf(acumulador)/4.0;
            acumulador = 0;
             
        }

        // Impresión de la matriz...

        f.cls();
        System.out.println("Alumno  |Ex 1|Ex 2| Ex 3| Ex 4|Promedio");  
      
        for (int i = 0; i < 10; i++) {

           
            System.out.print(nombres_alumnos[i]+"   ");  
            
            for (int j = 0; j < 4; j++) {

                System.out.print(mat_alumnosXnotas[i][j]+"    "); 

            }

            final DecimalFormat redondeo = new DecimalFormat("0.00");
            
            System.out.print(redondeo.format(promedios[i]));

            System.out.println(" ");  

        }

      
    }
    
}
