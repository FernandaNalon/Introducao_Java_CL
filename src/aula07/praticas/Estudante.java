package aula07.praticas;

// =========================================
// Classe filha
// =========================================
// A classe Estudante HERDA da classe Pessoa.
// Isso significa que ela recebe:
// - nome
// - idade
// - apresentar()
// =========================================

public class Estudante extends Pessoa {

    // Atributo específico do estudante
    String curso;

    // Método específico
    void estudar() {

        System.out.println(nome + " está estudando " + curso + ".");
    }
}