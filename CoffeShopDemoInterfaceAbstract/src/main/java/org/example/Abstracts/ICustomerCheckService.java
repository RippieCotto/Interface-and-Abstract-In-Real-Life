package org.example.Abstracts;

import jdk.jshell.spi.ExecutionControl;
import org.example.Entities.Customer;

public interface ICustomerCheckService {
    default boolean CheckIfRealPerson(Customer customer) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Fatal Error!");
    }
}
