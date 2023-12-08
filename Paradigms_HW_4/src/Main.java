/**
 * Написать скрипт для расчета корреляции Пирсона между
 * двумя случайными величинами (двумя массивами). Можете
 * использовать любую парадигму, но рекомендую использовать
 * функциональную, т.к. в этом примере она значительно
 * упростит вам жизнь.
 */

public class Main {
    public static void main(String[] args) {
        double[] x = {1, 2, 3, 4, 5};
        double[] y = {6, 7, 8, 9, 10};

        System.out.println("Корреляция Пирсона: " + PearsonCorrelation.correlation(x, y));
    }
}
