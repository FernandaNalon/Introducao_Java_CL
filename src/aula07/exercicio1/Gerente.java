package aula07.exercicio1;

// Classe filha
// Herda todos os atributos e métodos da classe Funcionario
public class Gerente extends Funcionario {

    // Construtor da classe Gerente
    public Gerente(String nome, double salario) {

        // Chama o construtor da classe pai (Funcionario)
        // para inicializar os atributos nome e salario
        super(nome, salario);
    }

    // Sobrescrita do método calcularBonus()
    // O gerente possui uma regra de bônus diferente
    @Override
    public double calcularBonus() {

        // Retorna 20% do salário como bônus
        return salario * 0.20;
    }
}