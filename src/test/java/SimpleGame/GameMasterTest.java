package SimpleGame;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameMasterTest
{
    private GameMaster master;

    @Test
    public void instance() throws Exception
    {
        GameMaster instance_01 = GameMaster.instance();
        assertNotNull(instance_01);
        GameMaster instance_02 = GameMaster.instance();
        assertNotNull(instance_02);

        assertSame(instance_01, instance_02);
    }

    @Test
    public void playerInit()
    {
        master = GameMaster.instance();
        master.setGameBoard(new SimpleGameBoard());
        master.setNumberOfPlayers(6);
        assertEquals(6, master.getNumberOfPlayers());
        Cell go = master.getGameBoard().getCell(0);
        for(int i=0; i< 6; i++)
        {
            Player player = master.getPlayer(i);
            assertSame(go, player.getPosition());
        }
    }

    @Test
    public void movePlayerSimple()
    {
        master = GameMaster.instance();
        master.setGameBoard(new SimpleGameBoard());
        master.setNumberOfPlayers(1);
        Player player = master.getPlayer(0);
        master.movePlayer(0, 2);
        assertEquals("Blue 2", player.getPosition().getName());
        master.movePlayer(0, 3);
        assertEquals("Green 2", player.getPosition().getName());
    }

    @Test
    public void movePlayerCycle()
    {
        master = GameMaster.instance();
        master.setGameBoard(new SimpleGameBoard());
        master.setNumberOfPlayers(1);
        Player player = master.getPlayer(0);
        master.movePlayer(0, 2);
        master.movePlayer(0, 5);
        assertEquals("Blue 1", player.getPosition().getName());
    }
}