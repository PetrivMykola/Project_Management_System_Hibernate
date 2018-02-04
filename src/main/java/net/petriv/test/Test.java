package main.java.net.petriv.test;

import main.java.net.petriv.dao.*;
import main.java.net.petriv.model.*;
import main.java.net.petriv.settings.HibernateUtil;
import org.hibernate.SessionFactory;

public class Test {
    private static SessionFactory sessionFactory;

    public static void main(String[] args) {
        SkillDao skillDao = new SkillDao();
        DeveloperDao developerDao = new DeveloperDao();
        TeamDao teamDao = new TeamDao();
        ProjectDao projectDao = new ProjectDao();
        CustomerDao customerDao = new CustomerDao();
        CompanyDao companyDao = new CompanyDao();

//        Developer developer1 = new Developer(
//                "Mykola", "Petriv",
//                "JAVA", 1,400);
//
//        Developer developer2 = new Developer(
//                "Eugene", "Suleimanov",
//                "JAVA", 5, 5000);
//
//
//
//         Skill skill1 = new Skill("HTML");
//        Skill skill2 = new Skill("CSS");
//        Skill skill3 = new Skill("XML");
//        Skill skill4 = new Skill("Angular");

        Company company1 = new Company("Google");
        Company company2 = new Company("Facebook");

        Customer customer1 = new Customer("Mike", "Johnson", "NY");
        Customer customer2 = new Customer("John", "Klein", "CA");

        company1.getCustomers().add(customer1);
        company1.getCustomers().add(customer2);

        companyDao.save(company1);







        HibernateUtil.getSessionFactory().close();

    }

}
