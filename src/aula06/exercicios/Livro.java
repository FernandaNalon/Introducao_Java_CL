package aula06.exercicios;

public class Livro {

    String titulo;
    String autor;
    boolean estaEmprestado;

    void emprestar() {

        if (estaEmprestado == false) {
            estaEmprestado = true;
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("O livro já está emprestado.");
        }
    }

    void devolver() {

        if (estaEmprestado == true) {
            estaEmprestado = false;
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("O livro não estava emprestado.");
        }
    }
}
