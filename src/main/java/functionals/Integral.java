package functionals;

import interfaces.FunOneArgument;
import interfaces.Functional;

/**
 * определенный интеграл на отрезке [a; b] (пределы интегрирования хранятся как поля и
 * устанавливаются конструктором, если область определения функции не содержится в [a; b],
 * то выбрасывается исключение), интегрирование производить методом прямоугольников.
 */
public class Integral implements Functional<FunOneArgument> {
    private double a;
    private double b;

    public Integral(double v, double v1) {
        this.a = v;
        this.b = v1;
    }

    @Override
    public double calculate(FunOneArgument func) {
        double result = 0.;
        // производим интегрирование методом прямоугольников
        double dx = 0.000001;
        double x = a;
        while (x < b) {
            double valueFun = func.calculate(x + dx / 2);
            if (valueFun == Double.NaN) {
                // определения функции не содержится в данной точке
                throw new RuntimeException("For x=" + x + " " + func.getClass() + " return NaN");
            }
            result += valueFun * dx;
            x += dx;
        }
        return result;
    }
}
