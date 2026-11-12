package no.hvl.dat100.javel.oppgave1;

public class DayMain {

    public static void main(String[] args) {
        double[] usage = DayPowerData.powerusage_day;
        double[] prices = DayPowerData.powerprices_day;

        System.out.println("OPPGAVE 1");
        DailyPower.printPowerPrices(prices);
        DailyPower.printPowerUsage(usage);

        System.out.printf("Total usage: %.2f kWh%n", DailyPower.computePowerUsage(usage));
        System.out.printf("Spot price: %.2f NOK%n", DailyPower.computeSpotPrice(usage, prices));
        System.out.printf("Power support: %.2f NOK%n", DailyPower.computePowerSupport(usage, prices));
        System.out.printf("Norgespris: %.2f NOK%n", DailyPower.computeNorgesPrice(usage));
        System.out.printf("Peak usage: %.2f kWh%n", DailyPower.findPeakUsage(usage));
        System.out.printf("Average hourly usage: %.2f kWh%n", DailyPower.findAvgPower(usage));
    }
}
