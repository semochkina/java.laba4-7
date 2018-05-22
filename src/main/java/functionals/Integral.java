package functionals;

import interfaces.FunOneArgument;
import interfaces.Functional;

public class Integral implements Functional<FunOneArgument>{
    private double a;
    private double b;

    public Integral(double v, double v1) {
        this.a = v;
        this.b = v1;
    }

//    @Override
//    public double calculate(T func) {
//        double sum = func
//        return sum;
//    }

    @Override
    public double calculate(FunOneArgument func) {
        return 0.5 *( func.calculate(func.segmentBegin()) + func.calculate(func.segmentEnd()));
    }
}
