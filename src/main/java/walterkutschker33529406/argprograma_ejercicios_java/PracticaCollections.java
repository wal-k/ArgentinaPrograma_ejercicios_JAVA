package walterkutschker33529406.argprograma_ejercicios_java;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

import javax.print.event.PrintEvent;

// 1.      Crear una clase Mascota, que tenga los siguientes atributos: nombre, especie, sexo, color, pelaje y raza 
//         (tener en cuenta todos sus atributos,
//         constructores y métodos getters y setters). A partir de ello:
// a.      Crear un ArrayList de tipo Mascota. Crear 5 mascotas y guardarlas en la lista.
// b.      Recorrer la lista creada y mostrar por pantalla el nombre, especie y pelaje de las mascotas almacenadas.
// c.      Durante el recorrido, cambiar el nombre de dos mascotas. Volver a recorrer la lista y mostrar los nuevos datos
// d.      Agregar dos nuevas mascotas a la lista.
// e.      Recorrer la lista pero solo mostrando las mascotas que sean de la especie “perro”.

// Modificaciones a la consigna: Generar mascota con atributos al azar, agregar cantidad arbitraria de mascotas, menu opciones.


// 2.      Crear una clase persona que tenga los siguientes atributos: dni, nombre, apellido, dirección, celular, edad 
//         (tener en cuenta todos sus atributos, constructores y métodos getters y setters). A partir de ello:
// a.      Crear una LinkedList de tipo Persona y agregar 20 personas distintas.
// b.      Crear dos LinkedLists de tipo Persona diferentes a la primera, una para almacenar a los menores de edad y otra para los mayores.
// c.      Recorrer la lista principal buscando a las personas que sean mayores de 18 años. En caso que una persona tenga o sea mayor a 18 años,
//         agregarla a la lista de mayores, caso contrario agregarla a una lista de menores.
// d.      Una vez realizada la separación, recorrer ambas nuevas listas y mostrar por pantalla el nombre,
//         apellido y edad de cada una de las personas contenidas en cada lista.



// 3.      Crear una stack que permita objetos de tipo Autos, donde cada objeto auto debe tener: num_patente, marca, modelo, color, chasis. 
//         Cargar la pila con 7 autos diferentes luego hacer lo siguiente:
// a.      Buscar un auto de color rojo.
// b.      Mostrar el auto que se encuentra en la cima de la pila.
// c.      Borrar el auto que se encuentra en la cima de la pila.
// d.      Agregar dos nuevos autos a la pila.
//         Recorrer la pila mostrando el nuevo contenido luego de las operaciones realizadas.

public class PracticaCollections {

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

    private static String validarCarga(){

        String cadena;
        Scanner scan = new Scanner (System.in);
        cadena = scan.nextLine();
        System.out.println(cadena);
        
        if (cadena.length() > 2 && cadena.length() < 21){
           
            return cadena;
    
        }else{
            
            System.out.println("Entrada invalida.Ingrese una cadena no vacía de entre 3 y 20 caracteres");
            
            return validarCarga();

        }
       
        
    }

    private static ArrayList<Mascota> generarListaMascotas(int numero_mascotas){


        ArrayList<Mascota> listaMascotas = new ArrayList<Mascota>();


        for (int i = 0; i < numero_mascotas; i++) {
            
            listaMascotas.add( new Mascota());

        }


        for (int i = 0; i < listaMascotas.size(); i++) {

            f.cls();
            
            System.out.println("Generando mascota ..." + i);

            System.out.println(listaMascotas.get(i));

            System.out.println("Elija un nombre para su mascota:");
                         
            listaMascotas.get(i).setNombre(validarCarga());

        }

        return listaMascotas;

    }


