package no.hvl.dat100.javel.oppgave3;

public class CustomerMain {

    public static void main(String[] args) {
        System.out.println("OPPGAVE 3");

        Customer customer = new Customer("Alice Smith", "alice@example.com", 1001,
                PowerAgreementType.SPOTPRICE);
        System.out.println(customer);

        customer.setName("Alice Johnson");
        customer.setEmail("alice.johnson@example.com");
        customer.setCustomerId(1002);
        customer.setAgreement(PowerAgreementType.NORGESPRICE);

        System.out.println();
        System.out.println("Customer number " + customer.getCustomerId());
        System.out.println("Name  " + customer.getName());
        System.out.println("Email " + customer.getEmail());
        System.out.println("Agreement " + customer.getAgreement());
    }
}
