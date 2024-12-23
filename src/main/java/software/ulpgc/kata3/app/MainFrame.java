package software.ulpgc.kata3.app;

import software.ulpgc.kata3.architecture.view.BarchartDisplay;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private final JFreeBarcharDisplay display;

    public MainFrame() {
        this.setTitle("Kata 3");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        display = new JFreeBarcharDisplay();
        this.add(BorderLayout.NORTH, new JPanel());
        this.add(display, BorderLayout.CENTER);
    }

    public BarchartDisplay getDisplay() {
        return display;
    }
}
