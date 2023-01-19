package Lab01;

public class Problem03 {

    private static double calculateProfit(double p, float r, int t) {
        double amount;

        // assuming interest is compounded once a year
        amount = p * Math.pow(1 + r, t);

        return amount - p;
    }

    public static void main(String[] args) {
        double principle = 350;
        float rate = 0.025f; // 2.5 % in decimal = 0.025
        int timeInYears = 5;

        double profit = calculateProfit(principle, rate, timeInYears);

        System.out.printf("Profit: %.3f %n", profit);
        // %f       for printing float or double
        // %.3f     for printing float or double to 3 decimal places
        // %n       for printing a new line
    }
}
