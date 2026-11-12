package no.hvl.dat100.javel.oppgave2;

public class MonthMain {

    public static void main(String[] args) {
        double[][] usage = MonthPowerData.powerusage_month;
        double[][] prices = MonthPowerData.powerprices_month;

        System.out.println("OPPGAVE 2");
        MonthlyPower.print_PowerUsage(usage);
        MonthlyPower.print_PowerPrices(prices);

        System.out.printf("Total usage: %.2f kWh%n", MonthlyPower.computePowerUsage(usage));
        System.out.println("Above 1000 kWh: " + MonthlyPower.exceedThreshold(usage, 1000));
        System.out.println("Above 900 kWh: " + MonthlyPower.exceedThreshold(usage, 900));
        System.out.printf("Spot price: %.2f NOK%n", MonthlyPower.computeSpotPrice(usage, prices));
        System.out.printf("Power support: %.2f NOK%n", MonthlyPower.computePowerSupport(usage, prices));
        System.out.printf("Norgespris: %.2f NOK%n", MonthlyPower.computeNorgesPrice(usage));
    }
}
