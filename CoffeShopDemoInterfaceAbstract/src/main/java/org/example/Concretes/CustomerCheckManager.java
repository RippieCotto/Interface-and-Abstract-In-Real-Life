package org.example.Concretes;

import org.example.Abstracts.ICustomerCheckService;
import org.example.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {
    public boolean CheckIfRealPerson(Customer customer){
        return true;
    }
}

