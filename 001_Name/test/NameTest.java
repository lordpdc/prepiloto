import org.junit.Test;
import org.junit.Rule;

import static org.junit.Assert.*;
import fi.helsinki.cs.tmc.edutestutils.Points;
import fi.helsinki.cs.tmc.edutestutils.MockStdio;

public class NameTest {
    @Rule
    public MockStdio io = new MockStdio();
    @Points("1")
    @Test
    public void test() {
        Name.main(new String[0]);
        String out = io.getSysOut();
        assertTrue("Tu no imprimiste nada!",out.length()>0);
    }
}