package com.comp1601.tictactoe;

import org.junit.Test;

import static org.junit.Assert.*;



/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void play_isCorrect()throws Exception {
        TicTacToeGame simpleGame =new TicTacToeGame();
        simpleGame.displayChessBoard();
        simpleGame.play(TicTacToeGame.X_PIECE,4);
        assertEquals(TicTacToeGame.X_PIECE , simpleGame.getChessBoard()[1][1]);
    }
}