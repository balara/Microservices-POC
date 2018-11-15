package com.data;

import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;

@RestController
@RequestMapping("/customer")
public class CustomerDataController {

    /**
     * Controller class for Customer data Service
     * @param customerId
     * @return Customer
     */
    @RequestMapping( path = "/{customerId}",
                     method = RequestMethod.GET)
    public Customer getCustomer(@PathVariable ("customerId") String customerId) {
        Customer customer = findCustomer(customerId);
        return customer;
    }


    /**
     * This method returns a matching cusotmer form the customer data base. if no data found return error.
     * @param id : Customer ID
     * @return Returns a mathing customer . If no match found returns null
     */
    private Customer findCustomer(String id) {
        ArrayList<Customer> customers = getCustomers();
        for (Customer customer : customers) {
            if (customer.getCustomerID().equals(id)) {
                return customer;
            }
        }
        return null;
    }

    /**
     * Static data for test Customers
     * @return List of customer
     */
    private ArrayList<Customer> getCustomers() {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Customer-1", "1"));
        customers.add(new Customer("Customer-2", "2"));
        customers.add(new Customer("Customer-3", "3"));
        customers.add(new Customer("Customer-4", "4"));
        customers.add(new Customer("Customer-5", "5"));
        return customers;
    }
}
