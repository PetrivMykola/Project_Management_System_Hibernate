package main.java.net.petriv.dao;

import java.util.List;

public interface GeneralDao<T> {

    void save(T newEntity) ;

    T getById(int id) ;

    List<T> getAll();

    void delete(int id);

    void update (T entity);

}