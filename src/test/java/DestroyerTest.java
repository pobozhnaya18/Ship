import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DestroyerTest {
    public DestroyerTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void shouldReturnNonNullValue() {
        Destroyer destroyer = new Destroyer();

        assertNotNull(destroyer.NameAction());
    }

}