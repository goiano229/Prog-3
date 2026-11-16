import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Menu de Aplicação - Aula 8 Ex7");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(480, 240);
            frame.setLocationRelativeTo(null);
            frame.setLayout(new BorderLayout(10, 10));

            JTextField campoStatus = new JTextField();
            campoStatus.setEditable(false);
            campoStatus.setFont(new Font("SansSerif", Font.PLAIN, 14));
            campoStatus.setBorder(BorderFactory.createEmptyBorder(8, 10, 8, 10));

            JMenuBar menuBar = new JMenuBar();

            JMenu menuArquivo = new JMenu("Arquivo");
            JMenuItem itemNovo = new JMenuItem("Novo");
            JMenu submenuAbrir = new JMenu("Abrir");
            JMenuItem itemAbrirRecente = new JMenuItem("Recente");
            JMenuItem itemAbrirArquivo = new JMenuItem("Arquivo...");
            submenuAbrir.add(itemAbrirRecente);
            submenuAbrir.add(itemAbrirArquivo);
            JMenuItem itemSair = new JMenuItem("Sair");

            menuArquivo.add(itemNovo);
            menuArquivo.add(submenuAbrir);
            menuArquivo.addSeparator();
            menuArquivo.add(itemSair);

            JMenu menuAjuda = new JMenu("Ajuda");
            JMenuItem itemSobre = new JMenuItem("Sobre");
            menuAjuda.add(itemSobre);

            menuBar.add(menuArquivo);
            menuBar.add(menuAjuda);
            frame.setJMenuBar(menuBar);

            itemNovo.addActionListener(e -> campoStatus.setText("Arquivo > Novo"));
            itemAbrirRecente.addActionListener(e -> campoStatus.setText("Arquivo > Abrir > Recente"));
            itemAbrirArquivo.addActionListener(e -> campoStatus.setText("Arquivo > Abrir > Arquivo..."));
            itemSobre.addActionListener(e -> campoStatus.setText("Ajuda > Sobre"));

            itemSair.addActionListener(e -> {
                int resposta = JOptionPane.showConfirmDialog(frame,
                        "Deseja realmente sair?",
                        "Confirmar saída",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (resposta == JOptionPane.YES_OPTION) {
                    frame.dispose();
                }
            });

            JPanel painelCentro = new JPanel(new BorderLayout());
            painelCentro.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
            painelCentro.add(new JLabel("Item selecionado:"), BorderLayout.NORTH);
            painelCentro.add(campoStatus, BorderLayout.CENTER);

            frame.add(painelCentro, BorderLayout.CENTER);
            frame.setVisible(true);
        });
    }
}
