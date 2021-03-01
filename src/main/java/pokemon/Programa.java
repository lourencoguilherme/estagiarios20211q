package pokemon;

public class Programa {

    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon("Pokemon", 2);

        //print(pokemon);

        pokemon.setNivel(2);
        pokemon.setNome("Pokemon1");

        pokemon.quemEEssePokemon();

        /*
        print("Nome do pokemon: " + pokemon.getNome());

        Object pokemonObjeto = pokemon;

        print("Nome do pokemon: " + ((Pokemon) pokemonObjeto).getNome());

        print(pokemon);

        Pokemon pokemonComArgumentos = pokemon;


        print(pokemonComArgumentos);

        pokemon.setNivel(null);
        pokemon.setNome(null);

        print(pokemonComArgumentos);
        print(pokemon);
        */

    }

    public static void print(Object pokemon) {
        System.out.println(pokemon);
    }
}
