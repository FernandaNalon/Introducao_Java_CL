package aula05.praticas;

public class Calculadora {
	
	public static int somar(int x, int y) {
		
		int resultadoSoma = x + y;
		
		return resultadoSoma;
		
	}
	
	public static int multiplicar(int x, int y) {
		int resultadoMultiplicacao = x*y;
		return resultadoMultiplicacao;
	}
	
	public static double dividir(double x, double y) {
		
		if(y == 0) {
			System.out.println("O denominador nao pode ser zero");
			return 0;
		}
		
		
		
		double resultadoDivisao = x / y;
		return resultadoDivisao; 
	}
	
	public static int subtrair(int x, int y) {
		return x - y;
	}
	

	public static void main(String[] args) {

		
		double resultado = dividir(5, 3);
		System.out.printf("Resultado: %.2f%n", resultado);
		
		System.out.println("===============  Arredondamentos  =======================");
		System.out.println(Math.ceil(resultado));; //Arredonda sempre para cima (teto).
		System.out.println(Math.floor(resultado)); // Arredonda sempre para baixo (piso).
		
		//Dividindo número por zero
		double resultado2 = dividir(5, 0);
		System.out.println(resultado2);
		
		
		//Somando dois números
		System.out.println(somar(10, 20));		
		
		//Utilizando o retorno somar
		System.out.println(somar(50, 100)*5);
		
		multiplicar(5, 7);
		
		//Utilizando o retorno da multiplicação
		System.out.println(multiplicar(5, 2)*4);
		
		//
		System.out.println(subtrair(8, 2));
		
		
	}
	
	

}
