package homework8;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    public void initWindow () {
        setSize(800, 400);
        setLocation(250, 550);
        int value = WindowConstants.EXIT_ON_CLOSE;
        setDefaultCloseOperation(value);

        GridLayout layout = new GridLayout(1,3);
        JPanel panel = new JPanel(layout);

        JButton firstButton = new JButton("Прямо пойдешь - лоб расшибешь");
        JButton secondButton = new JButton("Налево пойдешь - жена прибьет");
        JButton thirdButton = new JButton("Направо пойдешь - работу найдешь");
        JButton fourthButton = new JButton("А выхода нет");

        panel.add(secondButton);
        panel.add(firstButton);
        panel.add(thirdButton);
        add(fourthButton, BorderLayout.SOUTH);

        add(panel, BorderLayout.NORTH);

        setVisible(true);
    }
}
