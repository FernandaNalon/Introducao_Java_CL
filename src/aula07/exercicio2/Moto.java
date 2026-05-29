package aula07.exercicio2;

public class Moto extends Veiculo {

    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("A moto " + marca + " " + modelo + " está acelerando em duas rodas.");
    }
}