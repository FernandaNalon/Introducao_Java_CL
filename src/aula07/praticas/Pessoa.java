package aula07.praticas;

// =========================================
// Classe Pai / Superclasse
// =========================================
// Essa classe representa uma pessoa genérica.
// Outras classes poderão HERDAR seus atributos
// e métodos usando o extends.
// =========================================

public class Pessoa {

    // Atributos comuns
    String nome;
    int idade;

    // Método comum para todas as pessoas
    void apresentar() {

        System.out.println("Olá, meu nome é " + nome);
        System.out.println("Tenho " + idade + " anos.");
    }
}