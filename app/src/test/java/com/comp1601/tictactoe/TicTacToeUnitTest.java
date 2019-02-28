package com.comp1601.tictactoe;

import junit.framework.TestCase;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.rules.Timeout;
import com.comp1601.tictactoe.TicTacToeGame;

import static junit.framework.TestCase.*;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class TicTacToeUnitTest {


    @Rule
    public Timeout timeout = Timeout.seconds(5);
    public TestName name = new TestName();

    @Test
    public void play_isCorrect()throws Exception {
        System.out.println("==============================");
        System.out.println("Test method name: {"+name.getMethodName()+"}");
        TicTacToeGame simpleGame =new TicTacToeGame();
        simpleGame.play(TicTacToeGame.X_PIECE,4);
        assertEquals(TicTacToeGame.X_PIECE , simpleGame.getChessBoard()[1][1]);
    }

    @Test
    public void playOccupied_isCorrect()throws Exception {
        System.out.println("==============================");
        System.out.println("Test method name: {"+name.getMethodName()+"}");
        TicTacToeGame simpleGame =new TicTacToeGame();
        simpleGame.play(TicTacToeGame.X_PIECE,4);
        simpleGame.play(TicTacToeGame.O_PIECE,4);
        assertEquals(TicTacToeGame.X_PIECE , simpleGame.getChessBoard()[1][1]);
    }

    @Test
    public void horizontalResult_isCorrect()throws Exception {
        System.out.println("==============================");
        System.out.println("Test method name: {"+name.getMethodName()+"}");
        TicTacToeGame simpleGame =new TicTacToeGame();
        simpleGame.play(TicTacToeGame.X_PIECE,3);
        simpleGame.play(TicTacToeGame.X_PIECE,4);
        simpleGame.play(TicTacToeGame.X_PIECE,5);
        //simpleGame.checkGameEnd();
        System.out.println("Status ret :"+simpleGame.getStatus());
        assertEquals(GameStatus.HUMAN_WIN, simpleGame.getStatus());
    }

    @Test
    public void verticalResult_isCorrect()throws Exception {

        System.out.println("==============================");
        System.out.println("Test method name: {"+name.getMethodName()+"}");
        TicTacToeGame simpleGame =new TicTacToeGame();
        simpleGame.play(TicTacToeGame.X_PIECE,1);
        simpleGame.play(TicTacToeGame.X_PIECE,4);
        simpleGame.play(TicTacToeGame.X_PIECE,7);
        //simpleGame.checkGameEnd();
        System.out.println("Status ret :"+simpleGame.getStatus());
        assertEquals(GameStatus.HUMAN_WIN, simpleGame.getStatus());
    }

    @Test
    public void diagonalResult_isCorrect()throws Exception {
         TestName name = new TestName();
        System.out.println("==============================");
        System.out.println("Test method name: {"+name.getMethodName()+"}");
        TicTacToeGame simpleGame =new TicTacToeGame();
        simpleGame.play(TicTacToeGame.X_PIECE,2);
        simpleGame.play(TicTacToeGame.X_PIECE,4);
        simpleGame.play(TicTacToeGame.X_PIECE,0);
        //simpleGame.checkGameEnd();
        //play a new piece , expected to on going
        System.out.println("Status ret :"+simpleGame.getStatus());
        assertNotSame(GameStatus.HUMAN_WIN, simpleGame.getStatus());
        //play a new piece , expected to let human win
        simpleGame.play(TicTacToeGame.X_PIECE,6);
        //simpleGame.checkGameEnd();
        System.out.println("Status ret :"+simpleGame.getStatus());
        assertEquals(GameStatus.HUMAN_WIN, simpleGame.getStatus());
    }

}