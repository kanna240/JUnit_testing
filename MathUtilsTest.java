import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathUtilsTest {
    private MathUtils mathUtils;

    @Before
    public void setUp() {
        mathUtils = new MathUtils();
    }

    @After
    public void tearDown() {
        mathUtils = null;
    }

    @Test
    public void testAdd() {
        assertEquals(4, mathUtils.add(2, 2));
    }

    @Test
    public void testSubtract() {
        assertEquals(3, mathUtils.subtract(5, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(10, mathUtils.multiply(2, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, mathUtils.divide(10, 5), 0.0);
        assertEquals(-1.0, mathUtils.divide(10, 0), 0.0);
    }
}