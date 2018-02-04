package main.java.net.petriv.dao;

import main.java.net.petriv.model.Team;

import java.util.List;

public class TeamDao extends AbstractDao<Team> implements GeneralDao<Team> {

    public TeamDao() {
        super.setClazz(Team.class);
    }

    @Override
    public void save(Team team) {
        saveOne(team);
    }

    @Override
    public Team getById(int id) {
        return findOne(id);
    }

    @Override
    public List<Team> getAll() {
        return findAll();
    }

    @Override
    public void delete(int id) {
        deleteOne(id);

    }

    @Override
    public void update(Team team) {
        updateOne(team.getId());

    }
}
