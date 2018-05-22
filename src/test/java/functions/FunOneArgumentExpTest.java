package functions;

import functions.FunOneArgumentExp;
import org.junit.Assert;
import org.junit.Test;

/**
 * Тест для функции вида f(x) = Aexp(x) + B
 */
public class FunOneArgumentExpTest {
    /** погрешность для сравнения вещественных чисел */
    private static final double DELTA = 0.0001;

    @Test
    public void test() {
        FunOneArgumentExp fun = new FunOneArgumentExp(1, 3, 3, 2);
        System.out.println(fun.calculate(2));
        Assert.assertEquals(fun.calculate(2), 24.16716829679195, DELTA);
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
