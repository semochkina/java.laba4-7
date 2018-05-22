package functionals;

import functions.FunOneArgumentSin;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestIntegral {
    private static final double delta = 1e-7;
    @Test
    public void testIntegral() {
        Integral F = new Integral(-1.0, 1.0);
        FunOneArgumentSin sin = new FunOneArgumentSin(-2.0, 2.0, 1,1);
        double actual = F.calculate(sin);

        assertEquals(0.0, actual, delta);
    }
}
