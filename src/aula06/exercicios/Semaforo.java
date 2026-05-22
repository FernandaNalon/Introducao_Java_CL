package aula06.exercicios;

public class Semaforo {
    String corAtual;

    void mudarParaVerde() {
        corAtual = "Verde";
        System.out.println("Semáforo mudou para: " + corAtual);
    }

    void mudarParaAmarelo() {
        corAtual = "Amarelo";
        System.out.println("Semáforo mudou para: " + corAtual);
    }

    void mudarParaVermelho() {
        corAtual = "Vermelho";
        System.out.println("Semáforo mudou para: " + corAtual);
    }
}