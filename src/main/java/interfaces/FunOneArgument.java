package interfaces;

/**
 * Интерфейс для понятия «функция одного вещественного аргумента,
 * определенная на отрезке [a; b]»
 */
public interface FunOneArgument {
    /**
     * метод вычисления значения функции при заданном аргументе
     *
     * @param x - аргумент
     * @return - результат — число
     */
    double calculate(double x);

    /**
     * @return начало отрезка на котором определена функция
     */
    double segmentBegin();

    /**
     * @return конец отрезка на котором определена функция
     */
    double segmentEnd();
}