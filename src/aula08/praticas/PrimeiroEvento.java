package aula08.praticas;

// Importa os componentes gráficos do Swing
import javax.swing.JButton;
import javax.swing.JFrame;

// Importa as classes necessárias para trabalhar com eventos
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimeiroEvento {

    public static void main(String[] args) {

        // Cria a janela
        JFrame janela = new JFrame();

        // Cria o botão
        JButton botao = new JButton("Clique Aqui");

        // Adiciona um evento ao botão
        // Quando o botão for clicado, o método actionPerformed será executado
        botao.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                // Mensagem exibida no console quando o botão é clicado
                System.out.println("Botão clicado!");
            }
        });

        // Adiciona o botão na janela
        janela.add(botao);

        // Configurações da janela
        janela.setTitle("Primeiro Evento");
        janela.setSize(400, 300);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Exibe a janela
        janela.setVisible(true);
    }
}