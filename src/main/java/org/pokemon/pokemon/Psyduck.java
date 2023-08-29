package org.pokemon.pokemon;

public class Psyduck extends Pokemon{
    private String ataque;
    public Psyduck(){
        super("Agua",0,"Psyduck");
        this.ataque = null;
    }

    public String getAtaque() {
        return ataque;
    }

    public void entrenar(String nuevoAtaque){}
}
