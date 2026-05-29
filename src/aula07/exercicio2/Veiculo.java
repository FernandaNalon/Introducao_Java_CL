package aula07.exercicio2;

public class Veiculo {

    protected String marca;
    protected String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mover() {
        System.out.println("O veículo está se movendo de forma genérica.");
    }
}