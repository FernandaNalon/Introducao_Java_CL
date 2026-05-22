package aula07.praticas;

// =========================================
// Classe filha
// =========================================
// Professor também herda da classe Pessoa.
// =========================================

public class Professor extends Pessoa {

    // Atributo específico do professor
    String disciplina;

    // Método específico
    void ensinar() {

        System.out.println(nome + " está ensinando " + disciplina + ".");
    }
}