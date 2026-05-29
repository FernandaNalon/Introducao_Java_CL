package aula08.praticas;

import java.util.ArrayList;

public class ListaNomesRemocao {

    public static void main(String[] args) {

        // Cria uma lista de nomes
        ArrayList<String> nomes = new ArrayList<>();

        // Adiciona nomes na lista
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Fernanda");

        // Remove um nome específico da lista
        nomes.remove("Carlos");

        // Exibe a quantidade de elementos restantes
        System.out.println("Quantidade de nomes: " + nomes.size());

        // Percorre e exibe os nomes que sobraram na lista
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}