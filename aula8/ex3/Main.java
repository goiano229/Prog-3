import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Calculadora - Aula 8 Ex3");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(380, 260);
            frame.setLocationRelativeTo(null);

            JPanel painel = new JPanel(new GridLayout(6, 2, 8, 8));
            painel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

            JTextField campoA = new JTextField();
            JTextField campoB = new JTextField();
            String[] operacoes = {"Somar", "Subtrair", "Multiplicar", "Dividir"};
            JComboBox<String> combo = new JComboBox<>(operacoes);
            JCheckBox checkDialog = new JCheckBox("Mostrar em JOptionPane");
            JLabel labelResultado = new JLabel("Resultado: ");
            JButton botaoCalcular = new JButton("Calcular");

            botaoCalcular.addActionListener(e -> {
                try {
                    double a = Double.parseDouble(campoA.getText().trim().replace(',', '.'));
                    double b = Double.parseDouble(campoB.getText().trim().replace(',', '.'));
                    double resultado;
                    String op = (String) combo.getSelectedItem();
                    switch (op) {
                        case "Somar": resultado = a + b; break;
                        case "Subtrair": resultado = a - b; break;
                        case "Multiplicar": resultado = a * b; break;
                        case "Dividir":
                            if (b == 0) {
                                JOptionPane.showMessageDialog(frame,
                                        "Divisão por zero não permitida.",
                                        "Erro", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                            resultado = a / b;
                            break;
                        default: return;
                    }
                    String texto = "Resultado: " + resultado;
                    labelResultado.setText(texto);
                    if (checkDialog.isSelected()) {
                        JOptionPane.showMessageDialog(frame, texto,
                                "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame,
                            "Entrada inválida. Use apenas números.",
                            "Erro", JOptionPane.ERROR_MESSAGE);
                }
            });

            painel.add(new JLabel("Valor A:"));
            painel.add(campoA);
            painel.add(new JLabel("Valor B:"));
            painel.add(campoB);
            painel.add(new JLabel("Operação:"));
            painel.add(combo);
            painel.add(checkDialog);
            painel.add(botaoCalcular);
            painel.add(labelResultado);

            frame.add(painel);
            frame.setVisible(true);
        });
    }
}
