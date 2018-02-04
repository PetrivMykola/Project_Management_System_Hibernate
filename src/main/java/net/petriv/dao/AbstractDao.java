package main.java.net.petriv.dao;

import main.java.net.petriv.settings.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.io.Serializable;
import java.util.List;

public class AbstractDao<T extends Serializable> {

    private Class<T> clazz;
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public void setClazz(Class<T> clazzToSet) {
        this.clazz = clazzToSet;
    }

    public T findOne(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        transaction = session.beginTransaction();
        T v = session.get(clazz, id);
        transaction.commit();
        session.close();
        return v;
    }

    public void saveOne(T entity) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        transaction = session.beginTransaction();
        session.save(entity);
        transaction.commit();
        session.close();
    }

    public List<T> findAll() {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        transaction = session.beginTransaction();
        Query query = session.createQuery("FROM " + clazz.getName());
        List<T> v = query.list();
        transaction.commit();
        session.close();
        return v;
    }

    public void deleteOne(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        transaction = session.beginTransaction();
        T entity = session.get(clazz, id);
        session.delete(entity);
        transaction.commit();
        session.close();
    }

    public void updateOne(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        transaction = session.beginTransaction();
        session.merge(findOne(id));
        transaction.commit();
        session.close();


    }
}
