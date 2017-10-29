import src.*;
import org.junit.Test;
import static org.junit.Assert.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * An example test class, which merely shows how to write JUnit tests.
 */
public class TestExample {

    @Test
    public void testModel() { 

		JFrame gui = new JFrame("Tic Tac Toe");
    	JButton[][] blocks = new JButton[3][3];
    	JButton reset = new JButton("Reset");
    	JTextArea playerturn= new JTextArea();
    	int player = 1;
    	int movesLeft = 9;

    	TicTacToeView view = new TicTacToeView(gui,reset, playerturn, blocks, player, movesLeft);
    	TicTacToe game = new TicTacToe(view, gui, blocks, reset, playerturn);
        assertEquals (1, game.player);
        assertEquals (9, game.movesLeft);
    }

    @Test
    public void testView() {

		JFrame gui = new JFrame("Tic Tac Toe");
    	JButton[][] blocks = new JButton[3][3];
    	JButton reset = new JButton("Reset");
    	JTextArea playerturn= new JTextArea();
    	int player = 1;
    	int movesLeft = 9;

    	TicTacToeView view = new TicTacToeView(gui,reset, playerturn, blocks, player, movesLeft);
    	TicTacToe game = new TicTacToe(view, gui, blocks, reset, playerturn);
        assertEquals (1, game.player);
        assertEquals (9, game.movesLeft);
    }

    @Test
    public void testController() { //tests the reset button

    	TicTacToeController controller = new TicTacToeController();
		JFrame gui = new JFrame("Tic Tac Toe");
    	JButton[][] blocks = new JButton[3][3];
    	JButton reset = new JButton("Reset");
    	JTextArea playerturn= new JTextArea();
    	int player = 1;
    	int movesLeft = 9;

    	TicTacToeView view = new TicTacToeView(gui,reset, playerturn, blocks, player, movesLeft);
    	TicTacToe game = new TicTacToe(view, gui, blocks, reset, playerturn);
    	controller.resetGame(blocks, playerturn, player, movesLeft);
        assertEquals (1, game.player);
        assertEquals (9, game.movesLeft);
    }
}
