package aula06.exercicios;

public class ContaBancaria {

    private String numeroConta;
    private double saldo;

    public ContaBancaria(String numeroConta, double saldo) {

        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {

        if (valor > 0) {

            saldo += valor;

            System.out.println("Depósito realizado!");
        } else {

            System.out.println("Valor inválido.");
        }
    }

    public void sacar(double valor) {

        if (valor <= 0) {

            System.out.println("Valor inválido.");

        } else if (valor > saldo) {

            System.out.println("Saldo insuficiente.");

        } else {

            saldo -= valor;

            System.out.println("Saque realizado!");
        }
    }
}