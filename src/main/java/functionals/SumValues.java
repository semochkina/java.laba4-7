package functionals;

import interfaces.FunOneArgument;
import interfaces.Functional;

/**
 * сумма значений функции на концах отрезка и в его середине
 */
public class SumValues implements Functional<FunOneArgument> {
    private double a;
    private double b;

    public SumValues(double v, double v1) {
        this.a = v;
        this.b = v1;
    }

    @Override
    public double calculate(FunOneArgument func) {
        final double calculate = func.calculate(func.segmentBegin());
        final double calculate1 = func.calculate(func.segmentEnd());
        final double calculate2 = func.calculate((func.segmentBegin() + func.segmentEnd()) / 2);
        final double v = calculate +
                calculate1 +
                calculate2;
        return v;
    }
}
