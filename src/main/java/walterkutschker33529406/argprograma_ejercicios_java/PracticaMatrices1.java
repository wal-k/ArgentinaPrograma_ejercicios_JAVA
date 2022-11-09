package walterkutschker33529406.argprograma_ejercicios_java;
import java.util.Scanner;
import java.text.DecimalFormat;


/**
 *
 * @author Walter Kutschker
 * 
 * @consigna: 1.Una matriz de 5 filas x 3 columnas almacena el total de goles de 5 jugadores de futbol en los últimos 3 partidos que jugaron, 
 * donde cada fila representa a un jugador y cada columna a la cantidad de goles que hizo. 
 * Se necesita un programa que sea capaz de permitir la carga de los goles, 
 * calcular el promedio de goles realizado por cada jugador y almacenar el resultado en un vector de 5 posiciones, 
 * donde cada posición representará a un jugador. Tener en cuenta el siguiente diagrama para llevar a cabo el planteo:
 *
 * Nota: tener en cuenta que el promedio de goles puede dar como resultado un número que NO SEA ENTERO.
 * 
 */

public class PracticaMatrices1 {


    public static int validarEntrada(){

        
        
        int numero;
        Scanner scan = new Scanner (System.in);
        numero = scan.nextInt();
        
        
        if (numero>0){
        
            return numero;
    
        }else{
            
            System.out.println("Entrada invalida.Ingrese un numero entero positivo...");
            return validarEntrada();
            
        }
       
    }



    public static void run () {
        
        // Carga de la matriz y calculo de promedios...

        int[][] mat_jugadores_x_golesPartido = new int[5][3];
        String[] nombres_jugadores = {"Jugador A", "Jugador B", "Jugador C", "Jugador D","Jugador E"};
        double[] promedios = new double[5];

        // Iterando sobre filas
        for (int i = 0; i < 5 ; i++) {

            f.cls();
            System.out.print(nombres_jugadores[i]+" ; ");
            System.out.println("Ingrese la cantidad de goles: ");
            int acumulador = 0;

            // Iterando sobre columnas
            for (int j = 0; j < 3; j++) { 
                
                System.out.println("Partido n " + (j+1));
                mat_jugadores_x_golesPartido[i][j] = validarEntrada();
                acumulador += mat_jugadores_x_golesPartido[i][j];
            }

            promedios[i] = Double.valueOf(acumulador)/3.0;
            acumulador = 0;
             
        }

        // Impresión de la matriz...

        f.cls();
        System.out.println("Jugadores|g/P1|g/p2|g/P3|Promedio");  
      
        for (int i = 0; i < 5; i++) {

           
            System.out.print(nombres_jugadores[i]+"   ");  
            
            for (int j = 0; j < 3; j++) {

                System.out.print(mat_jugadores_x_golesPartido[i][j]+"    "); 

            }

            final DecimalFormat redondeo = new DecimalFormat("0.00");
            
            System.out.print(redondeo.format(promedios[i]));

            System.out.println(" ");  

        }

      
    }






    
    
}
