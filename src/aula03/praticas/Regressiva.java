package aula03.praticas;

public class Regressiva {
	public static void main(String[]args) {
		int contador = 10;
		int contador2 = 10;
		
		// Estrutura WHILE
		while (contador>=1) {
			System.out.print(contador+ ",");
			contador--;
		}
		
		// Estrutura DO WHILE
		
		do {
			System.out.print(contador2+ ",");
			contador2--;
		} while (contador2>=1);
	}
}
