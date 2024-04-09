package Pokeagenda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pokeagenda pokeagenda = new Pokeagenda();

        pokeagenda.addPokemon(new Pokemon("Pikachu", "Elétrico", 1));
        pokeagenda.addPokemon(new Pokemon("Charmander", "Fogo", 2));
        pokeagenda.addPokemon(new Pokemon("Bulbasaur", "Planta", 3));

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1.Adicionar Pokemon");
            System.out.println("2.Exibir Pokemons");
            System.out.println("3.Buscar Pokemon");
            System.out.println("4.Excluir Pokemon");
            System.out.println("5.Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Nome do Pokemon: ");
                    String nome = sc.nextLine();
                    System.out.println("Tipo do Pokemon: ");
                    String tipo = sc.nextLine();
                    System.out.println("Nível do Pokemon (1,2 ou 3): ");
                    int nivel = sc.nextInt();

                    pokeagenda.addPokemon(new Pokemon(nome,tipo,nivel));
                    System.out.println("Pokemon adicionado");
                    break;
                case 2:
                    System.out.println("Pokemons");
                    pokeagenda.exibir();
                    break;
                case 3:
                    System.out.println("Digíte o nome: ");
                    String nomeBusca = sc.nextLine();
                    
                    Pokemon pokemonBuscado = pokeagenda.buscar(nomeBusca);
                    if (pokemonBuscado != null){
                        System.out.println(pokemonBuscado);
                    }else{
                        System.out.println("Não encontrado");
                    }
                    break;
                case 4:
                    System.out.println("Digíte o nome: ");
                    String nomeExcluir = sc.nextLine();
                    pokeagenda.excluir(nomeExcluir);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while (opcao!=5);
        sc.close();
    }
}
