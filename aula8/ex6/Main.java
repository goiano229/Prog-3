import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Preferências de Texto - Aula 8 Ex6");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(480, 280);
            frame.setLocationRelativeTo(null);
            frame.setLayout(new BorderLayout(10, 10));

            JLabel labelTexto = new JLabel("Texto de exemplo", SwingConstants.CENTER);
            labelTexto.setFont(new Font("SansSerif", Font.PLAIN, 16));

            JPanel painelControles = new JPanel();
            painelControles.setLayout(new BoxLayout(painelControles, BoxLayout.Y_AXIS));
            painelControles.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));

            JCheckBox checkNegrito = new JCheckBox("Negrito");
            JCheckBox checkItalico = new JCheckBox("Itálico");

            JRadioButton radioPequeno = new JRadioButton("Pequeno (12)");
            JRadioButton radioMedio = new JRadioButton("Médio (16)", true);
            JRadioButton radioGrande = new JRadioButton("Grande (24)");
            ButtonGroup grupoTamanho = new ButtonGroup();
            grupoTamanho.add(radioPequeno);
            grupoTamanho.add(radioMedio);
            grupoTamanho.add(radioGrande);

            JPanel painelEstilo = new JPanel(new FlowLayout(FlowLayout.LEFT));
            painelEstilo.add(new JLabel("Estilo:"));
            painelEstilo.add(checkNegrito);
            painelEstilo.add(checkItalico);

            JPanel painelTamanho = new JPanel(new FlowLayout(FlowLayout.LEFT));
            painelTamanho.add(new JLabel("Tamanho:"));
            painelTamanho.add(radioPequeno);
            painelTamanho.add(radioMedio);
            painelTamanho.add(radioGrande);

            painelControles.add(painelEstilo);
            painelControles.add(painelTamanho);

            Runnable atualizar = () -> {
                int estilo = Font.PLAIN;
                if (checkNegrito.isSelected()) estilo |= Font.BOLD;
                if (checkItalico.isSelected()) estilo |= Font.ITALIC;
                int tamanho = 16;
                if (radioPequeno.isSelected()) tamanho = 12;
                else if (radioGrande.isSelected()) tamanho = 24;
                labelTexto.setFont(new Font("SansSerif", estilo, tamanho));
            };

            checkNegrito.addActionListener(e -> atualizar.run());
            checkItalico.addActionListener(e -> atualizar.run());
            radioPequeno.addActionListener(e -> atualizar.run());
            radioMedio.addActionListener(e -> atualizar.run());
            radioGrande.addActionListener(e -> atualizar.run());

            frame.add(labelTexto, BorderLayout.CENTER);
            frame.add(painelControles, BorderLayout.SOUTH);
            frame.setVisible(true);
        });
    }
}
