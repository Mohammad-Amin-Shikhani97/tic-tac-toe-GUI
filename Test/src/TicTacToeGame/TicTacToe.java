package TicTacToeGame;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Random;

public class TicTacToe {
    private JFrame frame;
    private Player p1 = new Player();
    private Player p2 = new Player();
    private Random random = new Random();
    private Border border;
    private int currentPlayer = random.nextInt(2) + 1;
    private JButton[] buttons;
    private JLayeredPane layeredPane;

    public TicTacToe() {
        frame = new JFrame("Tic Tac Toe");
        frame.setSize(516, 540);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        startScreen();
        frame.setVisible(true);
    }
    private void  startScreen() {
        JPanel startPanel;
        JLabel wMessage;
        JButton startBtn;

        startPanel = new JPanel();
        startPanel.setBounds(0,0,500,500);
        startPanel.setLayout(null);
        startPanel.setBackground(new Color(211, 211, 211));

        wMessage = new JLabel("Welcome to Tic-Tac-Toe Game");
        wMessage.setFont(new Font("Arial", Font.BOLD,  30));
        wMessage.setHorizontalAlignment(SwingConstants.CENTER);
        wMessage.setBounds(0,0,500,150);
        startPanel.add(wMessage);

        startBtn = new JButton("Satrt");
        startBtn.setBounds(200,250,100,50);
        startBtn.setFocusable(false);
        startBtn.setBackground(new Color(0, 135, 179));
        startPanel.add(startBtn);

        frame.add(startPanel);

        startBtn.addActionListener(e-> {
            startPanel.setVisible(false);
            p1.setWins(0);
            p2.setWins(0);
            startGame();
        });

    }
    private void startGame() {
        buttons = new JButton[9];

        layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);
        layeredPane.setLayout(null);
        layeredPane.setBackground(new Color(211, 211, 211));

        JPanel headerPanel =  new JPanel();
        headerPanel.setBackground(new Color(169, 169, 169));
        headerPanel.setLayout(null);
        headerPanel.setBounds(0,0,500,125);

        JPanel winsPanel =  new JPanel();
        winsPanel.setBackground(new Color(169, 169, 169));
        winsPanel.setBounds(0,0,100,75);

        JPanel symbolsPanel =  new JPanel();
        symbolsPanel.setBackground(new Color(169, 169, 169));
        symbolsPanel.setBounds(400,0,100,75);

        JPanel turnPanel = new JPanel();
        turnPanel.setBackground(new Color(169, 169, 169));
        turnPanel.setBounds(0,75,500,50);

        JLabel p1Status = new JLabel("Player1: " + p1.getWins());
        JLabel p2Status = new JLabel("Player2: " + p2.getWins());

        setSymbols(p1, p2);
        JLabel p1Symbol = new JLabel("Player1: " + p1.getSymbol());
        JLabel p2Symbol = new JLabel("Player2: " + p2.getSymbol());

        winsPanel.add(p1Status);
        winsPanel.add(p2Status);
        symbolsPanel.add(p1Symbol);
        symbolsPanel.add(p2Symbol);

        JLabel currentPlayerText = new JLabel("Player " + currentPlayer + " turn");
        currentPlayerText.setFont(new Font("Arial", Font.ITALIC, 25));
        currentPlayerText.setForeground(new Color(4, 11, 201));
        turnPanel.add(currentPlayerText);

