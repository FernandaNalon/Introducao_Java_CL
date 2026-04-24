package aula02.exercicios;
import java.util.Scanner;

public class Classificacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua nota: ");
		int nota = sc.nextInt();
		
		if(nota>90) {
			System.out.print("Conceito A");
		} else if (nota>70) {
			System.out.print("Conceito B");
		} else if (nota>60) {
			System.out.print("Conceito C");
		} else if (nota>40) {
			System.out.print("Conceito D");
		} else if (nota>=0) {
			System.out.print("Conceito F");
		}
		sc.close();
	}		
}
