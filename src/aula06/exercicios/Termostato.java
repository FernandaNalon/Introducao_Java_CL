package aula06.exercicios;

public class Termostato {

    double temperaturaAtual;

    void aumentarTemperatura(double valor) {

        temperaturaAtual += valor;

        System.out.println("Temperatura atual: " + temperaturaAtual);
    }

    void diminuirTemperatura(double valor) {

        temperaturaAtual -= valor;

        System.out.println("Temperatura atual: " + temperaturaAtual);
    }

    void exibirStatus() {

        System.out.println("Temperatura: " + temperaturaAtual);

        if (temperaturaAtual < 20) {
            System.out.println("Frio");
        } else if (temperaturaAtual <= 25) {
            System.out.println("Confortável");
        } else {
            System.out.println("Quente");
        }
    }
}