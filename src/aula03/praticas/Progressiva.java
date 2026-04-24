package aula03.praticas;

public class Progressiva {
	public static void main(String[] args) {
		int contador = 1;
		int contador2 = 1;
		
		// Estrutura WHILE
		
		while (contador<=10) {
			System.out.print(contador + ",");
			contador++; // +1
		}
		
		// Estrutura DO WHILE
		
		do {
			System.out.print(contador2 + ",");
			contador2++; // +1
		} while (contador2<=10);
	}
}
