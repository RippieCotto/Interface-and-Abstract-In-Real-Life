package org.example.Abstracts;

import org.example.Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{
    @Override
    public void save(Customer customer) throws Exception {
        System.out.println("Saved to DB: " + customer.firstName);
    }
}
