package aula08.praticas;

// Importa a classe ArrayList, utilizada para criar listas dinâmicas
import java.util.ArrayList;

public class ListaNomes {

    public static void main(String[] args) {

        // Cria uma lista para armazenar nomes
        ArrayList<String> nomes = new ArrayList<>();

        // Adiciona elementos dentro da lista
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Fernanda");

        // Exibe a lista completa no console
        System.out.println(nomes);
    }
}