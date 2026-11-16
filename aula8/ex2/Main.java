import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Login - Aula 8 Ex2");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(320, 200);
            frame.setLocationRelativeTo(null);

            JPanel painel = new JPanel(new GridLayout(3, 2, 8, 8));
            painel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

            JLabel labelUsuario = new JLabel("Usuário:");
            JTextField campoUsuario = new JTextField();

            JLabel labelSenha = new JLabel("Senha:");
            JPasswordField campoSenha = new JPasswordField();

            JButton botaoEntrar = new JButton("Entrar");
            botaoEntrar.addActionListener(e -> {
                String usuario = campoUsuario.getText().trim();
                if (usuario.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Informe o usuário.",
                            "Aviso", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                JOptionPane.showMessageDialog(frame,
                        "Bem-vindo, " + usuario + "!",
                        "Login", JOptionPane.INFORMATION_MESSAGE);
            });

            painel.add(labelUsuario);
            painel.add(campoUsuario);
            painel.add(labelSenha);
            painel.add(campoSenha);
            painel.add(new JLabel());
            painel.add(botaoEntrar);

            frame.add(painel);
            frame.setVisible(true);
        });
    }
}
