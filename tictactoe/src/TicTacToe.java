package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 * Java implementation of the TicTacToe game, using the Swing framework.
 *
 * This quick-and-dirty implementation violates a number of software engineering
 * principles and needs a thorough overhaul to improve readability,
 * extensibility, and testability.
 */

public class TicTacToe { //Represents the Model now

    public int player = 1;
    public int movesLeft = 9;

    //TicTacToeView view = new TicTacToeView();
    TicTacToeController controller = new TicTacToeController();
    

    public TicTacToe(TicTacToeView view, JFrame gui, JButton[][] blocks, JButton reset, JTextArea playerturn) {



        // Initialize a JButton for each cell of the 3x3 game board.
        for(int row = 0; row<3 ;row++) {
            for(int column = 0; column<3 ;column++) {
                blocks[row][column] = new JButton();
                blocks[row][column].setPreferredSize(new Dimension(75,75));
                blocks[row][column].setText("");
                view.game.add(blocks[row][column]);
                controller.gameLogic(blocks, playerturn, row, column); //controller accessed here updates the view
            }
        }
    }


}
