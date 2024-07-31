
package Logica;

public class Jugador {
    
    //Caracteristicas
    private String nombre;
    private int edad;
 
    //Metodo
    public String darNombre(){
        if (edad<=18) return "El primer jugador es:" + nombre + " " + edad + " años";
        return "El segundo jugador es:" + nombre + " " + edad + " años";
    }
    
    //Constructor
    public Jugador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    
}
