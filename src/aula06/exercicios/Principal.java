package aula06.exercicios;

// Criando instancias da classe pessoa, carro, produto

public class Principal {
    public static void main(String[] args) {
    	System.out.println("Classe Pessoa");
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Ana";
        pessoa1.idade = 20;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Carlos";
        pessoa2.idade = 25;

        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Idade: " + pessoa1.idade);

        System.out.println("Nome: " + pessoa2.nome);
        System.out.println("Idade: " + pessoa2.idade);
        System.out.println("");
        
        // INSTANIA DA CLASSE CARRO 
        
        System.out.println("Classe Carro");
        Carro meuCarro = new Carro();

        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        meuCarro.ano = 2022;

        System.out.println("Marca: " + meuCarro.marca);
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Ano: " + meuCarro.ano);
        System.out.println("");
        
        // INSTANCIA DA CLASSE PRODUTO
        
        System.out.println("Classe Produto");
        Produto item = new Produto();

        item.nome = "Mouse";
        item.preco = 79.90;
        item.quantidadeEmEstoque = 15;

        System.out.println("Produto: " + item.nome);
        System.out.println("Preço: R$ " + item.preco);
        System.out.println("Quantidade em estoque: " + item.quantidadeEmEstoque);
        System.out.println("");
        
        //INSANCIA DA CLASSE CACHORRO
        
        System.out.println("Classe Cachorro");
        Cachorro meuCachorro = new Cachorro();

        meuCachorro.nome = "Bob";
        meuCachorro.raca = "Labrador";
        System.out.println("Nome: " + meuCachorro.nome);
        System.out.println("Raça: " + meuCachorro.raca);
        meuCachorro.latir();
        meuCachorro.comer();
        System.out.println("");
    
        // INSTANCIA DA CLASSE SEMAFORO
        
        System.out.println("Classe Semaforo");
        Semaforo semaforo = new Semaforo();

        semaforo.mudarParaVerde();
        semaforo.mudarParaAmarelo();
        semaforo.mudarParaVermelho();
        System.out.println("");
        
        // INSTANCIA DA CLASSE CALCULADORA
        
        System.out.println("Classe Calculadora");
        Calculadora minhaCalculadora = new Calculadora();

        System.out.println("Soma: " + minhaCalculadora.somar(10, 5));
        System.out.println("Subtração: " + minhaCalculadora.subtrair(10, 5));
        System.out.println("Multiplicação: " + minhaCalculadora.multiplicar(10, 5));
        System.out.println("Divisão: " + minhaCalculadora.dividir(10, 5));
        System.out.println("");
        
        // INSTANCIA DA CLASSE LIVRO
        
        System.out.println("Classe Livro");
        Livro livro = new Livro();

        livro.titulo = "Dom Casmurro";
        livro.autor = "Machado de Assis";

        livro.emprestar(); // primeira chamada
        livro.emprestar(); // segunda chamada

        livro.devolver();
        livro.devolver();
        System.out.println("");
        
        // INSTANCIA DA CLASSE TERMOSTATO
        
        System.out.println("Classe Termostato");
        Termostato t = new Termostato();

        t.temperaturaAtual = 22;

        t.exibirStatus();

        t.aumentarTemperatura(5);

        t.exibirStatus();

        t.diminuirTemperatura(10);

        t.exibirStatus();
        System.out.println("");
        
        // INSTANCIA DA CLASSE PIZZA
        
        System.out.println("Classe Pizza");
        Pizza pizza1 = new Pizza();

        pizza1.sabor = "Calabresa";
        pizza1.tamanho = "Grande";
        pizza1.preco = 40;
        pizza1.bordasRecheadas = true;

        Pizza pizza2 = new Pizza();

        pizza2.sabor = "Mussarela";
        pizza2.tamanho = "Média";
        pizza2.preco = 30;
        pizza2.bordasRecheadas = false;

        pizza1.exibirPedido();

        System.out.println("----------------");

        pizza2.exibirPedido();
        System.out.println("");
        
        // INSTANCIA DA CLASSE CONTABANCARIA
        
        System.out.println("Classe Conta Bancaria");
        ContaBancaria conta = new ContaBancaria("12345", 1000);

        System.out.println("Saldo: " + conta.getSaldo());

        conta.depositar(-50); // testando

        conta.depositar(500); // deposito valido

        System.out.println("Saldo: " + conta.getSaldo()); // saldo atualizado

        conta.sacar(2000); // testando

        conta.sacar(300); // saque valido

        System.out.println("Saldo final: " + conta.getSaldo()); // saldo atual
        System.out.println("");
        
        // INSTANCIA DA CLASSE ESTUDANTE
       
        System.out.println("Classe Estudante");
        Estudante estudante = new Estudante("Fernanda", 20);

        System.out.println("Idade atual: " + estudante.getIdade());

        estudante.setIdade(-5); // teste

        estudante.setIdade(150); // teste

        estudante.setIdade(25);

        System.out.println("Nova idade: " + estudante.getIdade());
        System.out.println("");
    }
}