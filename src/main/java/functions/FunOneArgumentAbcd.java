package functions;

import interfaces.FunOneArgument;

/**
 * функции вида f(x) = (Ax + B) / (Cx + D)
 */
public class FunOneArgumentAbcd implements FunOneArgument {
    /**
     * начало отрезка на котором определена функция
     */
    private double segmentBegin;
    /**
     * конец отрезка на котором определена функция
     */
    private double segmentEnd;
    /**
     * аргумент A
     */
    private double argumentA;
    /**
     * аргумент B
     */
    private double argumentB;
    /**
     * аргумент C
     */
    private double argumentC;
    /**
     * аргумент D
     */
    private double argumentD;

    public FunOneArgumentAbcd(double segmentBegin,
                              double segmentEnd,
                              double argumentA,
                              double argumentB,
                              double argumentC,
                              double argumentD) {
        this.segmentBegin = segmentBegin;
        this.segmentEnd = segmentEnd;
        this.argumentA = argumentA;
        this.argumentB = argumentB;
        this.argumentC = argumentC;
        this.argumentD = argumentD;
    }

    @Override
    public double calculate(double x) {
        if (segmentBegin <= x && x <= segmentEnd) {
            return (argumentA * x + argumentB) / (argumentC * x + argumentD);
        }
        throw new RuntimeException("Ne vhodit v diapozon");
    }

    @Override
    public double segmentBegin() {
        return segmentBegin;
    }

    @Override
    public double segmentEnd() {
        return segmentEnd;
    }
}
