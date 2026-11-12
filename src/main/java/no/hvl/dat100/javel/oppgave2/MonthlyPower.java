package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    public static void print_PowerUsage(double[][] usage) {
        for (int day = 0; day < usage.length; day++) {
            System.out.print("Day " + (day + 1) + ": ");
            DailyPower.printPowerUsage(usage[day]);
        }
    }

    public static void print_PowerPrices(double[][] prices) {
        for (int day = 0; day < prices.length; day++) {
            System.out.print("Day " + (day + 1) + ": ");
            DailyPower.printPowerPrices(prices[day]);
        }
    }

    public static double computePowerUsage(double[][] usage) {
        double sum = 0;
        for (double[] dayUsage : usage) {
            sum += DailyPower.computePowerUsage(dayUsage);
        }
        return sum;
    }

    public static boolean exceedThreshold(double[][] powerusage, double threshold) {
        double usage = 0;
        int day = 0;

        while (day < powerusage.length && usage <= threshold) {
            usage += DailyPower.computePowerUsage(powerusage[day]);
            day++;
        }

        return usage > threshold;
    }

    public static double computeSpotPrice(double[][] usage, double[][] prices) {
        double price = 0;
        for (int day = 0; day < usage.length; day++) {
            price += DailyPower.computeSpotPrice(usage[day], prices[day]);
        }
        return price;
    }

    public static double computePowerSupport(double[][] usage, double[][] prices) {
        double support = 0;
        for (int day = 0; day < usage.length; day++) {
            support += DailyPower.computePowerSupport(usage[day], prices[day]);
        }
        return support;
    }

    public static double computeNorgesPrice(double[][] usage) {
        double price = 0;
        for (double[] dayUsage : usage) {
            price += DailyPower.computeNorgesPrice(dayUsage);
        }
        return price;
    }
}
