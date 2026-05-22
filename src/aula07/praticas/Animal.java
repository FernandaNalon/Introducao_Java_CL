package aula07.praticas;

// =========================================
// Classe pai
// =========================================
// Classe genérica que servirá de base
// para Cachorro e Gato.
// =========================================

public class Animal {

    String nome;

    // Método genérico
    void emitirSom() {

        System.out.println("O animal emitiu um som.");
    }
}