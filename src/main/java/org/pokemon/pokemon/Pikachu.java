package org.pokemon.pokemon;

import java.util.HashMap;
import java.util.Map;

public class Pikachu extends Pokemon{

    private Map<String, Integer> ataques;

    public Pikachu(){
        super("Electrico",0,"Pikachu");
        this.ataques = new HashMap<>();
        ataques.put("Aguilidad",2);
        ataques.put("Trueno",6);
        ataques.put("Cola de hierro",2);
    }

    public Map<String, Integer> getAtaques() {
        return ataques;
    }

    public int nivelDeAtaque() {
        int nivelAtaque = 0;
        for (int potencia : ataques.values()) {
            nivelAtaque += potencia;
        }
        return nivelAtaque;
    }

    public void entrenar(String nuevoAtaque, int potencia){
        ataques.put(nuevoAtaque, potencia);
    }
}
