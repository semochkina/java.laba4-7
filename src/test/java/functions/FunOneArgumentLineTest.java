package functions;

import org.junit.Assert;
import org.junit.Test;

/**
 * Тест для функции вида f(x) = Ax + B
 */
public class FunOneArgumentLineTest {
    /** погрешность для сравнения вещественных чисел */
    private static final double DELTA = 0.0001;

    @Test
    public void test() {
        FunOneArgumentLine fun = new FunOneArgumentLine(1, 3, 3, 2);
        System.out.println(fun.calculate(2));
        Assert.assertEquals(fun.calculate(2), 8., DELTA);
        try{
            fun.calculate(4);
            Assert.fail("Error");
        } catch (RuntimeException ex) {
            //
        }
        Assert.assertEquals(fun.segmentBegin(), 1., DELTA);
        Assert.assertEquals(fun.segmentEnd(), 3., DELTA);
    }
}
