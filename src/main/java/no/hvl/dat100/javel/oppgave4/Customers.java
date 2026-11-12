package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;

public class Customers {

    private Customer[] customers;

    public Customers(int size) {
        customers = new Customer[size];
    }

    public int countNonNull() {
        int count = 0;
        for (Customer customer : customers) {
            if (customer != null) {
                count++;
            }
        }
        return count;
    }

    public Customer getCustomer(int customer_id) {
        for (Customer customer : customers) {
            if (customer != null && customer.getCustomerId() == customer_id) {
                return customer;
            }
        }
        return null;
    }

    public boolean addCustomer(Customer c) {
        if (c == null) {
            return false;
        }

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                customers[i] = c;
                return true;
            }
        }
        return false;
    }

    public Customer removeCustomer(int customer_id) {
        for (int i = 0; i < customers.length; i++) {
            Customer customer = customers[i];
            if (customer != null && customer.getCustomerId() == customer_id) {
                customers[i] = null;
                return customer;
            }
        }
        return null;
    }

    public Customer[] getCustomers() {
        Customer[] result = new Customer[countNonNull()];
        int index = 0;

        for (Customer customer : customers) {
            if (customer != null) {
                result[index] = customer;
                index++;
            }
        }
        return result;
    }
}
