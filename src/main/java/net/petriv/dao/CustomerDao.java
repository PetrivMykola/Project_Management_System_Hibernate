package main.java.net.petriv.dao;

import main.java.net.petriv.model.Customer;

import java.util.List;

public class CustomerDao extends AbstractDao<Customer> implements GeneralDao<Customer> {

    public CustomerDao() {
        super.setClazz(Customer.class);
    }

    @Override
    public void save(Customer newCustomer) {
        saveOne(newCustomer);
    }

    @Override
    public Customer getById(int id) {
        return findOne(id);
    }

    @Override
    public List<Customer> getAll() {
        return findAll();
    }

    @Override
    public void delete(int id) {
        deleteOne(id);

    }

    @Override
    public void update(Customer customer) {
        updateOne(customer.getId());

    }
}
