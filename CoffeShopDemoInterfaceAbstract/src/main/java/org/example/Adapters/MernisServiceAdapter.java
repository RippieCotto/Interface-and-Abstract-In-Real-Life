package org.example.Adapters;

import org.example.Abstracts.ICustomerCheckService;
import org.example.Abstracts.ICustomerService;
import org.example.Entities.Customer;

public class MernisServiceAdapter implements ICustomerCheckService {

    public boolean CheckIfRealPerson(Customer customer){
        return true;
    }
}
