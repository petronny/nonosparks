package main.java.nonosparks;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.MouseInputListener;

public class StageWindow extends JFrame {
    private static final int cellSize = 30;
    private Board board;
    JScrollPane scrollPane;
    int MaxColumnHintSize = 0, MaxRowHintSize = 0, stage = 0;
    private boolean finished = false;
    private StageWindow thisWindow = this;

    public JMenuBar createMenuBar() {
        JMenuBar menuBar;

        // Create the menu bar.
        menuBar = new JMenuBar();

        // Build the first menu.
        JButton button = new JButton("Back");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                thisWindow.setVisible(false);
                new StagesWindow();
                thisWindow = null;
            }
        });
        menuBar.add(button);

        // Build second menu in the menu bar.
        button = new JButton("Reset");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (finished)
                    return;
                for (int i = 0; i < board.width; i++) {
                    for (int j = 0; j < board.height; j++) {
                        board.cells[i][j].SetFilled(false);
                        board.cells[i][j].SetMarked(false);
                    }

                }
                validate();
                repaint();
            }
        });
        menuBar.add(button);
        return menuBar;
    }

    class myMouseListener implements MouseInputListener {

        public void mouseClicked(MouseEvent e) {
            if (finished)
                return;
            int x = e.getX();
            int y = e.getY();
            x = x / cellSize - MaxRowHintSize;
            y = y / cellSize - MaxColumnHintSize;
            if (x < 0 || y < 0 || x >= board.width || y >= board.height)
                return;

            int c = e.getButton();
            if (c == MouseEvent.BUTTON1) {
                if (board.cells[x][y].HasMarked())
                    board.cells[x][y].SetMarked(false);
                else
                    board.cells[x][y].SetFilled(!board.cells[x][y].HasFilled());

            } else if (c == MouseEvent.BUTTON3) {

                if (board.cells[x][y].HasFilled())
                    board.cells[x][y].SetFilled(false);
                else
                    board.cells[x][y].SetMarked(!board.cells[x][y].HasMarked());
            }
            for (int i = 0; i < board.width; i++) {
                boolean[] result = board.columns[i].CheckHints();
                for (int j = 0; j < result.length; j++) {
                    if (result[j])
                        board.columns[i].labels.get(j)
                                .setForeground(Color.gray);
                    else
                        board.columns[i].labels.get(j).setForeground(
                                Color.black);
                }
            }
            for (int j = 0; j < board.height; j++) {
                boolean[] result = board.rows[j].CheckHints();
                for (int i = 0; i < result.length; i++) {
                    if (result[i])
                        board.rows[j].labels.get(i).setForeground(Color.gray);
                    else
                        board.rows[j].labels.get(i).setForeground(Color.black);
                }

            }

            validate();
            repaint();
            if (board.CheckFinished()) {
                finished = true;
                String buttonContent = "Next Stage";
                String content = board.name + '!';
                if (board.name == "")
                    content = "You have completed this stage.";
                if (stage == 0)
                    buttonContent = "Back to main menu";
                if (stage == 24)
                    buttonContent = "You have completed all stages!";
                new NotificationWindow("Stage Cleared!", content, buttonContent) {

                    @Override
                    public void callback() {
                        // TODO Auto-generated method stub
                        thisWindow.setVisible(false);
                        try {
                            if (stage == 0 || stage == 24)
                                new StagesWindow();
                            else
                                new StageWindow(stage + 1);
                        } catch (Exception e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        thisWindow = null;
                    }
                };
            }
        }

        public void mouseEntered(MouseEvent e) {
        }

        public void mouseExited(MouseEvent e) {
        }

        public void mousePressed(MouseEvent e) {
        }

        public void mouseReleased(MouseEvent e) {
        }

        public void mouseDragged(MouseEvent e) {
        }

        public void mouseMoved(MouseEvent e) {
        };
    }

    private void drawBoard(Graphics g) {

        for (int i = 0; i < board.width; i++) {
            for (int j = 0; j < board.height; j++) {
                g.setColor(Color.white);
                g.fillRect((MaxRowHintSize + i) * cellSize, cellSize
                        * (MaxColumnHintSize + j), cellSize, cellSize);
                g.setColor(Color.black);
                g.drawLine((MaxRowHintSize + i) * cellSize, cellSize
                        * (MaxColumnHintSize + j), (MaxRowHintSize + i + 1)
                        * cellSize - 1, cellSize * (MaxColumnHintSize + j));
                g.drawLine((MaxRowHintSize + i) * cellSize, cellSize
                        * (MaxColumnHintSize + j), (MaxRowHintSize + i)
                        * cellSize, cellSize * (MaxColumnHintSize + j + 1) - 1);
                g.drawLine((MaxRowHintSize + i) * cellSize, cellSize
                        * (MaxColumnHintSize + j + 1) - 1,
                        (MaxRowHintSize + i + 1) * cellSize - 1, cellSize
                                * (MaxColumnHintSize + j + 1) - 1);
                g.drawLine((MaxRowHintSize + i + 1) * cellSize - 1, cellSize
                        * (MaxColumnHintSize + j), (MaxRowHintSize + i + 1)
                        * cellSize - 1, cellSize * (MaxColumnHintSize + j + 1)
                        - 1);
                if (board.cells[i][j].HasFilled()) {
                    g.setColor(Color.black);
                    g.fillRect((MaxRowHintSize + i) * cellSize, cellSize
                            * (MaxColumnHintSize + j), cellSize, cellSize);
                } else if (board.cells[i][j].HasMarked()) {
                    g.setColor(Color.black);
                    g.drawLine((MaxRowHintSize + i) * cellSize + 1, cellSize
                            * (MaxColumnHintSize + j) + 1,
                            (MaxRowHintSize + 1 + i) * cellSize - 1, cellSize
                                    * (MaxColumnHintSize + 1 + j) - 1);
                    g.drawLine((MaxRowHintSize + i + 1) * cellSize - 1,
                            cellSize * (MaxColumnHintSize + j) + 1,
                            (MaxRowHintSize + i) * cellSize + 1, cellSize
                                    * (MaxColumnHintSize + j + 1) - 1);

                }
            }
        }
        g.setColor(Color.black);
        g.drawLine((MaxRowHintSize) * cellSize - 1, cellSize
                * (MaxColumnHintSize) - 1, (MaxRowHintSize) * cellSize - 1,
                cellSize * (MaxColumnHintSize + board.height));
        g.drawLine((MaxRowHintSize) * cellSize - 1, cellSize
                * (MaxColumnHintSize) - 1, (MaxRowHintSize + board.width)
                * cellSize, cellSize * (MaxColumnHintSize) - 1);
        g.drawLine((MaxRowHintSize) * cellSize - 1, cellSize
                * (MaxColumnHintSize + board.height),
                (MaxRowHintSize + board.width) * cellSize, cellSize
                        * (MaxColumnHintSize + board.height));
        g.drawLine((MaxRowHintSize + board.width) * cellSize, cellSize
                * (MaxColumnHintSize) - 1, (MaxRowHintSize + board.width)
                * cellSize, cellSize * (MaxColumnHintSize + board.height));
    }

    public Container createContentPane() {
        JPanel contentPane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawBoard(g);
            }
        };

        for (int i = 0; i < board.width; i++) {
            for (int j = 0; j < board.columns[i].hints.size(); j++) {
                board.columns[i].labels.get(j).setBounds(
                        (MaxRowHintSize + i) * cellSize,
                        (MaxColumnHintSize - board.columns[i].hints.size() + j)
                                * cellSize, cellSize, cellSize);
                contentPane.add(board.columns[i].labels.get(j));
            }
        }
        for (int j = 0; j < board.height; j++) {
            for (int i = 0; i < board.rows[j].hints.size(); i++) {
                board.rows[j].labels.get(i).setBounds(
                        (MaxRowHintSize - board.rows[j].hints.size() + i)
                                * cellSize, (MaxColumnHintSize + j) * cellSize,
                        cellSize, cellSize);
                contentPane.add(board.rows[j].labels.get(i));
            }
        }

        contentPane.addMouseListener(new myMouseListener());
        return contentPane;
    }

    private void Initial() {
        System.gc();
        String content = null;

        switch (board.error) {
            case NO_NAME:
                content = "No name field in Json file";
                break;
            case NO_HEIGHT:
                content = "No height field in Json file";
                break;
            case NO_WIDTH:
                content = "No width field in Json file";
                break;
            case NO_SOLUTION:
                content = "No solution field in Json file";
                break;
            case NO_ERROR:
                break;
        }
        if (board.error != Board.ERRORS.NO_ERROR) {
            new NotificationWindow("Error occured when parsing Json file",
                    content, "back") {
                @Override
                public void callback() {
                    // TODO Auto-generated method stub
                    new StagesWindow();
                }
            };
        } else {
            for (int j = 0; j < board.columns.length; j++)
                MaxColumnHintSize = Math.max(MaxColumnHintSize,
                        board.columns[j].hints.size());
            for (int j = 0; j < board.rows.length; j++)
                MaxRowHintSize = Math.max(MaxRowHintSize,
                        board.rows[j].hints.size());
            setJMenuBar(createMenuBar());
            setSize(Math.max(MaxRowHintSize + board.width + 1, 7) * cellSize,
                    Math.max(MaxColumnHintSize + board.height + 3, 8)
                            * cellSize);
            setContentPane(createContentPane());
            setTitle("Stage " + stage);
            setLayout(null);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setResizable(false);
            setVisible(true);
        }
    }

    public StageWindow(int stage) throws Exception {
        board = new Board(stage);
        this.stage = stage;
        Initial();
    }

    public StageWindow(String path) throws Exception {
        board = new Board(path);
        Initial();
    }

    public static void test() throws Exception {
        new StageWindow(1);

    }

}
