package aula07.praticas;

// =========================================
// Classe principal
// =========================================
// Testando herança e sobrescrita.
// =========================================

public class PrincipalAnimal {

    public static void main(String[] args) {

        // =========================================
        // Criando um cachorro
        // =========================================

        Cachorro cachorro = new Cachorro();

        cachorro.nome = "Bob";

        cachorro.emitirSom();
        cachorro.abanarRabo();

        System.out.println("--------------------------");

        // =========================================
        // Criando um gato
        // =========================================

        Gato gato = new Gato();

        gato.nome = "Mimi";

        gato.emitirSom();
        gato.arranhar();
    }
}