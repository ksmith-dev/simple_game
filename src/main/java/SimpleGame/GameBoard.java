package SimpleGame;

import java.util.ArrayList;

public class GameBoard
{
    private ArrayList<Cell> cells = new ArrayList<>();

    public GameBoard()
    {
        cells.add(new GoCell());
    }

    public void addCell(Cell cell)
    {
        cells.add(cell);
    }

    public Cell getCell(int index)
    {
        return cells.get(index);
    }

    public int getCellSize()
    {
        return cells.size();
    }

    public int getCellIndex(Cell cell)
    {
        return cells.indexOf(cell);
    }
}
