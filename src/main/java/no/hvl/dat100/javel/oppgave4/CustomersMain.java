package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {
        System.out.println("OPPGAVE 4");

        Customers customers = new Customers(2);
        Customer alice = new Customer("Alice Smith", "alice@example.com", 1001,
                PowerAgreementType.SPOTPRICE);
        Customer bob = new Customer("Bob Johnson", "bob@example.com", 1002,
                PowerAgreementType.NORGESPRICE);
        Customer charlie = new Customer("Charlie Rose", "charlie@example.com", 1003,
                PowerAgreementType.POWERSUPPORT);

        System.out.println("Added Alice: " + customers.addCustomer(alice));
        System.out.println("Added Bob: " + customers.addCustomer(bob));
        System.out.println("Added Charlie to full table: " + customers.addCustomer(charlie));
        System.out.println("Number of customers: " + customers.countNonNull());
        System.out.println("Found Bob: " + (customers.getCustomer(1002) == bob));

        System.out.println("Removed Alice: " + (customers.removeCustomer(1001) == alice));
        System.out.println("Alice after removal: " + customers.getCustomer(1001));
        System.out.println("Customers after removal: " + customers.getCustomers().length);
        System.out.println("Added Charlie after removal: " + customers.addCustomer(charlie));

        for (Customer customer : customers.getCustomers()) {
            System.out.println(customer);
            System.out.println();
        }
    }
}
