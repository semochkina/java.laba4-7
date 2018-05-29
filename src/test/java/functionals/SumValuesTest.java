package functionals;

import functions.FunOneArgumentAbcd;
import functions.FunOneArgumentExp;
import functions.FunOneArgumentLine;
import functions.FunOneArgumentSin;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SumValuesTest {
    private static final double delta = 1e-7;

    @Test
    public void testAbcd() {
        SumValues sumValues = new SumValues(0, 1.0);
        FunOneArgumentAbcd abcd = new FunOneArgumentAbcd(1.0, 2.0, 1, 0, 1, 0);
        assertEquals(3.0, sumValues.calculate(abcd), delta);
    }

    @Test
    public void testExp() {
        SumValues sumValues = new SumValues(0, 1.0);
        FunOneArgumentExp sin = new FunOneArgumentExp(-2.0, 2.0, 1, 1);
        assertEquals(11.524391382167263, sumValues.calculate(sin), delta);
    }

    @Test
    public void testLine() {
        SumValues sumValues = new SumValues(0, 1.0);
        FunOneArgumentLine sin = new FunOneArgumentLine(-2.0, 2.0, 1, 1);
        assertEquals(3.0, sumValues.calculate(sin), delta);
    }

    @Test
    public void testSin() {
        SumValues sumValues = new SumValues(0, Math.PI / 2);
        FunOneArgumentSin sin = new FunOneArgumentSin(-2.0, 2.0, 1, 1);
        assertEquals(0.0, sumValues.calculate(sin), delta);
    }
}

