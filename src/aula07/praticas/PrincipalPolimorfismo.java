package aula07.praticas;

// =========================================
// Classe principal
// =========================================
// Aqui veremos POLIMORFISMO.
// =========================================

public class PrincipalPolimorfismo {

    public static void main(String[] args) {

        // =========================================
        // Polimorfismo
        // =========================================
        // A variável é do tipo Animal,
        // mas o objeto criado é Cachorro.
        // =========================================

        Animal animal1 = new Cachorro();

        animal1.nome = "Rex";

        // =========================================
        // A variável também é Animal,
        // mas agora o objeto criado é Gato.
        // =========================================

        Animal animal2 = new Gato();

        animal2.nome = "Luna";

        // =========================================
        // Mesmo método
        // Comportamentos diferentes
        // =========================================

        animal1.emitirSom();
        animal2.emitirSom();
    }
}