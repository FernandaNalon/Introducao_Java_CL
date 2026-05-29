package aula07.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class MainPessoas {

    public static void main(String[] args) {

        // Lista polimórfica
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Maria", 45));

        pessoas.add(
                new Cliente(
                        "Roberto",
                        38,
                        "CLI-992"
                )
        );

        pessoas.add(
                new Funcionario(
                        "Fernanda",
                        28,
                        "F-105",
                        "TI"
                )
        );

        System.out.println("=== SAUDAÇÕES DINÂMICAS ===\n");

        for (Pessoa pessoa : pessoas) {
            pessoa.saudacao();
        }

        System.out.println("\n=== FIM DAS SAUDAÇÕES ===");
    }
}