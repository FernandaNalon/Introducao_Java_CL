package aula06.exercicios;

public class Pizza {

    String sabor;
    String tamanho;
    double preco;
    boolean bordasRecheadas;

    double calcularPreco() {

        double precoFinal = preco;

        if (bordasRecheadas == true) {
            precoFinal += 5;
        }

        return precoFinal;
    }

    void exibirPedido() {

        System.out.println("Sabor: " + sabor);
        System.out.println("Tamanho: " + tamanho);

        if (bordasRecheadas == true) {
            System.out.println("Borda recheada: Sim");
        } else {
            System.out.println("Borda recheada: Não");
        }

        System.out.println("Preço final: R$ " + calcularPreco());
    }
}