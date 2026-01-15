package affichage;

import javax.swing.*;
import java.awt.*;

public class VideoPanel extends JPanel {

    public VideoPanel() {
        setBackground(Color.BLACK);
        setLayout(new BorderLayout());

        JLabel label = new JLabel("Zone de partage d'écran", JLabel.CENTER);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Arial", Font.BOLD, 18));

        add(label, BorderLayout.CENTER);
    }
}
