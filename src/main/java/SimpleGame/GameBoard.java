package SimpleGame;

import java.util.ArrayList;

public class GameBoard
{
    private ArrayList<Cell> cells = new ArrayList<>();

    public void addCell(Cell cell)
    {
        cells.add(cell);
    }

    public int getCellNumber()
    {
        return cells.size();
    }
}
