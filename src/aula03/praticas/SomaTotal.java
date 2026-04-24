package aula03.praticas;

public class SomaTotal {
	public static void main(String[] args) {
		int contador = 1;
		int contador2 = 1;
		int soma = 0;
		int soma2 = 0;
		
		// Estrutura WHILE
		while (contador<=5) {
			System.out.print(contador+"...");
			soma = soma+contador;
			contador++;
		}
		System.out.println(" A soma de todos os valores é: "+soma);
		
		
		// Estrutura DO WHILE
		do {
			System.out.print(contador2+"...");
			soma2 = soma2+contador2;
			contador2++;
		} while (contador2<=5);
		System.out.println(" A soma de todos os valores é: "+soma2);
	}
}
