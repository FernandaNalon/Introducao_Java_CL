package aula06.praticas;

public class PraticaPOO {
	
	public static void main(String[] args) {
		
		// Criando o objeto aluno1 instanciando a classe Aluno
		Aluno aluno1 = new Aluno();
		
		aluno1.nome = "Fernanda";
		aluno1.idade = 26;
		
		System.out.println(aluno1.nome);
		
		Aluno aluno2 = new Aluno();
		
		aluno2.nome = "Gustavo";
		aluno2.idade = 18;
		
		System.out.println(aluno2.nome);
		
		aluno1.apresentar();
		aluno2.apresentar();
		
		
		// Criando instancia da classe conta
		
		Conta conta1 = new Conta();
		
		conta1.titular = "Ricardo";
		conta1.saldo = 123;
		
		System.out.println("Saldo Atual: " + conta1.getSaldo());
		System.out.println("Saldo com deposito: " + conta1.depositar(50));
	}
	
	
	
	
	
	
// Criando a classe aluno (molde)
static class Aluno {
	String nome;
	int idade;
			
	void apresentar() {
		System.out.println("Olá, meu nome é " + nome);
	}
}

static class Conta {
	String titular;
	private float saldo;
	
	void setSaldo(float saldo){
		if (saldo > 0) {
			this.saldo = saldo;
		} 
	}
	
	float getSaldo() {
		return saldo;
	}
	
	float depositar(float valor) {
		return saldo + valor;
	}
}

	
}
