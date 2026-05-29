package aula07.exercicio1;

// Importa a classe ArrayList
// Utilizada para criar listas dinâmicas
import java.util.ArrayList;

// Importa a interface List
// Permite trabalhar com coleções de objetos
import java.util.List;

public class MainRH {

    public static void main(String[] args) {

        // Criação de uma lista de funcionários
        // A lista é do tipo Funcionario, mas pode armazenar
        // objetos das classes filhas (Gerente e Desenvolvedor)
        // Isso é um exemplo de Polimorfismo.
        List<Funcionario> funcionarios = new ArrayList<>();

        // Adiciona um objeto da classe Gerente na lista
        funcionarios.add(new Gerente("Ana Silva", 8000));

        // Adiciona um objeto da classe Desenvolvedor na lista
        funcionarios.add(new Desenvolvedor("Carlos Mendes", 5000));

        // Adiciona um objeto da própria classe Funcionario
        funcionarios.add(new Funcionario("João Pereira", 3000));

        // Exibe um título no console
        System.out.println("=== CÁLCULO DE BÔNUS ===");

        // Percorre todos os elementos da lista
        // A cada repetição, a variável funcionario recebe um objeto da lista
        for (Funcionario funcionario : funcionarios) {

            // Exibe o nome do funcionário e o valor do bônus calculado
            System.out.println(
                    funcionario.getNome()
                    + " - Bônus: R$ "
                    + funcionario.calcularBonus()
            );
        }
    }
}