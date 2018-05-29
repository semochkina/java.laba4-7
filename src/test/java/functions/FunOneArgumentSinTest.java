package functions;

import org.junit.Assert;
import org.junit.Test;

/**
 * Тест для функции вида f(x) = Asin(Bx)
 */
public class FunOneArgumentSinTest {
    /**
     * погрешность для сравнения вещественных чисел
     */
    private static final double DELTA = 0.0001;

    @Test
    public void test() {
        FunOneArgumentSin fun = new FunOneArgumentSin(0., Math.PI, 3, 2);
        System.out.println(fun.calculate(Math.PI / 4));
        Assert.assertEquals(fun.calculate(Math.PI / 4), 3., DELTA);
        try {
            fun.calculate(4);
            Assert.fail("Error");
        } catch (RuntimeException ex) {
            //
        }
        Assert.assertEquals(fun.segmentBegin(), 0., DELTA);
        Assert.assertEquals(fun.segmentEnd(), Math.PI, DELTA);
    }
}
