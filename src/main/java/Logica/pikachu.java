
package Logica;

import java.util.Random;
import java.util.Scanner;

public class pikachu extends pokemon implements IRayo{
    
    //Caracteristicas
    Random rand = new Random(System.nanoTime());
    Scanner teclado = new Scanner(System.in);

    public pikachu() {
        nombre = "Pikachu";
        sexo = "Macho";
        tipo = "Electrico";
        peso = rand.nextDouble(10.0) + 1.50;
        nivel = rand.nextInt(5) + 2; 
        ataque = 8 * nivel;
        vida = 100 + (nivel * nivel);
        defensa = 5 * nivel;
        pm1 = 20;
        pm2 = 10;
        pm3 = 5;
        pm4 = 15;
    }
    
    public String mostrarDatos(){
        return nombre + " es " + sexo + " de tipo " + tipo;
    }
    
    public String mostrarEstadistica(){
        return "vida: " + vida + "   nivel: " + nivel + "   defensa: " + defensa;
    }
    
    public int placaje(){
        int daño;
        if(pm1 > 0){
            daño = ataque;
            pm1--;
        }
        else{
            daño = 0;
        }
        return daño;
    }
    
    public int araniazo(){
        int daño;
        if(pm1 > 0){
            daño = ataque;
            pm1--;
        }
        else{
            daño = 0;
        }
        return daño;
    }
    
    public int azote(){
        int daño;
        if(pm1 > 0){
            daño = ataque - 4;
            pm1--;
        }
        else{
            daño = 0;
        }
        return daño;
    }
    
    public int impactrueno(){
        int daño;
        if(pm4 > 0){
            daño = ataque * 2;
            pm4--;
        }
        else{
            daño = 0;
        }
        return daño;
    }
    
    public int punioTrueno(){
        int daño;
        if(pm4 > 0){
            daño = (ataque + 5) * 2;
            pm4--;
        }
        else{
            daño = 0;
        }
        return daño;
    }
    
    public int bolaVoltio(){
        int daño;
        
        if(pm3 > 0){
            daño = ataque * nivel;
            pm3--;
        }
        else{
            daño = 0;
        }
        return daño;
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Pikachu ataco con Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Pikachu ataco con Araniazo");
    }

    @Override
    protected void atacarAzote() {
        System.out.println("Pikachu ataco con Azote");
    }

    @Override
    public void atacarImpactruen() {
        System.out.println("Pikachu uso Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Pikachu uso Punio Trueno");
    }

    @Override
    public void atacarBolaVoltio() {
        System.out.println("Pikachu uso Bola Voltio");
    }
    
    public Random getRand() {
        return rand;
    }

    public int getPm1() {
        return pm1;
    }

    public int getPm2() {
        return pm2;
    }

    public int getPm3() {
        return pm3;
    }

    public int getPm4() {
        return pm4;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }
    
    public int dañoRecibido(int daño){
        if (( daño - defensa) > 0){
            vida -= (daño - defensa);
        }
        return vida;
    }
    
}
