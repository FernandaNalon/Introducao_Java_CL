package aula07.exercicio1;

// Classe filha
// A classe Desenvolvedor herda características e comportamentos da classe Funcionario
public class Desenvolvedor extends Funcionario {

    // Construtor da classe Desenvolvedor
    public Desenvolvedor(String nome, double salario) {

        // Chama o construtor da classe pai (Funcionario)
        // para inicializar os atributos herdados
        super(nome, salario);
    }

    // Sobrescrita do método calcularBonus()
    // Desenvolvedores possuem uma regra de bônus diferente
    @Override
    public double calcularBonus() {

        // Retorna 15% do salário como bônus
        return salario * 0.15;
    }
}