package aula08.praticas;

// Importa os componentes necessários do Swing
import javax.swing.JButton;
import javax.swing.JFrame;

public class BotaoSimples {

    public static void main(String[] args) {

        // Cria a janela
        JFrame janela = new JFrame();

        // Cria um botão com o texto "Clique Aqui"
        JButton botao = new JButton("Clique Aqui");

        // Adiciona o botão dentro da janela
        janela.add(botao);

        // Define o título da janela
        janela.setTitle("Exemplo com Botão");

        // Define o tamanho da janela
        janela.setSize(400, 300);

        // Centraliza a janela
        janela.setLocationRelativeTo(null);

        // Encerra o programa ao fechar
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Exibe a janela
        janela.setVisible(true);
    }
}