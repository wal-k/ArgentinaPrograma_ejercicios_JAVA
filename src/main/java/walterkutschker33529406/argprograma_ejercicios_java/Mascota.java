package walterkutschker33529406.argprograma_ejercicios_java;


import java.util.Random;


// nombre, especie, sexo, color, pelaje y raza

class Mascota {

    // Atributos, getters y setters.

    private String nombre = "nombre_indefinido";
    private String sexo = "sexo_indefinido";
    private String especie = "especie_indefinido";
    private String pelaje = "pelaje_indefinido";
    private String color = "color_indefinido";

   public String getNombre() {
       return nombre;
   }

   public String getEspecie() {
       return especie;
   }

   public String getPelaje() {
       return pelaje;
   }

   public String getSexo() {
       return sexo;
   }

   public String getColor() {
       return color;
   }

  
   public void setNombre(String nombre) {
    this.nombre = nombre;
   }

   @Override
   public String toString(){
        
        return ("\n" + "nombre: " + this.nombre 
               + "\n" + "especie: "+this.especie
               + "\n" + "sexo: "+this.sexo 
               + "\n" + "color: "+this.color
               + "\n" + "pelaje: "+this.pelaje
               + "\n"

               );
        
    }
    
    
   // Constructor --> genero atributos al azar
   
   Mascota(){

        this.sexo       = "♂ ♀".split(" ")[ (new Random().nextBoolean()) ? 1 : 0];
        this.especie    = "gato perro conejo cobayo".split(" ")[new Random().nextInt(3)];
        this.pelaje     = "pelado corto medio largo".split(" ")[new Random().nextInt(3)];
        this.color      = "blanco negro gris pardo".split(" ")[new Random().nextInt(3)];
   }



}
