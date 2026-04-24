package aula02.exercicios;
import java.util.Scanner;

public class CaixaEletronico {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		double saldo = 500;
		
		System.out.println("______CAIXA ELETRONICO______");
		System.out.print("Digite o valor do saque:");
		double valorSaque = sc.nextDouble();
		if (valorSaque%10!=0) {
			System.out.println("Erro: O valor deve ser multiplo de 10.");
		} else if (valorSaque>saldo) {
			System.out.println("Erro: Saldo Insuficiente");
		} else {
			saldo = saldo-valorSaque;
			System.out.println("Saque realizado com sucesso!");
			System.out.println("Novo saldo: " + saldo);
		}
		sc.close();
	}
}
