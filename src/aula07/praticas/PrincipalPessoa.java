package aula07.praticas;

// =========================================
// Classe principal
// =========================================
// Aqui iremos testar a herança.
// =========================================

public class PrincipalPessoa {

    public static void main(String[] args) {

        // =========================================
        // Criando um objeto da classe Estudante
        // =========================================

        Estudante estudante = new Estudante();

        // Atributos herdados da classe Pessoa
        estudante.nome = "Fernanda";
        estudante.idade = 25;

        // Atributo próprio da classe Estudante
        estudante.curso = "Java";

        // Método herdado
        estudante.apresentar();

        // Método próprio
        estudante.estudar();

        System.out.println("--------------------------");

        // =========================================
        // Criando um objeto da classe Professor
        // =========================================

        Professor professor = new Professor();

        professor.nome = "Carlos";
        professor.idade = 40;
        professor.disciplina = "Orientação a Objetos";

        professor.apresentar();
        professor.ensinar();
    }
}