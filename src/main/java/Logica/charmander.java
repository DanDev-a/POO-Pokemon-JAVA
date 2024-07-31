
package Logica;

import java.util.Random;

public class charmander extends pokemon implements IFuego {
    Random rand = new Random(System.nanoTime());
    
    public charmander() {
        nombre = "Charmander";
        sexo = "Macho";
        tipo = "Fuego";
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
        return nombre + "  sexo:" + sexo + "  tipo:" + tipo;
    }
    
    public String mostrarEstadistica(){
        return "vida: " + vida + "  nivel: " + nivel + "  defensa:" + defensa;
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
    
    public int lanzaLlamas(){
        int daño;
        if(pm2 > 0){
            daño = ataque + (nivel * nivel);
            pm2--;
        }
        else{
            daño = 0;
        }
        return daño;
    }
    
    public int punioFuego(){
        int daño;
        if(pm4 > 0){
            daño = ataque + (nivel * 2);
            pm4--;
        }
        else{
            daño = 0;
        }
        return daño;
    }
    
    public int ascuas(){
        int daño;
        if(pm3 > 0){
            daño = ataque * 2;
            pm3--;
        }
        else{
            daño = 0;
        }
        return daño;
    }
    
    @Override
    protected void atacarPlacaje() {
    }

    @Override
    protected void atacarAraniazo() {
    }

    @Override
    protected void atacarAzote() {
    }

    @Override
    public void atacarLanzaLlamas() {
    }

    @Override
    public void atacarPunioFuego() {
    }

    @Override
    public void atacarAscuas() {
        }

    public Random getRand() {
        return rand;
    }

    public String getNombre() {
        return nombre;
    }

    public static String getTipo() {
        return tipo;
    }

    public static String getSexo() {
        return sexo;
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

    public double getPeso() {
        return peso;
    }
    
    public int dañoRecibido(int daño){
        if (( daño - defensa) > 0){
            vida -= (daño - defensa);
        }
        return vida;
    }
}

    

    

