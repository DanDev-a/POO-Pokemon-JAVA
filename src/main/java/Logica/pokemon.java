
package Logica;

public abstract class pokemon {
    
    //Caracteristicas
    protected String nombre;
    static protected String tipo;
    static protected String sexo;
    protected int pm1, pm2, pm3, pm4;
    protected int nivel;
    protected int vida;
    protected int ataque;
    protected int defensa;
    protected double peso;
    
    //Ataques
    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarAzote();
}
