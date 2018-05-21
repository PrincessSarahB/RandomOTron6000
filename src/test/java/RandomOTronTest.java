import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RandomOTronTest {


    RandomOTron randomOTron;
    @Before
    public void setUp() throws Exception {
        randomOTron = new RandomOTron();

    }

    @Test
    public void hasNames() {
        assertEquals(4, randomOTron.getNames().size());
    }

    @Test
    public void canGetTwoNames(){
        assertEquals(2, randomOTron.getTwoNames().size());
    }
}
