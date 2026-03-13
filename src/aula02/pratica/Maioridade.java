package aula02.pratica;

import java.util.Scanner;

public class Maioridade {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua idade:");
		int idade = sc.nextInt();
		
		if (idade>=18) {
			System.out.print("Você é maior de idade");
		} else {
			System.out.print("Você é menor de idade");
		}
		
		sc.close();
	}
}
