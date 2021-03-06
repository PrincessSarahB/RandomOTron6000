import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RandomOTronTest {


    RandomOTron randomOTron;
    @Before
    public void setUp() throws Exception {
        randomOTron = new RandomOTron();

    }

    @Test
    public void hasNames() {
        assertEquals(19, randomOTron.getNames().size());
    }

    @Test
    public void canGetSingleName(){
        String randomName = randomOTron.getRandomName();
        assertNotNull(randomName);
    }

    @Test
    public void canGetTwoNames(){
        assertEquals(2, randomOTron.getTwoNames().size());
    }

    @Test
    public void canFindByIndex(){
        assertEquals("Sarah", randomOTron.findByIndex(0));
    }

}
