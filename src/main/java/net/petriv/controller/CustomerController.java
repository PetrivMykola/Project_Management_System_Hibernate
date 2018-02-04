package main.java.net.petriv.controller;

import main.java.net.petriv.dao.CustomerDao;
import main.java.net.petriv.model.Customer;

import java.util.Scanner;

public class CustomerController {

    Scanner in = new Scanner(System.in);
    Customer customer;
    CustomerDao dao;

    public CustomerController() {
        dao = new CustomerDao();
    }

    public void saveCustomer() {
        dao.save(createNewCustomer());
        System.out.println("Create and save Company was successful");
        System.out.println("##############################");
    }

    public void showListCustomer() {
        System.out.println(dao.getAll());
        System.out.println("##############################");
    }

    public void updateCustomer() {
        System.out.println("Enter id Company for update: ");
        int id = in.nextInt();
        System.out.println("Company for udate: " + dao.getById(id));
        Customer newCustomer = enterFieldsForCustomer(dao.getById(id));
        dao.update(newCustomer);
        System.out.println("###################################");
    }

    public void deleteCustomer() {
        System.out.println("Enter id Company for delete: ");
        int id = in.nextInt();
        dao.delete(id);
        System.out.println("##############################");
    }

    public Customer createNewCustomer() {
        customer = new Customer();
        System.out.println("Enter id:");
        customer.setId(in.nextInt());
        System.out.println("Enter name:");
        customer.setFirstName(in.next());
        System.out.println("Enter Last name:");
        customer.setLastName(in.next());
        System.out.println("Enter address:");
        customer.setAddress(in.next());
        return customer;
    }

    public Customer enterFieldsForCustomer(Customer customer) {
        System.out.println("Enter id:");
        customer.setId(in.nextInt());
        System.out.println("Enter name:");
        customer.setFirstName(in.next());
        System.out.println("Enter Last name:");
        customer.setLastName(in.next());
        System.out.println("Enter address:");
        customer.setAddress(in.next());
        return customer;
    }
}
