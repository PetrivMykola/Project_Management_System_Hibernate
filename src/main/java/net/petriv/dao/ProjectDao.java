package main.java.net.petriv.dao;

import main.java.net.petriv.model.Project;

import java.util.List;

public class ProjectDao extends AbstractDao<Project> implements GeneralDao<Project> {

    public ProjectDao() {
        super.setClazz(Project.class);
    }

    @Override
    public void save(Project newProject) {
        saveOne(newProject);
    }

    @Override
    public Project getById(int id) {
        return findOne(id);
    }

    @Override
    public List<Project> getAll() {
        return findAll();
    }

    @Override
    public void delete(int id) {
        deleteOne(id);

    }

    @Override
    public void update(Project project) {
        updateOne(project.getId());
    }
}
