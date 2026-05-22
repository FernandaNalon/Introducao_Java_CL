package aula06.exercicios;

public class Estudante {

    private String nome;
    private int idade;

    public Estudante(String nome, int idade) {

        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {

        if (novaIdade > 0 && novaIdade < 120) {

            idade = novaIdade;

            System.out.println("Idade atualizada.");
        } else {

            System.out.println("Idade inválida.");
        }
    }
}