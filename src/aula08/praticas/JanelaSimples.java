package aula08.praticas;

// Importa a classe JFrame, usada para criar janelas
import javax.swing.JFrame;

public class JanelaSimples {

    public static void main(String[] args) {

        // Cria uma janela
        JFrame janela = new JFrame();

        // Define o título da janela
        janela.setTitle("Minha Primeira Janela");

        // Define o tamanho da janela: largura e altura
        janela.setSize(400, 300);

        // Encerra o programa ao fechar a janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Centraliza a janela na tela
        janela.setLocationRelativeTo(null);

        // Exibe a janela
        janela.setVisible(true);
    }
}