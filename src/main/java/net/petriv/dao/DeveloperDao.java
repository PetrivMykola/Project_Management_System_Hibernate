package main.java.net.petriv.dao;

import main.java.net.petriv.model.Developer;

import java.util.List;

public class DeveloperDao extends AbstractDao<Developer> implements GeneralDao<Developer> {

    public DeveloperDao() {
        super.setClazz(Developer.class);
    }

    @Override
    public void save(Developer newDeveloper) {
       saveOne(newDeveloper);

    }

    @Override
    public Developer getById(int id) {
        return findOne(id);
    }

    @Override
    public List<Developer> getAll() {
      return findAll();
    }

    @Override
    public void delete(int id) {
        deleteOne(id);
    }

    @Override
    public void update(Developer developer) {
        updateOne(developer.getId());
    }
}
