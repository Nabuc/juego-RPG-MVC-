package co.edu.udistrital.rpg.modelo;

public class Personaje {
    private String nombre;
    private String claseRPG;
    private int nivel;
    private int vida;

    //getters

    public String getNombre() {
        return nombre;
    }

    public String getClaseRPG() {
        return claseRPG;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVida() {
        return vida;
    }

    //setters
    private void setNombre(String nombre){
        this.nombre=nombre;
    }
    private void setClaseRPG(String claseRPG){
        this.claseRPG = claseRPG;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public void setVida(int vida){
        this.vida = vida;
    }
    //constructor
    public Personaje(String nombre,String claseRPG,int nivel,int vida){
        this.nombre =nombre;
        this.claseRPG = claseRPG;
        this.nivel = nivel;
        this.vida = vida;
    }
}