package SimpleGame;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameMasterTest
{
    @Test
    public void instance() throws Exception
    {
        GameMaster instance_01 = GameMaster.instance();
        assertNotNull(instance_01);
        GameMaster instance_02 = GameMaster.instance();
        assertNotNull(instance_02);

        assertSame(instance_01, instance_02);
    }

}