package aula07.exercicio2;

public class Carro extends Veiculo {

    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("O carro " + marca + " " + modelo + " está se deslocando em quatro rodas.");
    }
}