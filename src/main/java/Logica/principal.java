
package Logica;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String nombre1, nombre2;
        int edad1, edad2;
        int opcion;
        
        System.out.println("Introduce el nombre y edad del primer jugador");
        nombre1 = teclado.nextLine();
        edad1 = teclado.nextInt();
        
        System.out.println("");
        teclado.nextLine();
        
        System.out.println("Introduce el nombre y edad del segundo jugador");
        nombre2 = teclado.nextLine();
        edad2 = teclado.nextInt();
        
        Jugador p1 = new Jugador(nombre1, edad1);
        Jugador p2 = new Jugador(nombre2, edad2);
        batalla bat = new batalla(p1, p2);
        
        System.out.println(p1.darNombre());
        System.out.println(p2.darNombre());
        
        do{
            System.out.println(" ");
            System.out.println(" ");
            
            System.out.println("Elige una opcion...");
            System.out.println("1. Empezar batalla");
            System.out.println("2. Salir");
            
            opcion = teclado.nextInt();
            
            if(opcion == 1){
                bat.comenzar();
            }
            
        }while( opcion != 2);
       
    }
}
