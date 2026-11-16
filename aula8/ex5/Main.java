import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Formulário de Cadastro - Aula 8 Ex5");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 220);
            frame.setLocationRelativeTo(null);
            frame.setLayout(new BorderLayout(10, 10));

            JPanel painelCampos = new JPanel(new GridLayout(3, 2, 8, 8));
            painelCampos.setBorder(BorderFactory.createEmptyBorder(15, 15, 5, 15));

            JTextField campoNome = new JTextField();
            JTextField campoEmail = new JTextField();
            JTextField campoTelefone = new JTextField();

            painelCampos.add(new JLabel("Nome:"));
            painelCampos.add(campoNome);
            painelCampos.add(new JLabel("E-mail:"));
            painelCampos.add(campoEmail);
            painelCampos.add(new JLabel("Telefone:"));
            painelCampos.add(campoTelefone);

            JPanel painelBotoes = new JPanel(new FlowLayout());
            JButton botaoSalvar = new JButton("Salvar");
            JButton botaoLimpar = new JButton("Limpar");
            painelBotoes.add(botaoSalvar);
            painelBotoes.add(botaoLimpar);

            botaoSalvar.addActionListener(e -> {
                String msg = "Nome: " + campoNome.getText() + "\n"
                        + "E-mail: " + campoEmail.getText() + "\n"
                        + "Telefone: " + campoTelefone.getText();
                JOptionPane.showMessageDialog(frame, msg,
                        "Dados Cadastrados", JOptionPane.INFORMATION_MESSAGE);
            });

            botaoLimpar.addActionListener(e -> {
                campoNome.setText("");
                campoEmail.setText("");
                campoTelefone.setText("");
            });

            frame.add(painelCampos, BorderLayout.CENTER);
            frame.add(painelBotoes, BorderLayout.SOUTH);
            frame.setVisible(true);
        });
    }
}
