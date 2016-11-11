package main.java.nonosparks;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class SwingDemo extends JFrame  {
    private static final long serialVersionUID = 1L;
    private static int size = 100;

    public SwingDemo() {
        super();
        initUI();
    }

    private void initUI() {
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton button = new JButton("Double");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                size = size * 2;
                setSize(size, size);
            }
        });
        contentPanel.add(button);
        getContentPane().add(contentPanel);
        // mainwindow
        setTitle("Nonosparks");
        setSize(size, size);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingDemo mainwindow=new SwingDemo();
    }
}
