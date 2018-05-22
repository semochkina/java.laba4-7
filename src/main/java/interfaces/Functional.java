package interfaces;

public interface Functional<T extends FunOneArgument> {
    double calculate(T func);
}
