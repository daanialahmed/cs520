package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class TicTacToeView {

    //TicTacToe model = new TicTacToe();
    TicTacToeController controller = new TicTacToeController();


    public static int player = 1;
    public static int movesLeft = 9;


    /**
     * The main method that starts the game.
     */
    public static JPanel game = new JPanel(new GridLayout(3,3));

    public static void startGame() {
    	JFrame gui = new JFrame("Tic Tac Toe");
    	JButton[][] blocks = new JButton[3][3];
    	JButton reset = new JButton("Reset");
    	JTextArea playerturn= new JTextArea();
    	//int player = 1;
    	//int movesLeft = 9;
    	TicTacToeView view = new TicTacToeView(gui, reset, playerturn, blocks, 1, 9);
        TicTacToe game = new TicTacToe(view, gui, blocks, reset, playerturn);
        gui.setVisible(true);
    }

	/**
    * The default constructor, which initializes the GUI.
    */

    public TicTacToeView(JFrame gui, JButton reset, JTextArea playerturn, JButton[][] blocks, int player, int movesLeft){
    	gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(new Dimension(500, 350));
        gui.setResizable(true);

        JPanel gamePanel = new JPanel(new FlowLayout());
        //JPanel game = new JPanel(new GridLayout(3,3));
        gamePanel.add(game, BorderLayout.CENTER);

        JPanel options = new JPanel(new FlowLayout());
        options.add(reset);
        JPanel messages = new JPanel(new FlowLayout());
        messages.setBackground(Color.white);

        gui.add(gamePanel, BorderLayout.NORTH);
        gui.add(options, BorderLayout.CENTER);
        gui.add(messages, BorderLayout.SOUTH);

        messages.add(playerturn);
        playerturn.setText("Player 1 to play 'X'");

        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.resetGame(blocks, playerturn, player, movesLeft);
            }
        });
    }

}