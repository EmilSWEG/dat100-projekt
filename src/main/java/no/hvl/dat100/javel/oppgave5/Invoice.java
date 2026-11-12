package no.hvl.dat100.javel.oppgave5;

import java.util.Locale;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import no.hvl.dat100.javel.oppgave3.Customer;

public class Invoice {

    private Customer c;
    private String month;
    private double[][] usage;
    private double[][] prices;
    private double amount;

    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {
        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = power_prices;
        this.amount = 0;
    }

    public void computeAmount() {
        switch (c.getAgreement()) {
            case SPOTPRICE:
                amount = MonthlyPower.computeSpotPrice(usage, prices);
                break;
            case POWERSUPPORT:
                amount = MonthlyPower.computeSpotPrice(usage, prices)
                        - MonthlyPower.computePowerSupport(usage, prices);
                break;
            case NORGESPRICE:
                amount = MonthlyPower.computeNorgesPrice(usage);
                break;
        }
    }

    public void printInvoice() {
        System.out.println(c);
        System.out.println();
        System.out.println("Month: " + month);
        System.out.printf(Locale.US, "Usage:  %10.2f kWh%n", MonthlyPower.computePowerUsage(usage));
        System.out.printf(Locale.US, "Amount: %10.2f NOK%n", amount);
    }
}
