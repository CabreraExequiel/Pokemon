package org.pokemon.pokemon;

public class Charizar extends Pokemon{
    private String ataque;


    public Charizar() {
        super("Fuego",5, "Charizar");
        this.ataque = "Lanza LLamas";
    }

    public String getAtaque() {
        return ataque;
    }

    public void entrenar(String nuevoAtaque){
        this.ataque = nuevoAtaque;
    }

}
