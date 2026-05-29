package aula08.praticas;

import java.util.ArrayList;

public class ListaNomesForeach {

    public static void main(String[] args) {

        // Cria uma lista de nomes
        ArrayList<String> nomes = new ArrayList<>();

        // Adiciona nomes na lista
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Fernanda");

        // Percorre a lista usando foreach
        // Para cada nome dentro da lista nomes, exibe o nome no console
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}