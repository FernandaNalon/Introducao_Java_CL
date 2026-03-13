package aula01.exercicios;

public class Exercicio6 {
	
	public static void main(String[] args) {
		double valorOriginal = 150;
		double percentualDesconto = 15;
		
		double valorDesconto = (valorOriginal*percentualDesconto)/100;
		double valorFinal = (valorOriginal-valorDesconto);
		
		System.out.println("Preço do produto: R$"+valorOriginal);
		System.out.println("Percentual de desconto: "+percentualDesconto);
		System.out.println("Valor com desconto: R$"+valorFinal);
	}
	
}
