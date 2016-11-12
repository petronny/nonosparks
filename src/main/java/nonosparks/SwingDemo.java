package main.java.nonosparks;

import javax.swing.*;
import javax.swing.event.MouseInputListener;

import java.awt.event.*;
import java.util.EventListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Rectangle2D;

public class SwingDemo extends JFrame {
    private static final long serialVersionUID = 1L;
    private static int size = 500;
    private JTextArea text = new JTextArea();

    public SwingDemo() {
        super();
        initUI();
    }

    private void initUI() {
        JScrollPane pane = new JScrollPane(text);
        setTitle("Nonosparks");
        setSize(size, size);
        JPanel contentPanel = new JPanel();
        JPanel Panel = new JPanel();
        contentPanel.setLayout(null);
        JButton button = new JButton("Double");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                size = size * 2;
                setSize(size, size);
                pane.setBounds(0, size / 5 * 4, size, size / 9);
                button.setBounds(0, 0, size, size / 10);
            }
        });
        button.setBounds(0, 0, size, size / 10);
        contentPanel.add(button);
        pane.setBounds(0, size / 5 * 4, size, size / 9);
        contentPanel.add(pane);
        class myMouseListener implements MouseInputListener {           
            int xinit, xfinal, x0;
            int yinit, yfinal, y0;

            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                String s = " " + x + ',' + y;
                int c = e.getButton();
                String mouseInfo = null;
                if (c == MouseEvent.BUTTON1) {
                    mouseInfo = "Left Clivked";
                } else if (c == MouseEvent.BUTTON3) {
                    mouseInfo = "Right Clicked";
                } else {
                    mouseInfo = "Roller";
                }
                text.append("MouseClicked£º" + mouseInfo + " in " + s + ".\n");

            }

            public void mouseEntered(MouseEvent e) {
                text.append("Mouse Entered.\n");
            }

            public void mouseExited(MouseEvent e) {
                text.append("Mouse Exited.\n");
            }

            public void mousePressed(MouseEvent e) {
                xinit = e.getX();
                yinit = e.getY();
            }

            public void mouseReleased(MouseEvent e) {
                xfinal = e.getX();
                yfinal = e.getY();
                String s = "Mouse dragged from " + xinit + ',' + yinit + " to "
                        + xfinal + ',' + yfinal + ".\n";
                if(xfinal!=xinit && yfinal!=yinit){
                text.append(s);
                Panel.setBackground(Color.BLUE);
                Panel.setBounds(Math.min(xinit, xfinal), Math.min(yinit, yfinal), Math.abs(xfinal
                        - xinit), Math.abs(yfinal - yinit));
                Panel.setVisible(true);
                }
            }

            public void mouseDragged(MouseEvent e) {
                x0 = e.getX();
                y0 = e.getY();
                if (x0 > 0 && x0 < size && y0 > 0 && y0 < size) {
                    Panel.setVisible(false);

                }
            }

            public void mouseMoved(MouseEvent e) {
            };
        }

        contentPanel.addMouseListener(new myMouseListener());
        contentPanel.addMouseMotionListener(new myMouseListener());
        contentPanel.add(Panel);
        getContentPane().add(contentPanel);

        // mainwindow
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingDemo mainwindow = new SwingDemo();
    }
}
