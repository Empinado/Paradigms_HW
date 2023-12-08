public class PearsonCorrelation {
    public static double correlation(double[] x, double[] y) {
        double n = x.length;
        double sum_x = 0.0;
        double sum_y = 0.0;
        double sum_xy = 0.0;
        double sum_xx = 0.0;
        double sum_yy = 0.0;

        for (int i = 0; i < n; i++) {
            sum_x += x[i];
            sum_y += y[i];
            sum_xx += x[i] * x[i];
            sum_yy += y[i] * y[i];
            sum_xy += x[i] * y[i];
        }

        double mean_x = sum_x / n;
        double mean_y = sum_y / n;

        sum_x -= n * mean_x;
        sum_y -= n * mean_y;
        sum_xy -= sum_x * mean_y - sum_y * mean_x;

        return (n * sum_xy - sum_x * sum_y) / Math.sqrt((n * sum_xx - sum_x * sum_x) * (n * sum_yy - sum_y * sum_y));
    }
}
