package org.pokemon.entrenador;

import org.pokemon.pokemon.Pokemon;
import java.util.ArrayList;
import java.util.List;

public class Ash {

    private String nombre = "Ash";
    private String ciudad = "Ciudad Paleta";
    private List<Pokemon> pokemonesCapturados;

    public Ash(){}

    public Ash(List<Pokemon> pokemonesCapturados){
        this.pokemonesCapturados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public String getCiudad() {
        return ciudad;
    }
    public List<Pokemon> getPokemonesCapturados() {
        if (pokemonesCapturados == null) {
            System.out.println("No tienes pokemones");
        }
        return pokemonesCapturados;
    }
    public void capturarPokemon(Pokemon pokemon) {
        if (pokemonesCapturados == null) {
            pokemonesCapturados = new ArrayList<>();
        }
        pokemonesCapturados.add(pokemon);
        System.out.println(pokemon.getNombre() + " ha sido capturado por " + nombre);
    }









}
