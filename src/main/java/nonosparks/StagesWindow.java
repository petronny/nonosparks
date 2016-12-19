package main.java.nonosparks;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileFilter;

public class StagesWindow extends JFrame {
    private final int width = 1000, height = 500;
    private StagesWindow thisWindow=this;
    public JMenuBar createMenuBar() {
        JMenuBar menuBar;

        // Create the menu bar.
        menuBar = new JMenuBar();

        JButton button = new JButton("Load external stage");
        button.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileFilter(new FileFilter() {
                    
                    @Override
                    public String getDescription() {
                        // TODO Auto-generated method stub
                        return "JSON Files";
                    }
                    
                    @Override
                    public boolean accept(File file) {
                        // TODO Auto-generated method stub
                        if (file.isDirectory()) {
                            return true;
                        }

                        String extension = Tools.getExtension(file);
                        if (extension != null) {
                            if (extension.equals("json")) 
                                    return true;
                             else 
                                return false;
                        }
                        return false;
                    }
                });
                fileChooser.showOpenDialog(thisWindow);
                try {
                    new StageWindow(fileChooser.getSelectedFile().getPath());
                    thisWindow.setVisible(false);
                    thisWindow=null;
                } catch (Exception e1) {
                    // TODO Auto-generated catch block
                    ;
                }
            }
        });
        menuBar.add(button);
        button=new JButton("About");
        button.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                thisWindow.setVisible(false);
                new NotificationWindow("About","Yeah~","Back") {
                    
                    @Override
                    public void callback() {
                        // TODO Auto-generated method stub
                        new StagesWindow();
                    }
                };
                thisWindow=null;
            }
        });
        menuBar.add(button);
        return menuBar;
    }
    
    public Container createContentPane() {
        JPanel contentPane = new JPanel();
        for (int i = 1; i < 25; i++) {
                JButton button = new JButton("Stage " + i);
                final int stage=i;
                
                button.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent arg0) {
                        // TODO Auto-generated method stub
                        try {
                            new StageWindow(stage);
                            thisWindow.setVisible(false);
                        } catch (Exception e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                });
                contentPane.add(button);

        }
        contentPane.setSize(width, height);
        return contentPane;
    }

    public StagesWindow() {
        System.gc();
        setJMenuBar(createMenuBar());
        setSize(width, height);
        setTitle("NoNoSparks!");
        setLocationRelativeTo(null);
        setContentPane(createContentPane());
        setLayout(new GridLayout(5,5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public static void test() {
        StagesWindow stagesWindow = new StagesWindow();

    }
}
