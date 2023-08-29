package org.pokemon;

import org.pokemon.entrenador.Ash;
import org.pokemon.pokemon.Charizard;
import org.pokemon.pokemon.Pikachu;
import org.pokemon.pokemon.Pokemon;
import org.pokemon.pokemon.Psyduck;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Ash ash = new Ash();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;


        do{
            System.out.println("Bienvenido al mundo Pokémon, " + ash.getNombre() + "!");
            System.out.println("1. Capturar Pokémon");
            System.out.println("2. Mostrar Pokémon capturados");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Elije un pokemon:");
                    System.out.println("1. Charizard");
                    System.out.println("2. Pikachu");
                    System.out.println("3. Psyduck");
                    System.out.print("Elige una opción: ");
                    int pokemonElegido = scanner.nextInt();
                    scanner.nextLine();

                    Pokemon nuevoPokemon = null;
                    switch(pokemonElegido){
                        case 1:
                            nuevoPokemon = new Charizard();
                        break;
                        case 2:
                            nuevoPokemon = new Pikachu();
                        break;
                        case 3:
                            nuevoPokemon = new Psyduck();
                        break;
                        default:
                            System.out.println("Opción inválida");
                        break;
                    }
                    if (nuevoPokemon != null) {
                        ash.capturarPokemon(nuevoPokemon);
                    }
                    break;

                case 2:
                    List<Pokemon> pokemonesCapturados = ash.getPokemonesCapturados();
                    if (!pokemonesCapturados.isEmpty()) {
                        System.out.println("Pokémon capturados:");
                        for (Pokemon pokemon : pokemonesCapturados) {
                            System.out.println("- " + pokemon.getNombre());
                        }
                    } else {
                        System.out.println("No has capturado ningún Pokémon aún.");
                    }
                    break;


                case 3:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }while (opcion != 3);

        scanner.close();

    }
}