package affichage;
import javax.swing.*;
import java.awt.*;

public class Receiver extends JFrame{
    public Receiver() {
        setTitle("Logiciel de Streaming - Réseau");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panels
        VideoPanel videoPanel = new VideoPanel();
        JPanel ReceiverPanel = ReceiverPanel();

        add(videoPanel, BorderLayout.CENTER);
        add(ReceiverPanel, BorderLayout.EAST);
    }

    public JPanel ReceiverPanel() {
        JPanel panel=new JPanel();

        panel.setPreferredSize(new Dimension(200, 0));
        panel.setLayout(new BorderLayout());

        JLabel title = new JLabel("Participants", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 14));

        DefaultListModel<String> model = new DefaultListModel<>();
        model.addElement("PC-01");
        model.addElement("PC-02");
        model.addElement("PC-03");

        JPanel controller=new JPanel();
        controller.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 10));
        JButton btnHighReso = new JButton("Haute resolution");
        JButton btnLowReso = new JButton("Basse resolution");
        
        controller.add(btnHighReso);
        controller.add(btnLowReso);

        JList<String> userList = new JList<>(model);
        JScrollPane scrollPane = new JScrollPane(userList);

        panel.add(title, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(controller,BorderLayout.SOUTH);

        return panel;
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Receiver().setVisible(true);
        });
    }
}