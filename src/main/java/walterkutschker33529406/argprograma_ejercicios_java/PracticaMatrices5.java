package walterkutschker33529406.argprograma_ejercicios_java;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

//4. Una empresa constructora desea llevar a cabo un premio para sus obreros que hayan realizado
// horas extras en los últimos 6 meses. Para ello, lleva una matriz de control de 15 filas x 6 columnas, 
// donde cada fila corresponde a un empleado distinto y donde cada columna representa el total de
// horas trabajadas por mes. El monto de horas normal trabajado x mes es de 8 horas diarias,
// 5 días a la semana, 4 semanas por mes, es decir: 160 horas. Todo monto superior a este
// es considerado como horas extras.
// Se desea un programa que permita la carga de horas trabajadas por cada obrero y que sea capaz
// de determinar aquellos que hayan realizado horas extras. Para registrar las horas extras realizadas 
// se utilizará un vector de 15 posiciones en donde se deberá calcular y almacenar la cantidad de horas
// extras de cada obrero. En caso de que no haya realizado horas extras, deberá incluirse un número 0.
   
public class PracticaMatrices5 {


    public static int validarEntradaRango(int desde, int hasta){
        
        int numero;
        Scanner scan = new Scanner (System.in);
       
        try {

            numero = scan.nextInt();
            if ( numero >= desde && numero < hasta+1 ){
        
                return numero;
        
            }else{
                
                System.out.println("Entrada invalida.Ingrese un numero entero positivo entre"+ desde + " y " + hasta+ "...");
                return validarEntradaRango(desde,hasta);
                
            }

        } catch (InputMismatchException err) {

            System.out.println("Entrada invalida.Ingrese un numero entero positivo entre"+ desde + " y " + hasta+ "...");
            return validarEntradaRango(desde,hasta);

        }

    }

    public static int validarCarga(){

        int horas;
        Scanner scan = new Scanner (System.in);
        horas = scan.nextInt();
       
        if (horas > -1 && horas < 201 ){
           
            return horas;
    
        }else{
            
            System.out.println("Entrada invalida.Ingrese un numero entero entre 0 y 200");
            
            return validarCarga();

        }
       
    }

    public static void cargaMatriz(int [][] mat){

         // Iterando sobre filas
         for (int i = 0; i < 15 ; i++) {

            f.cls();

            // Iterando sobre columnas
            for (int j = 0; j < 6; j++) { 

                System.out.println("Cargue cantidad de horas trabajadas por el empleado n" + i + "en el mes " + j +":" );
                mat[i][j] = validarCarga();

            }

        }

    }

    public static void imprimirMatrizInt(int [][] matriz) {

        for (int i = 0; i < matriz[0].length; i++) {

            System.out.print("M:"+i+" ");
                
        }

        System.out.println(" ");

        for ( int i = 0; i < matriz.length; i++) {
            
            System.out.println(" ");
            
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j]+"    ");
                
            }
        }

    }

    public static int [] computarHorasExtra( int [][] matHorasMes) {

        int [] vectorHorasExtraTotal = new int[15]; 
       
        for (int i = 0; i < matHorasMes.length; i++) {

            
            int totalHorasTrabajadas = 0;

            for (int j = 0; j < matHorasMes[0].length; j++) {
                
                totalHorasTrabajadas += matHorasMes[i][j];

            }

            vectorHorasExtraTotal[i] = totalHorasTrabajadas - 160* matHorasMes[0].length;
            totalHorasTrabajadas = 0;

        }

        return vectorHorasExtraTotal;
        
    }

    public static void run(){

        f.cls();

        // inicializo matriz y vector.
        
        int[][] empleadosXhoras = new int[15][6];  

        int opcion = -1;

        while (opcion != 0){
            
            System.out.println("\nIngerese una opción:\n 1) Ver matriz \n 2) Cargar matriz \n 3) Computar y mostrar vector de horas extra \n 0)Teminar el programa");

            switch (validarEntradaRango(0, 3)) { 

                case 1:
                    f.cls();
                    imprimirMatrizInt(empleadosXhoras);
                    break;
                case 2:
                    f.cls();
                    cargaMatriz(empleadosXhoras);
                    break;
                case 3:
                    f.cls();
                    System.out.println(Arrays.toString(computarHorasExtra(empleadosXhoras)));
                    break;
                case 0:
                    f.cls();
                    opcion = 0;
                    break;

            }
        }

    }

}
   
