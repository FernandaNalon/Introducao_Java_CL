package aula07.praticas;

// =========================================
// Classe filha
// =========================================
// Gato herda da classe Animal.
// =========================================

public class Gato extends Animal {

    // Sobrescrita do método emitirSom()
    @Override
    void emitirSom() {

        System.out.println(nome + " faz: Miau!");
    }

    // Método específico do gato
    void arranhar() {

        System.out.println(nome + " está arranhando.");
    }
}