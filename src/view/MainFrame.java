package view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Main application window. Currently shows an empty display area with a row of
 * control buttons. The buttons are wired up with no behavior yet.
 */
public class MainFrame extends JFrame {

    public MainFrame() {
        super("SE350 Scheduler");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(new JButton("Start"));
        buttonPanel.add(new JButton("Pause"));
        buttonPanel.add(new JButton("Step"));
        buttonPanel.add(new JButton("Reset"));

        add(buttonPanel, BorderLayout.SOUTH);
    }
}
