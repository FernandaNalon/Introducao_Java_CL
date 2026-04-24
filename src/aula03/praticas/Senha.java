package aula03.praticas;
import java.util.Scanner;

public class Senha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a senha: ");
		int senha = sc.nextInt();
		
		// Estrutura WHILE
		while (senha!=1234) {
			System.out.println("Senha incorreta, digite novamente: ");
			senha = sc.nextInt();
		}
		
		// Estrutura DO WHILE
		do {
			System.out.println("Senha incorreta, digite novamente: ");
			senha = sc.nextInt();
		}while (senha!=1234);
		
		System.out.print("Login realizado com sucesso!");
		
	}
}
