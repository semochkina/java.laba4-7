package functions;

import interfaces.FunOneArgument;

/**
 * функции вида f(x) = Ax + B
 */
public class FunOneArgumentLine implements FunOneArgument {
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

    public FunOneArgumentLine(double segmentBegin, double segmentEnd, double argumentA, double argumentB) {
        this.segmentBegin = segmentBegin;
        this.segmentEnd = segmentEnd;
        this.argumentA = argumentA;
        this.argumentB = argumentB;
    }

    @Override
    public double calculate(double x) {
        if (segmentBegin <= x && x <= segmentEnd) {
            return argumentA * x + argumentB;
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
