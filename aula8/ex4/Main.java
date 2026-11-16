import javax.swing.*;
import java.awt.*;

public class Main {
    private static int valor = 0;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Contador - Aula 8 Ex4");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(320, 180);
            frame.setLocationRelativeTo(null);
            frame.setLayout(new BorderLayout(10, 10));

            JLabel labelValor = new JLabel(String.valueOf(valor), SwingConstants.CENTER);
            labelValor.setFont(new Font("SansSerif", Font.BOLD, 36));

            JButton botaoMais = new JButton("+1");
            JButton botaoMenos = new JButton("-1");
            JButton botaoZerar = new JButton("Zerar");

            botaoMenos.setEnabled(false);

            Runnable atualizar = () -> {
                labelValor.setText(String.valueOf(valor));
                botaoMenos.setEnabled(valor > 0);
            };

            botaoMais.addActionListener(e -> {
                valor++;
                atualizar.run();
            });
            botaoMenos.addActionListener(e -> {
                if (valor > 0) valor--;
                atualizar.run();
            });
            botaoZerar.addActionListener(e -> {
                valor = 0;
                atualizar.run();
            });

            JPanel painelBotoes = new JPanel();
            painelBotoes.add(botaoMais);
            painelBotoes.add(botaoMenos);
            painelBotoes.add(botaoZerar);

            frame.add(labelValor, BorderLayout.CENTER);
            frame.add(painelBotoes, BorderLayout.SOUTH);
            frame.setVisible(true);
        });
    }
}
