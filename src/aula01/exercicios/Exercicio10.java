package aula01.exercicios;

public class Exercicio10 {
	public static void main(String[]args) {
		String nome = "Carlos";
		double salario = 3000;
		double bonus = 500;
		double percentualImposto = 10;
		
		double salarioComBonus = salario+bonus;
		double valorImposto = salarioComBonus*(percentualImposto/100);
		double salarioFinal = salarioComBonus - valorImposto;
		
		System.out.println("-- Perfil Financeiro --");
		System.out.println("Nome: "+ nome);
		System.out.println("Salário base: R$"+ salario);
		System.out.println("Bônus: R$"+bonus);
		System.out.println("Salário com Bônus: R$"+salarioComBonus);
		System.out.println("Imposto: R$"+valorImposto);
		System.out.println("Salário Final: R$"+salarioFinal);
	}
}
