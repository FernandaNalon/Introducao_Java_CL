package aula07.praticas;

// =========================================
// Classe filha
// =========================================
// Cachorro herda da classe Animal.
// =========================================

public class Cachorro extends Animal {

    // =========================================
    // Sobrescrita de método
    // =========================================
    // Estamos alterando o comportamento
    // do método emitirSom().
    // =========================================

    @Override
    void emitirSom() {

        System.out.println(nome + " faz: Au au!");
    }

    // Método específico do cachorro
    void abanarRabo() {

        System.out.println(nome + " está abanando o rabo.");
    }
}