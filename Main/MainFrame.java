package affichage;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("Logiciel de Streaming - Réseau");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panels
        VideoPanel videoPanel = new VideoPanel();
        UserListPanel userListPanel = new UserListPanel();

        MainPanel mainPanel = new MainPanel(this);
        add(mainPanel, BorderLayout.CENTER);
    }
}
