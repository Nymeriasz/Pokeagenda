package Pokeagenda;
import java.util.ArrayList;

public class Pokeagenda {
    private ArrayList<Pokemon> listaPokemon;
    public Pokeagenda(){
        listaPokemon = new ArrayList<>();
    }
    public void addPokemon(Pokemon pokemon){
        listaPokemon.add(pokemon);
    }
    public void exibir(){
        for (Pokemon pokemon:listaPokemon) {
            System.out.println(pokemon);
        }
    }
    public Pokemon buscar(String nome){
        for (Pokemon pokemon:listaPokemon) {
            if (pokemon.getNome().equalsIgnoreCase(nome)){
                return pokemon;
            }
        }
        return null;
    }
    public void excluir(String nome){
        Pokemon pokemon = buscar(nome);
        if (pokemon != null){
            listaPokemon.remove(pokemon);
            System.out.println(nome+"excluido");
        }else{
            System.out.println("não encontrado");
        }
    }
}
