package main.java.net.petriv.controller;


import main.java.net.petriv.dao.CompanyDao;
import main.java.net.petriv.model.Company;

import java.util.Scanner;

public class CompanyController  {

    Scanner in = new Scanner(System.in);
    Company company;
    CompanyDao dao;

    public CompanyController() {
        dao = new CompanyDao();
    }

    public void saveCompany() {
        dao.save(createNewCompany());
        System.out.println("Create and save Company was successful");
        System.out.println("##############################");
    }

    public void showListCompany() {
        System.out.println(dao.getAll());
        System.out.println("##############################");
    }

    public void updateCompany() {
        System.out.println("Enter id Company for update: ");
        int id = in.nextInt();
        System.out.println("Company for udate: " + dao.getById(id));
        Company newCompany = enterFieldsForCompany(dao.getById(id));
        dao.update(newCompany);
        System.out.println("###################################");
    }

    public void deleteCompany() {
        System.out.println("Enter id Company for delete: ");
        int id = in.nextInt();
        dao.delete(id);
        System.out.println("##############################");
    }

    public Company createNewCompany() {
        company = new Company();
        System.out.println("Enter id:");
        company.setId(in.nextInt());
        System.out.println("Enter name:");
        company.setName(in.next());
        return company;
    }

    public Company enterFieldsForCompany(Company company) {
        System.out.println("Enter id:");
        company.setId(in.nextInt());
        System.out.println("Enter name:");
        company.setName(in.next());
        return company;
    }
}
