package SimpleGame;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest
{
    @Test
    public void startPosition()
    {
        GameBoard gameBoard = new GameBoard();
        GameMaster.instance().setGameBoard(gameBoard);
        Player player1 = new Player();
        Player player2 = new Player();
        Cell go = gameBoard.getCell(0);
        assertSame(go, player1.getPosition());
        assertSame(go, player2.getPosition());
    }
}