package functions;

import org.junit.Assert;
import org.junit.Test;

/**
 * Тест для функции вида f(x) = (Ax + B) / (Cx + D)
 */
public class FunOneArgumentAbcdTest {
    /** погрешность для сравнения вещественных чисел */
    private static final double DELTA = 0.0001;

    @Test
    public void test() {
        FunOneArgumentAbcd fun = new FunOneArgumentAbcd(1, 3, 3, 2, 3, 2);
        System.out.println(fun.calculate(2));
        Assert.assertEquals(fun.calculate(2), 1., DELTA);
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
