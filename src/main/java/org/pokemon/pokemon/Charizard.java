package org.pokemon.pokemon;

public class Charizard extends Pokemon{
    private String ataque;


    public Charizard() {
        super("Fuego",5, "Charizard");
        this.ataque = "Lanza LLamas";
    }

    public String getAtaque() {
        return ataque;
    }

    public void entrenar(String nuevoAtaque){
        this.ataque = nuevoAtaque;
    }

}
