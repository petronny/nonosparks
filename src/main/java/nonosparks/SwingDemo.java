package main.java.nonosparks;

import javax.swing.*;

import java.awt.event.*;
import java.util.EventListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

class myMouseListener  implements MouseMotionListener
{
       public void mouseMoved(MouseEvent e){
           int x=e.getX();
           int y=e.getY();
           String s="Mouse: "+x+','+y;
           SwingDemo.jtf.setText(s);
       }
         public void mouseDragged(MouseEvent e){};
}
public class SwingDemo extends JFrame  {
    private static final long serialVersionUID = 1L;
    private static int size = 500;
    public static JTextField jtf=new JTextField(30);
    
    public SwingDemo() {
        super();
        initUI();
    }

    private void initUI() {
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new FlowLayout());
        JButton button = new JButton("Double");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                size = size * 2;
                setSize(size, size);
            }
        });
        jtf.setBounds(500, 750, 50, 20);
        jtf.setHorizontalAlignment(JTextField.RIGHT);
        contentPanel.add(button);
        contentPanel.addMouseMotionListener(new myMouseListener());
        getContentPane().add(contentPanel);
        
        // mainwindow
        setTitle("Nonosparks");
        setSize(size, size);
        setResizable(false);
        setLocation(700,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingDemo mainwindow=new SwingDemo();
        mainwindow.add(jtf);
    }
}
