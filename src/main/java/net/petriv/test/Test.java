package main.java.net.petriv.test;

import main.java.net.petriv.model.Developer;
import main.java.net.petriv.model.Skill;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
    private static SessionFactory sessionFactory;

    public static void main(String[] args) {
        Test test = new Test();
        sessionFactory = new Configuration().configure("/resources/hibernate.cfg.xml").buildSessionFactory();
        Developer developer = new Developer();
        Skill skill  = new Skill();
        Set<Skill> skillSet = new HashSet<>();
        skill.setName("HTML");
        skillSet.add(skill);
        developer.setFirstName("Eugene");
        developer.setLastName("Suleimanov");
        developer.setSpecialty("Java");
        developer.setExperience(5);
        developer.setSalary(23566);
        developer.setSkills(skillSet);

        //test.addDeveloper(developer);

        System.out.println(test.getById(2));

    }

    public Developer getById(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();

        Developer developer = session.get(Developer.class, id);

        transaction.commit();
        session.close();

        return developer;
    }

    public List listDevelopers() {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Query query = session.createQuery("FROM Developer");
        List<Developer> developers = query.list();

        transaction.commit();
        session.close();
        return developers;
    }

    public void addDeveloper(Developer developer) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        session.save(developer);
        transaction.commit();
        session.close();
    }
}
