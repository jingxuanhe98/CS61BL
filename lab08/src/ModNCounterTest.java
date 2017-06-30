import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by newco on 2017/7/1.
 */
public class ModNCounterTest {
    @org.junit.Test
    public void testConstructor() {
        ModNCounter c = new ModNCounter(4);
        assertTrue(c.value() == 0);
    }

    @org.junit.Test
    public void testIncrement() throws Exception {
        ModNCounter c = new ModNCounter(4);
        for (int i = 0; i < 4; i++) {
            c.increment();
        }
        assertTrue(c.value() == 0);
    }

    @Test
    public void testReset() throws Exception {
        ModNCounter c = new ModNCounter(4);
        c.increment();
        c.reset();
        assertTrue(c.value() == 0);
    }

}