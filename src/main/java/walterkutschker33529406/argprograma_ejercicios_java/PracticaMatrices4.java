package walterkutschker33529406.argprograma_ejercicios_java;
import java.util.InputMismatchException;
import java.util.Scanner;

//4. Una casa de comida rápida utiliza una matriz de 20 filas y 5 columnas para determinar cada plato del menú 
// y sus correspondientes ingredientes que contiene. Para ello, cada fila representa un plato principal en donde 
// en la primera columna se especifica su nombre (por ejemplo: Milanesa), y en las demás los posibles acompañamientos
// que puede tener el plato (por ejemplo, puré, ensalada rusa, papas fritas, ensalada de lechuga y tomate, ensalada 
// de zanahoria, etc). En caso de que tenga el plato menos de 4 tipos de acompañamiento, en la matriz se cargará la
// palabra Ninguno en las posiciones que queden vacías.
// Se desea un programa que sea capaz de permitir la carga de la matriz, de buscar un plato en particular que un cliente ingrese por teclado y 
// mostrarle de forma automática los posibles acompañamientos del mismo. 

public class PracticaMatrices4 {

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

    public static String validarCarga(){

        String cadena;
        Scanner scan = new Scanner (System.in);
        cadena = scan.next();
        
        
        if (cadena.length() > 0 && cadena.length() < 21){
            System.out.println(cadena);
            if (cadena == "n"){ 
                return "Ninguno";
            }

            return cadena;
    
        }else{
            
            System.out.println("Entrada invalida.Ingrese una cadena no vacía de máximo 20 caracteres");
            return validarCarga();
            
        }
       
    }

    public static void cargaMenu(String [][] platosXacomp){

         // Iterando sobre filas
         for (int i = 0; i < 2 ; i++) {

            f.cls();

            // Iterando sobre columnas
            for (int j = 0; j < 5; j++) { 


                if ( j == 0 ) {

                    System.out.println("Defina plato n."+i+":");
                    platosXacomp[i][j] = validarCarga();

                } else {

                       
                System.out.println("Defina acompañamiento opcional n."+ (j)+"\n Ingrese 'n' minuscula para dejar vacia la casilla:");
                platosXacomp[i][j] = validarCarga();



                }
             
            }

        }

    }

    public static void imprimirMatrizStr(String [][] matriz) {

        for ( int i = 0; i < matriz.length; i++) {
            
            System.out.println(" ");
            System.out.print(i+") ");
            

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j]+"    ");
                
            }
        }

    }

    public static void mostrarAcomp(String [][] matriz, int opcionMenu){

        
        System.out.println("Seleccione un plato del menú:");

        int op = validarEntradaRango(0, 20);

        System.out.println(" ");

        for (int i = 0; i < matriz[0].length; i++) {
            
           
            System.out.println(matriz[op][i]);
           
        }

        System.out.println(" ");

    }

    public static void run(){

        f.cls();

        // inicializo matriz vacía de 20x5.
        
        String[][] platosXacomp = new String[20][5];  

        // cargo la matriz con placeholders.

        System.out.println("len = "+platosXacomp.length); 
        System.out.println("len = "+platosXacomp[0].length);
       
        for (int i = 0; i < platosXacomp.length; i++) {
           
            platosXacomp[i][0] = "Plato-"+i;
            
            for (int j = 0; j < platosXacomp[i].length; j++) {
              
                
                if (j != 0) {  platosXacomp[i][j] = "acompañamiento-"+j;}
                                
            }
        }
      
        int opcion = -1;

       
       
        while (opcion != 0){
            
            System.out.println("\nIngerese una opción:\n 1) Ver menú \n 2) Cargar menú \n 3) Mostrar acompañamientos disponibles \n 0)Teminar el programa");

            switch (validarEntradaRango(0, 3)) { 

                case 1:
                    f.cls();
                    imprimirMatrizStr(platosXacomp);
                    break;
                case 2:
                    f.cls();
                    cargaMenu(platosXacomp);
                     break;
                case 3:
                    f.cls();
                    mostrarAcomp(platosXacomp, opcion);
                    break;
                case 0:
                    f.cls();
                    opcion = 0;
                    break;

            }
        }


    }

}
   