        headerPanel.add(winsPanel);
        headerPanel.add(symbolsPanel);
        headerPanel.add(turnPanel);
        layeredPane.add(headerPanel, Integer.valueOf(0));

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(3, 3, 0, 0));
        buttonsPanel.setBounds(0, 125, 500, 375);
        buttonsPanel.setBackground(new Color(169, 169, 169));

        border = BorderFactory.createLineBorder(new Color(169, 169, 169), 1);
        for(int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            buttons[i].setBorder(border);
            buttonsPanel.add(buttons[i]);
            buttons[i].setFocusable(false);
            buttons[i].setFont(new Font("Comic Sans MS", Font.BOLD, 50));
            buttons[i].setBackground(new Color(115, 137, 154));

            buttons[i].addActionListener(e -> {
                JButton sourceButton = (JButton) e.getSource();
                if(currentPlayer == 1) {
                    if(sourceButton.getText().equals("")) {
                        sourceButton.setText(p1.getSymbol());
                        sourceButton.setForeground(new Color(1, 63, 199));
                        if(checkFields(buttons)) {
                            p1.setWins(1);
                            p1Status.setText("Player1: " + p1.getWins());
                            playAgain();
                        }
                        currentPlayer = 2;
                        currentPlayerText.setText("Player " + currentPlayer + " turn");
                        return;
                    }
                }
                if(currentPlayer == 2) {
                    if(sourceButton.getText().equals("")) {
                        sourceButton.setText(p2.getSymbol());
                        sourceButton.setForeground(new Color(147, 3, 97));
                        if(checkFields(buttons)) {
                            p2.setWins(1);
                            p2Status.setText("Player2: " + p2.getWins());
                            playAgain();
                        }
                        currentPlayer = 1;
                        currentPlayerText.setText("Player " + currentPlayer + " turn");
                    }
                }
            });
        }
        layeredPane.add(buttonsPanel, Integer.valueOf(0));
        frame.add(layeredPane);
    }

    private void setSymbols(Player p1, Player p2) {
        int currentSymbol = random.nextInt(2);
        String[] symols = {"X", "O"};

        p1.setSymbol(symols[currentSymbol]);
        if(currentSymbol == 0) p2.setSymbol(symols[1]);
        else p2.setSymbol(symols[0]);
    }
    private boolean checkWinner(JButton btn1, JButton btn2, JButton btn3) {
        String text1 = btn1.getText();
        String text2 = btn2.getText();
        String text3 = btn3.getText();
        if(!text1.isEmpty() && text1.equals(text2) && text2.equals(text3)) {
            btn1.setBackground(new Color(10, 206, 10));
            btn2.setBackground(new Color(10, 206, 10));
            btn3.setBackground(new Color(10, 206, 10));
            return true;
        }
        return false;
    }
    private boolean checkFields(JButton[] btns) {
        return checkWinner(btns[0], btns[1], btns[2])
        || checkWinner(btns[3], btns[4], btns[5])
        || checkWinner(btns[6], btns[7], btns[8])
        || checkWinner(btns[0], btns[3], btns[6])
        || checkWinner(btns[1], btns[4], btns[7])
        || checkWinner(btns[2], btns[5], btns[8])
        || checkWinner(btns[0], btns[4], btns[8])
        || checkWinner(btns[2], btns[4], btns[6]);
    };
    private void playAgain() {

        JPanel playAgainPanel = new JPanel();
        playAgainPanel.setBounds(0, 0, 500, 500);
        playAgainPanel.setLayout(null);
        playAgainPanel.setOpaque(false); // Enable transparency

        // Create a semi-transparent background panel
        JPanel backgroundPanel = new JPanel();
        backgroundPanel.setBounds(0, 0, 500, 500);
        backgroundPanel.setBackground(new Color(0, 0, 0, 121));
        backgroundPanel.setOpaque(true); // Ensure background is opaque to show color

        // Add backgroundPanel to playAgainPanel
        playAgainPanel.add(backgroundPanel);

        // Create and add the "Play Again" button
        JButton playAgainButton = new JButton("Play Again");
        playAgainButton.setBackground(new Color(0, 153, 255));
        playAgainButton.setBounds(200, 150, 100, 50);
        playAgainButton.addActionListener(e -> {
            resetGame();
            playAgainPanel.setVisible(false);
        });
        playAgainPanel.add(playAgainButton);

        // Create and add the "Exit" button
        JButton exitButton = new JButton("Exit");
        exitButton.setBackground(new Color(255, 0, 30));
        exitButton.setForeground(Color.WHITE);
        exitButton.setBounds(200, 230, 100, 50);
        exitButton.addActionListener(e -> System.exit(0));
        playAgainPanel.add(exitButton);

        // Add playAgainPanel to layeredPane at a higher layer
        layeredPane.add(playAgainPanel, Integer.valueOf(1));
    }
    private void resetGame() {
        for(JButton btn : buttons) {
            btn.setText("");
            btn.setBackground(new Color(115, 137, 154));
        }
    }
}

