package functionals;

import functions.FunOneArgumentAbcd;
import functions.FunOneArgumentExp;
import functions.FunOneArgumentLine;
import functions.FunOneArgumentSin;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegralTest {
    private static final double delta = 1e-5;

    @Test
    public void testAbcd() {
        Integral integral = new Integral(0.5, 1.0);
        FunOneArgumentAbcd abcd = new FunOneArgumentAbcd(-2.0, 2.0, 1, 0, 1, 0);
        assertEquals(0.5, integral.calculate(abcd), delta);
    }

    @Test
    public void testExp() {
        Integral integral = new Integral(0, 1.0);
        FunOneArgumentExp sin = new FunOneArgumentExp(-2.0, 2.0, 1, 1);
        assertEquals(2.718281828459193, integral.calculate(sin), delta);
    }

    @Test
    public void testLine() {
        Integral integral = new Integral(0, 1.0);
        FunOneArgumentLine sin = new FunOneArgumentLine(-2.0, 2.0, 1, 1);
        assertEquals(1.5, integral.calculate(sin), delta);
    }

    @Test
    public void testSin() {
        Integral integral = new Integral(0, Math.PI / 2);
        FunOneArgumentSin sin = new FunOneArgumentSin(-2.0, 2.0, 1, 1);
        assertEquals(1.0, integral.calculate(sin), delta);
    }
}
