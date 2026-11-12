package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave2.MonthPowerData;
import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class InvoiceMain {

    public static void main(String[] args) {
        System.out.println("OPPGAVE 5");

        Customer charlie = new Customer("Charlie Rose", "charlie@example.com", 1003,
                PowerAgreementType.POWERSUPPORT);
        Customer diana = new Customer("Diana Prince", "diana@example.com", 1004,
                PowerAgreementType.NORGESPRICE);
        Customer ethan = new Customer("Ethan Hunt", "ethan@example.com", 1005,
                PowerAgreementType.SPOTPRICE);

        double[][] prices = MonthPowerData.powerprices_month;
        Invoice[] invoices = {
                new Invoice(charlie, "January", CustomerPowerUsageData.usage_month_customer1, prices),
                new Invoice(diana, "January", CustomerPowerUsageData.usage_month_customer2, prices),
                new Invoice(ethan, "January", CustomerPowerUsageData.usage_month_customer3, prices)
        };

        Invoices.processInvoices(invoices);
    }
}
