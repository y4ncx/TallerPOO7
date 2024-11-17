package Ejemplos.EjemploIncorrecto1.Paquete1;

class Persona {
    public String nombre;
    public Persona(String nombre) {
        this.nombre = nombre;
    }
}
// Paquete: paquete2
 package paquete2;
 import paquete1.Persona;
public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Juan"); // Error de compilación: Persona no es visible
    }
}