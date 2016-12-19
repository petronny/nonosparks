package main.java.nonosparks;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public abstract class NotificationWindow extends JFrame {
    static final int width = 600, height = 300;
    private NotificationWindow thisWindow = this;
    private String content, buttonContent;

    public Container createContentPane() {
        JPanel contentPane = new JPanel();
        JLabel label = new JLabel();
        JButton button = new JButton(buttonContent);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                callback();
                thisWindow.setVisible(false);
                thisWindow=null;
            }
        });
        label.setText(content);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(label);
        contentPane.add(button);
        contentPane.setLayout(new GridLayout(0,1));
        return contentPane;
    };

    public NotificationWindow(String title, String content, String buttonContent) {
        System.gc();
        setTitle(title);
        this.content=content;
        this.buttonContent=buttonContent;
        setSize(width, height);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(createContentPane());
        pack();
        setVisible(true);
    }

    public abstract void callback();

    public static void test() {
        NotificationWindow notificationWindow = new NotificationWindow("Test",
                "Test!","Quit") {
            public void callback() {
                System.exit(0);
            };
        };
    }

}
