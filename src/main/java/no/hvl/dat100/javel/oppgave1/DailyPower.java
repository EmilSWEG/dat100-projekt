package no.hvl.dat100.javel.oppgave1;

import java.util.Locale;

public class DailyPower {

    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;
    private static final double NORGESPRIS_KWH = 0.5;

    public static void printPowerPrices(double[] prices) {
        for (double price : prices) {
            System.out.printf(Locale.US, "%.2f NOK ", price);
        }
        System.out.println();
    }

    public static void printPowerUsage(double[] usage) {
        for (double hourUsage : usage) {
            System.out.printf(Locale.US, "%.2f kWh ", hourUsage);
        }
        System.out.println();
    }

    public static double computePowerUsage(double[] usage) {
        double sum = 0;
        for (double hourUsage : usage) {
            sum += hourUsage;
        }
        return sum;
    }

    public static double computeSpotPrice(double[] usage, double[] prices) {
        double price = 0;
        for (int hour = 0; hour < usage.length; hour++) {
            price += usage[hour] * prices[hour];
        }
        return price;
    }

    private static double getSupport(double usage, double price) {
        if (price > THRESHOLD) {
            return usage * (price - THRESHOLD) * PERCENTAGE;
        }
        return 0;
    }

    public static double computePowerSupport(double[] usage, double[] prices) {
        double support = 0;
        for (int hour = 0; hour < usage.length; hour++) {
            support += getSupport(usage[hour], prices[hour]);
        }
        return support;
    }

    public static double computeNorgesPrice(double[] usage) {
        return computePowerUsage(usage) * NORGESPRIS_KWH;
    }

    public static double findPeakUsage(double[] usage) {
        double max = 0;
        for (double hourUsage : usage) {
            if (hourUsage > max) {
                max = hourUsage;
            }
        }
        return max;
    }

    public static double findAvgPower(double[] usage) {
        if (usage.length == 0) {
            return 0;
        }
        return computePowerUsage(usage) / usage.length;
    }
}
