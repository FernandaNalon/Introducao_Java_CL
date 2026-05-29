package aula08.praticas;

// Importa os componentes gráficos do Swing
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Saudacao {

    public static void main(String[] args) {

        // Cria a janela
        JFrame janela = new JFrame();

        // Cria o botão
        JButton botao = new JButton("Cumprimentar");

        // Adiciona um evento de clique ao botão
        botao.addActionListener(e -> {

            // Exibe uma caixa de mensagem na tela
            JOptionPane.showMessageDialog(
                    null,
                    "Olá, aluno!"
            );
        });

        // Adiciona o botão na janela
        janela.add(botao);

        // Configurações da janela
        janela.setTitle("Saudação");
        janela.setSize(400, 300);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Exibe a janela
        janela.setVisible(true);
    }
}