package main.java.net.petriv.dao;

import main.java.net.petriv.model.Company;

import java.util.List;

public class CompanyDao extends AbstractDao<Company> implements GeneralDao<Company> {

    public CompanyDao() {
        super.setClazz(Company.class);
    }

    @Override
    public void save(Company newCompany) {
        saveOne(newCompany);
    }

    @Override
    public Company getById(int id) {
        return findOne(id);
    }

    @Override
    public List<Company> getAll() {
        return findAll();
    }

    @Override
    public void delete(int id) {
        deleteOne(id);
    }

    @Override
    public void update(Company company) {
        updateOne(company.getId());
    }
}
