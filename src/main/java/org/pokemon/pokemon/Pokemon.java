package org.pokemon.pokemon;

public class Pokemon {
    private String nombre;
    private String estilo;
    private int nivelDeAtaque;

    public Pokemon(){}

    public Pokemon(String estilo, int nivelDeAtaque, String nombre){
        this.estilo = estilo;
        this.nivelDeAtaque = nivelDeAtaque;
        this.nombre = nombre;

    }

    public String getEstilo() {
        return estilo;
    }
    public int getNivelDeAtaque() {return nivelDeAtaque;}
    public String getNombre() {return nombre;}

    @Override
    public String toString() {
        return "Nombre: " + nombre;
    }

}
