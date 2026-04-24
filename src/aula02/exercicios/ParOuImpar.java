package aula02.exercicios;
import java.util.Scanner;
public class ParOuImpar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número:");
		int numero = sc.nextInt();
		
		if (numero%2==0) {
			System.out.print("O número é par!");
		} else {
			System.out.print("O número é impar!");
		}
		sc.close();
	}
}
