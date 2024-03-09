package org.example;

import org.example.Abstracts.BaseCustomerManager;
import org.example.Adapters.MernisServiceAdapter;
import org.example.Concretes.NeroCustomerManager;
import org.example.Entities.Customer;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
        customerManager.save(new Customer());

    }
}