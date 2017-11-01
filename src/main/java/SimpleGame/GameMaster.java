package SimpleGame;

import java.util.ArrayList;

public class GameMaster
{
    private static GameMaster singleton;
    private GameBoard gameBoard;
    private ArrayList<Player> players;

    public static GameMaster instance()
    {
        if(singleton == null)
        {
            singleton = new GameMaster();
        }
        return singleton;
    }

    public void setGameBoard(GameBoard gameBoard)
    {
        this.gameBoard = gameBoard;
    }

    public GameBoard getGameBoard()
    {
        return this.gameBoard;
    }

    public void setNumberOfPlayers(int numberOfPlayers)
    {
        players = new ArrayList<>(numberOfPlayers);
        for(int i=0; i < numberOfPlayers; i++)
        {
            Player player = new Player();
            players.add(player);
        }
    }

    public int getNumberOfPlayers()
    {
        return players.size();
    }

    public Player getPlayer(int index)
    {
        return players.get(index);
    }

    public void movePlayer(int playerIndex, int diceRoll)
    {
        Player player = getPlayer(playerIndex);
        Cell playerPosition = player.getPosition();
        int oldIndex = gameBoard.getCellIndex(playerPosition);
        int newIndex = (oldIndex + diceRoll) % gameBoard.getCellSize();
        Cell newPosition = gameBoard.getCell(newIndex);
        player.setPosition(newPosition);
    }
}
