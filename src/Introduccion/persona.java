package Introduccion;

public class persona {
    // Atributos
    String nombre;
    int edad;
    
    // Método constructor
    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Método
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años. ");
    }

    public static void main(String[] args) {
        persona juana = new persona("Juana", 25);
        juana.saludar(); // Llamada al método estático sin usar el nombre de la clase
    }
    
}  
 

