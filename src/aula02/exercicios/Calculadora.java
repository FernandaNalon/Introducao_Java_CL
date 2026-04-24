package aula02.exercicios;
import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número:");
		double num1 = sc.nextDouble();
		
		System.out.print("Digite o segundo número:");
		double num2 = sc.nextDouble();
		
		System.out.print("Digite a operação (+, -, *, /):");
		char operacao = sc.next().charAt(0);
		double resultado;
		
		switch(operacao) {
		case '+':
			resultado = num1+num2;
			System.out.print("Resultado:"+resultado);
			break;
		case '-':
			if (num1<num2) {
				resultado = num2-num1;
				System.out.print("Resultado:"+resultado);
			} else {
				resultado = num1-num2;
				System.out.print("Resultado:"+resultado);
			}
			break;
		case '*':
			resultado = num1*num2;
			System.out.print("Resultado:"+resultado);
			break;
		case '/':
			if (num2!=0) {
				resultado = num1/num2;
				System.out.print("Resultado:"+resultado);
			} else {
				System.out.print("Erro: Divisão por 0");
			}
			break;
			default:
				System.out.print("Operação inválida!");
		}
		
		sc.close();
	}
	
}
