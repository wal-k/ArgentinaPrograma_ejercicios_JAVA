package walterkutschker33529406.argprograma_ejercicios_java;

// dni, nombre, apellido, dirección, celular, edad

public class Persona {

    private int dni = 0;
    private String nombre = "";
    private String apellido = "";
    private String direccion = "";
    private String celular = "";
    private int edad = 0;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {

        return "Nombre: " + this.nombre +"\n Apellido: " + this.apellido + "\n Edad: " + this.edad + "\n";


    }

    public Persona (int dni, String nombre, String apellido, String direccion,String celular, int edad) {

        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.celular = celular;
        this.edad = edad;

    }


}
