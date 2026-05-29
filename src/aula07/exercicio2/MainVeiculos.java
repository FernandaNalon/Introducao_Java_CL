package aula07.exercicio2;

public class MainVeiculos {

    public static void main(String[] args) {

        Veiculo veiculoGenerico = new Veiculo("Marca Genérica", "Modelo Padrão");
        Carro meuCarro = new Carro("Toyota", "Corolla");
        Moto minhaMoto = new Moto("Honda", "CBR");

        veiculoGenerico.mover();
        meuCarro.mover();
        minhaMoto.mover();

        Veiculo outroVeiculo = new Moto("Yamaha", "Fazer");
        outroVeiculo.mover();
    }
}