package SimpleGame;

import SimpleGame.Cell;
import SimpleGame.GameBoard;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameBoardTest
{
    @Test
    public void addCell() throws Exception
    {
        GameBoard gameBoard = new GameBoard();
        Cell cell = new Cell("one");

        gameBoard.addCell(cell);

        assertTrue(gameBoard.getCellNumber() == 1);
    }
}