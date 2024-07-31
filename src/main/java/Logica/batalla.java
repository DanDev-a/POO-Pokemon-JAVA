
package Logica;

import java.util.Scanner;

public class batalla{
    
    //Caracteristicas
    private Scanner sc = new Scanner(System.in);
    private pikachu pika = new pikachu();
    private charmander Charmander = new charmander(); 
    private Jugador p1, p2;
    int c = 0;

    //Constructor
    public batalla(Jugador p1, Jugador p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    
    //Metodo (se esta utilizando para celegir un pokemon)
    public void comenzar(){
        int opcion = 0;
        
        //Metodo para elegir pokemon
        while(c == 0){
            
            System.out.println("Elige a tu primer pokemon " + p1.getNombre());
            System.out.println("1. Pikachu.");
            System.out.println("2. Charmander.");
            
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println(p1.getNombre() + " elegiste a..." + pika.getNombre());
                    c--;
                    break;
                case 2:
                    System.out.println(p1.getNombre() + " elegiste a..." + Charmander.getNombre());
                    c++;
                    break;
                default: System.out.println("Se acabaron los pokemons");
            }
            
            if (c == -1) {
                System.out.println("Elige a tu primer pokemon " + p2.getNombre());
                System.out.println("solo queda... ");
                System.out.println("1. Charmander.");
                
                opcion = sc.nextInt();
                
                switch(opcion){
                    case 1:
                        System.out.println(p2.getNombre() + " elegiste a..." + Charmander.getNombre());
                        break;
                    default: System.out.println("Ya no hay mas pokemons");
                }
            }
            else{
                System.out.println("Elige a tu primer pokemon " + p2.getNombre());
                System.out.println("solo queda... ");
                System.out.println("1. Pikachu.");
                
                opcion = sc.nextInt();
                
                switch(opcion){
                    case 1:
                        System.out.println(p2.getNombre() + " elegiste a..." + pika.getNombre());
                        break;
                    default: System.out.println("Ya no hay mas pokemons");
                }
            }
        }
        pelea();
    }
    
    
    public void pelea(){
        
        int opcion;
        
        do{
            pika.mostrarDatos();
            pika.mostrarEstadistica();
            System.out.println("");
            Charmander.mostrarDatos();
            Charmander.mostrarEstadistica();
            
            if(c == 1){
                do{
                System.out.println("Elige que ataque realizar " + p1.getNombre());
                System.out.println("1. Placaje.  ");
                System.out.println("2. Araniazo");
                System.out.println("3. Lanza Llamas");
                System.out.println("4. Ascuas");
                
		opcion = sc.nextInt();	
                                
                }while(opcion < 0 || opcion > 4);
                
                //Funcion de ataque
                switch(opcion){
                    case 1:
                        pika.dañoRecibido(Charmander.placaje());
                        Charmander.atacarPlacaje();
                        System.out.println("Pikachu ha recibido danio... " + pika.mostrarEstadistica());
                        break;
                    case 2:
                        pika.dañoRecibido(Charmander.araniazo());
                        Charmander.atacarAraniazo();
                        System.out.println("Pikachu ha recibido danio... " + pika.mostrarEstadistica());
                        break;
                    case 3:
                        pika.dañoRecibido(Charmander.lanzaLlamas());
                        Charmander.atacarLanzaLlamas();
                        System.out.println("Pikachu ha recibido danio... " + pika.mostrarEstadistica());
                        break;
                    case 4:
                        pika.dañoRecibido(Charmander.ascuas());
                        Charmander.atacarAscuas();
                        System.out.println("Pikachu ha recibido danio... " + pika.mostrarEstadistica());
                        break;
                    default: System.out.println("Verifica los datos");
                }
            }
            else{
                do{
                System.out.println("Elige que ataque realizar " + p1.getNombre());
                System.out.println("1. Placaje.  ");
                System.out.println("2. Araniazo");
                System.out.println("3. Bola Voltio");
                System.out.println("4. Impactrueno");
                
		opcion = sc.nextInt();	
                                
                }while(opcion < 0 || opcion > 4);
                
                //Funcion de ataque
                switch(opcion){
                    case 1:
                        pika.atacarPlacaje();
                        Charmander.dañoRecibido(pika.placaje());
                        System.out.println("Charmander ha recibido danio... " + Charmander.mostrarEstadistica());
                        break;
                    case 2:
                        pika.atacarAraniazo();
                        Charmander.dañoRecibido(pika.araniazo());
                        System.out.println("Charmander ha recibido danio... " + Charmander.mostrarEstadistica());
                        break;
                    case 3:
                        pika.bolaVoltio();
                        Charmander.dañoRecibido(pika.bolaVoltio());
                        System.out.println("Charmander ha recibido danio... " + Charmander.mostrarEstadistica());
                        break;
                    case 4:
                        pika.atacarImpactruen();
                        Charmander.dañoRecibido(pika.impactrueno());
                        System.out.println("Charmander ha recibido danio... " + Charmander.mostrarEstadistica());
                        break;
                    default: System.out.println("Verifica los datos");
                }
            }
            
        }while(pika.getVida() > 0 && Charmander.getVida() > 0);
    }
    
    
}
