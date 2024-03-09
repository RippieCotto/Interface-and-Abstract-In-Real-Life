package org.example.Concretes;

import org.example.Abstracts.BaseCustomerManager;
import org.example.Abstracts.ICustomerCheckService;
import org.example.Entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager {
    private ICustomerCheckService customerCheckService;
    public StarbucksCustomerManager(ICustomerCheckService customerCheckService){
        this.customerCheckService = customerCheckService;
    }
    @Override
    public void save(Customer customer) throws Exception {
        if(customerCheckService.CheckIfRealPerson(customer)){
        save(customer);
        }else{
            throw new Exception("Not a valid person");
        }

    }
}