    // Llamar para ejecutar ejercicio 1
    public static void run1() {

        System.out.println("--- Practica Collections (1) ---");
        
        ArrayList <Mascota> listaMascotas = generarListaMascotas(5);

        f.cls();

        // Menú de selección de opciones con ciclo while.
       
        int opcion = -1;

        while (opcion != 0){
            
            System.out.println("\nIngerese una opción:\n 1) Mostrar mascotas \n 2)Generar y nombrar mascota \n 3) Mostrar perros únicamente \n 0)Teminar el programa");
            opcion = validarEntradaRango(0, 3);
           
            switch (opcion) { 

                case 1:

                    f.cls();
                   
                    for (int i = 0; i < listaMascotas.size(); i++) {

                        System.out.println("Datos de mascota:" +"("+i+")");

                        System.out.println(listaMascotas.get(i));

                    }

                    break;
             

                case 2:
                    
                    f.cls();
                    System.out.println("Generando nueva mascota...");
                    Mascota nuevaMascota = new Mascota();
                    System.out.println(nuevaMascota);
                    System.out.println("Ingrese el nombre de la nueva mascota:");
                    nuevaMascota.setNombre(validarCarga());
                    listaMascotas.add(nuevaMascota);
                    f.cls();
                    break;
                
                case 3:
                   
                    f.cls();
                  
                    int perros_encontrados = 0;
                    
                    for (int i = 0; i < listaMascotas.size(); i++) {
                          
                        if (listaMascotas.get(i).getEspecie().equals("perro")) {

                            System.out.println(listaMascotas.get(i));

                            perros_encontrados ++;

                        }
                       
                    }

                    if (perros_encontrados == 0){

                        System.out.println("No se han encontrado perros en la lista de mascotas.");

                    }

                    break;

                case 0:
                    f.cls();
                    break;

          
          
            }
        }
    }

    // Llamar para ejecutar ejercicio 2
    public static void run2() {

        LinkedList <Persona> listaPersonas = new LinkedList<Persona>();
        LinkedList <Persona> listaPersonasMayores18 = new LinkedList<Persona>();
        LinkedList <Persona> listaPersonasMenores18 = new LinkedList<Persona>();

        listaPersonas.add( new Persona(30333333,"Juan","de los Palotes","Av. Juan P.Bastos 333, Ramallo","0340799999",35));
        listaPersonas.add( new Persona(22222222,"Pedro","Toscano","Av. Roca 500, Piedra del Aguila","029425999",22));
        listaPersonas.add( new Persona(12333333,"Miguel","Panadero","Av. Mignon 200, Panamá","+5075199999",50));
        listaPersonas.add( new Persona(32333333,"Juana","Dama","Av Bodegones 400, Mendoza","261199999",30));
        listaPersonas.add( new Persona(45333333,"Paula","Artreides","Av Las Dunas 150, Dunamar","029839999",22));
        listaPersonas.add( new Persona(50333333,"Filomena","Mellado","De las Armas 50, Cosquín","035144444",17));
        listaPersonas.add( new Persona(9333333,"Elsa","Payo","Ruta 38 km 50, Huerta Grande","0351111111",66));
        listaPersonas.add( new Persona(30333333,"Ángel","Gallardo","Av. Ángel Gallardo 001, Bariloche","294499999", 30));
        listaPersonas.add( new Persona(40333333,"Ángelica","Gallardo","Av. Ángel Gallardo 003, Bariloche","294488888", 28));
        listaPersonas.add( new Persona(48445534,"Martín","Pescador","Av Calderón de la Barca 200, Huerta Grande","0351342342",17));
       
       for (Persona persona : listaPersonas) {

        if (persona.getEdad() >= 18) {

            listaPersonasMayores18.add(persona);

        } else {

            listaPersonasMenores18.add(persona);

        }
        
       }

       System.out.println("Lista mayores de 18:");

       for (Persona persona : listaPersonasMayores18) {

            System.out.println(persona.toString());
        
       }

       System.out.println("Lista menores de 18:");

       for (Persona persona : listaPersonasMenores18) {

            System.out.println(persona.toString());
        
       }

    }
    
    // Llamar para ejecutar ejercicio 3
    public static void run3() {

        System.out.println("--- Practica Collections (3) ---");


        Stack<Auto> pilaAutos = new Stack<Auto>();

        for (int i = 0; i < 3; i++) {
            pilaAutos.add(new Auto());
        }

        System.out.println("Mostrando elemento tope de la pila inicial...");
        System.out.println(pilaAutos.peek().toString());
        pilaAutos.pop();
        
        pilaAutos.add(new Auto());
        pilaAutos.add(new Auto());

        System.out.println("Mostrando pila modificada...");
        for (int i = 0; i < pilaAutos.size(); i++) {
            System.out.println(pilaAutos.get(i).toString());
        }




        

      


    }
    
}

