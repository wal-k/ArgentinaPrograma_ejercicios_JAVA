package walterkutschker33529406.argprograma_ejercicios_java;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Auto {

    String nPatente;
    String marca;
    String modelo;
    String color;
    String nChasis;

    private static int validarEntradaRango(int desde, int hasta){
        
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

    private static String validarCargaChasis(){

        String cadena;
        Scanner scan = new Scanner (System.in);
        cadena = scan.nextLine();
        

        if (cadena.length() == 17){
           
            return cadena;
    
        }else{
            
            System.out.println("Entrada invalida.Ingrese un numero VIN válido (17 caracteres)");
            
            return validarCargaChasis();

        }
    }
    
    private static String validarCargaPatente(){

        String cadena;
        Scanner scan = new Scanner (System.in);
        cadena = scan.nextLine();
       
    
        if (cadena.length() == 8){
               
            return cadena;
        
        }else{
                
            System.out.println("Entrada invalida.Ingrese un numero VIN válido (8 caracteres)");
                
            return validarCargaPatente();
    
        }
    }

    private static String validarCargaMarcaModelo(){

        String cadena;
        Scanner scan = new Scanner (System.in);
        cadena = scan.nextLine();
        
        if (cadena.length() > 2 && cadena.length() < 21){
               
            return cadena;
        
        }else{
                
            System.out.println("Entrada invalida.Ingrese una cadena de entre 3 y 20 caracteres.");
                
            return validarCargaMarcaModelo();
    
        }
    }

    private static String validarCargaColor(){

        System.out.println("Elija un color de la lista (0-7):");
        System.out.println(
        "\n 0. Rojo"+
        "\n 1. Rojo metalizado"+
        "\n 2. Amarillo"+
        "\n 3. Verde"+
        "\n 4. Azul"+
        "\n 5. Negro"+
        "\n 6. Plateado"+
        "\n 7. Blanco");

        switch(validarEntradaRango(0, 7)) {

            case 0:
                return "Rojo";
            case 1:
                return "Rojo metalizado";
            case 2:
                return "Amarillo";
            case 3:
                return "Verde";
            case 4:
                return "Azul";
            case 5:
                return "Negro";
            case 6:
                return "Plateado";
            case 7:
                return "Blanco";
            default:
                return "";

        }

    }


    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }

   public String getnChasis() {
       return nChasis;
   }


   public String getnPatente() {
       return nPatente;
   }

   @Override

   public String toString(){

        return this.marca + " " + this.modelo + " " + this.color + " Pat. n: " + this.nPatente;

   }


    Auto() {

        System.out.println("Cargue datos del automóvil:");

        System.out.println("Ingrese numero de patente:");
        this.nPatente = validarCargaPatente();
       
        System.out.println("Ingrese marca del automóvil:");
        this.marca = validarCargaMarcaModelo();
        
        System.out.println("Ingrese modelo del automóvil:");
        this.modelo = validarCargaMarcaModelo();
       
        System.out.println("Ingrese color del automóvil:");
        this.color = validarCargaColor();
       
        System.out.println("Ingrese numero de chasis del automóvil:");
        this.nChasis = validarCargaChasis();

    }

}
