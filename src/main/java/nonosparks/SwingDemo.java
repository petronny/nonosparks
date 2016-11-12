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

public class SwingDemo extends JFrame  {
	private static final long serialVersionUID = 1L;
	private static int size = 500;

	public SwingDemo() {
		super();
		initUI();
	}

	private void initUI() {
		setTitle("Nonosparks");
		setSize(size, size);
		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(null);
		JButton button = new JButton("Double");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				size = size * 2;
				setSize(size, size);
			}
		});
		button.setBounds(0,0,size,size/10);
		contentPanel.add(button);
		JTextField jtf=new JTextField(30);
		jtf.setBounds(0, size/5*4, size, size/10);
		jtf.setHorizontalAlignment(JTextField.RIGHT);
		jtf.setEditable(false);
		contentPanel.add(jtf);
		class myMouseListener  implements MouseMotionListener {
			public void mouseMoved(MouseEvent e) {
				int x=e.getX();
				int y=e.getY();
				String s="Mouse: "+x+','+y;
				jtf.setText(s);
				button.setBounds(0,0,size,size/10);
				jtf.setBounds(0, size/5*4, size, size/10);
			}
			public void mouseDragged(MouseEvent e) {};
		}
		contentPanel.addMouseMotionListener(new myMouseListener());
		getContentPane().add(contentPanel);
		// mainwindow
		setResizable(false);
		setLocation(700,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		SwingDemo mainwindow=new SwingDemo();
	}
}
