package SimpleGame;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameBoardTest
{
    @Test
    public void addCell() throws Exception
    {
        GameBoard gameBoard = new GameBoard();
        assertEquals(1, gameBoard.getCellSize());
        Cell cell = new Cell();
        gameBoard.addCell(cell);
        assertEquals(2, gameBoard.getCellSize());
    }

    @Test
    public void firstCell()
    {
        GameBoard gameBoard = new GameBoard();
        Cell firstCell = gameBoard.getCell(0);
        assertEquals(GoCell.class, firstCell.getClass());
    }

    @Test
    public void getCellIndex()
    {
        GameBoard gameBoard = new SimpleGameBoard();
        Cell blue2 = gameBoard.getCell(2);
        int index = gameBoard.getCellIndex(blue2);
        assertEquals(2, index);
        Cell noExist = new Cell();
        index = gameBoard.getCellIndex(noExist);
        assertEquals(-1, index);
    }
}