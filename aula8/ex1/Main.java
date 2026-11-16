import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Boas-vindas - Aula 8 Ex1");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(360, 160);
            frame.setLocationRelativeTo(null);
            frame.setLayout(new BorderLayout(10, 10));

            JLabel label = new JLabel("Bem-vindo ao sistema!", SwingConstants.CENTER);
            label.setFont(new Font("SansSerif", Font.BOLD, 18));

            JButton botaoFechar = new JButton("Fechar");
            botaoFechar.addActionListener(e -> frame.dispose());

            JPanel painelBotao = new JPanel();
            painelBotao.add(botaoFechar);

            frame.add(label, BorderLayout.CENTER);
            frame.add(painelBotao, BorderLayout.SOUTH);
            frame.setVisible(true);
        });
    }
}
