package main.java.nonosparks;

import javax.swing.*;

import java.awt.*;

public class Main extends JFrame {
   private static final long serialVersionUID =1L;
    
   public Main(){
       super();
       initUI();
   }
   private void initUI(){
       JPanel contentPanel=new JPanel();  
       contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
       JButton start=new JButton("Start");
       contentPanel.add(start);
       getContentPane().add(contentPanel);
   }
    public static void main(String[] args){  
        Main  mainwindow=new Main();
        mainwindow.setTitle("Nonosparks");
        mainwindow.setSize(600, 400);
        mainwindow.setResizable(true);
        mainwindow.setLocationRelativeTo(null);
        mainwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainwindow.setVisible(true);         
    }
}
