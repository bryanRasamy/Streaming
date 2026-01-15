package affichage;

import javax.swing.*;
import java.awt.*;

public class UserListPanel extends JPanel {

    public UserListPanel() {
        setPreferredSize(new Dimension(200, 0));
        setLayout(new BorderLayout());

        JLabel title = new JLabel("Participants", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 14));

        DefaultListModel<String> model = new DefaultListModel<>();
        model.addElement("PC-01");
        model.addElement("PC-02");
        model.addElement("PC-03");

        JPanel controller=new JPanel();
        controller.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 10));
        JButton btnStopShare = new JButton("Arrêter partage");
        controller.add(btnStopShare);

        JList<String> userList = new JList<>(model);
        JScrollPane scrollPane = new JScrollPane(userList);

        add(title, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(controller,BorderLayout.SOUTH);
    }
}
