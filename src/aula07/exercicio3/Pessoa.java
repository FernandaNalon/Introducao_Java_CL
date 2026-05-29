package aula07.exercicio3;

public class Pessoa {

    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void saudacao() {
        System.out.println(
                "Olá, meu nome é "
                + nome
                + " e eu tenho "
                + idade
                + " anos."
        );
    }
}