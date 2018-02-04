package main.java.net.petriv.controller;

import main.java.net.petriv.dao.DeveloperDao;
import main.java.net.petriv.model.Developer;

import java.util.Scanner;

public class DeveloperController {

    Scanner in = new Scanner(System.in);
    Developer dev;
    DeveloperDao dao;

    public DeveloperController() {
        dao = new DeveloperDao();
    }

    public Developer createNewDeveloper() {
        dev = new Developer();
        System.out.println("Enter id:");
        dev.setId(in.nextInt());
        System.out.println("Enter name:");
        dev.setFirstName(in.next());
        System.out.println("Enter lastName:");
        dev.setLastName(in.next());
        System.out.println("Enter specialty");
        dev.setSpecialty(in.next());
        System.out.println("Enter Salary:");
        dev.setSalary(in.nextInt());
        System.out.println("Enter Skills Id:");
        return dev = new Developer(dev.getFirstName(), dev.getLastName(), dev.getSpecialty(), dev.getSalary(), dev.getExperience());
    }

    public Developer enterFieldsForDeveloper(Developer dev) {
        dev = new Developer();
        System.out.println("Enter id:");
        dev.setId(in.nextInt());
        System.out.println("Enter name:");
        dev.setFirstName(in.next());
        System.out.println("Enter lastName:");
        dev.setLastName(in.next());
        System.out.println("Enter specialty");
        dev.setSpecialty(in.next());
        System.out.println("Enter Salary:");
        dev.setSalary(in.nextInt());
        return dev = new Developer(dev.getFirstName(), dev.getLastName(), dev.getSpecialty(), dev.getSalary(), dev.getExperience());
    }

    public void saveDeveloper() {
        dao.save(createNewDeveloper());
        System.out.println("Create and save Developer was successful");
        System.out.println("##############################");
    }
    public void showListDevelopers() {
        System.out.println(dao.getAll());
        System.out.println("##############################");
    }

    public void updateDeveloper() {
        System.out.println("Enter id developer for update: ");
        int id = in.nextInt();
        System.out.println("Developer for udate: " + dao.getById(id));
        Developer newDev = enterFieldsForDeveloper(dao.getById(id));
        dao.update(newDev);
        System.out.println("###################################");

    }

    public void deleteDeveloper() {
        System.out.println("Enter id developer for delete: ");
        int id = in.nextInt();
        dao.delete(id);
        System.out.println("##############################");

    }

}

