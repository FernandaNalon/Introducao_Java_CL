package aula08.praticas;

import java.util.ArrayList;

public class ListaCompras {

    public static void main(String[] args) {

        // Cria uma lista para armazenar itens de compra
        ArrayList<String> compras = new ArrayList<>();

        // Adiciona itens na lista
        compras.add("Arroz");
        compras.add("Feijão");
        compras.add("Macarrão");
        compras.add("Leite");

        // Exibe o título da lista
        System.out.println("=== LISTA DE COMPRAS ===");

        // Percorre a lista e exibe cada item
        for (String item : compras) {
            System.out.println("- " + item);
        }

        // Remove um item da lista
        compras.remove("Leite");

        // Exibe a lista atualizada
        System.out.println("\n=== LISTA ATUALIZADA ===");

        for (String item : compras) {
            System.out.println("- " + item);
        }

        // Exibe a quantidade final de itens
        System.out.println("\nTotal de itens: " + compras.size());
    }
}