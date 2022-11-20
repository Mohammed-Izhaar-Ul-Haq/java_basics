package com.vvit.controller;

import com.vvit.dao.CustomerCrud;
import com.vvit.dto.Customer;

public class TestInsert {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.setId(1);
        c.setName("Musavveer");
        c.setEmail("mus@gmail.com");
        c.setAge(21);
        c.setPhone(70123456078l);

        CustomerCrud crud = new CustomerCrud();
        int a = crud.insertCustomer(c);
        if(a>0) {
            System.out.println("Data inserted succcessfully");
        } else {
            System.out.println("Failed to insert data");
        }
    }
}