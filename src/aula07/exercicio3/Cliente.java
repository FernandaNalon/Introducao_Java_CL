package aula07.exercicio3;

public class Cliente extends Pessoa {

    private String codigoCliente;

    public Cliente(String nome, int idade, String codigoCliente) {
        super(nome, idade);
        this.codigoCliente = codigoCliente;
    }

    @Override
    public void saudacao() {

        System.out.println(
                "Olá! Sou o cliente "
                + nome
                + " (Código: "
                + codigoCliente
                + ")."
        );
    }
}