package aula07.exercicio3;

public class Funcionario extends Pessoa {

    private String matricula;
    private String departamento;

    public Funcionario(String nome,
                       int idade,
                       String matricula,
                       String departamento) {

        super(nome, idade);

        this.matricula = matricula;
        this.departamento = departamento;
    }

    @Override
    public void saudacao() {

        System.out.println(
                "Bom dia! Sou "
                + nome
                + ", matrícula "
                + matricula
                + ", do departamento de "
                + departamento
                + "."
        );
    }
}