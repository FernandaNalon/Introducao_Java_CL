package aula01.exercicios;

public class Exercicio8 {
	
	public static void main(String[]args) {
		int idade = 13;
		boolean temTitulo = true;
		
		boolean podeVotar = idade >= 18 && temTitulo;
		
		System.out.print("Pode votar? "+ podeVotar);
	}
}
