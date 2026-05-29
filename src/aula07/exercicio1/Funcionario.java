package aula07.exercicio1;

// Classe pai (superclasse)
// Representa um funcionário genérico da empresa
public class Funcionario {

    // Atributos protegidos
    // O modificador protected permite acesso pelas classes filhas
    protected String nome;
    protected double salario;

    // Método construtor
    // É executado automaticamente quando um novo objeto é criado
    public Funcionario(String nome, double salario) {

        // this.nome refere-se ao atributo da classe
        // nome refere-se ao parâmetro recebido
        this.nome = nome;

        // Atribui o salário recebido ao atributo do objeto
        this.salario = salario;
    }

    // Método responsável por calcular o bônus padrão
    // Funcionários comuns recebem 10% do salário como bônus
    public double calcularBonus() {
        return salario * 0.10;
    }

    // Método getter para retornar o nome do funcionário
    // Utilizado para acessar o atributo nome de forma controlada
    public String getNome() {
        return nome;
    }
}