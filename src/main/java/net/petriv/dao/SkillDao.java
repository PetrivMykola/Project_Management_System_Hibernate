package main.java.net.petriv.dao;

import main.java.net.petriv.model.Skill;

import java.util.List;

public class SkillDao extends AbstractDao<Skill> implements GeneralDao<Skill> {

    public SkillDao() {
        super.setClazz(Skill.class);
    }

    @Override
    public void save(Skill newSkill) {
        saveOne(newSkill);
    }

    @Override
    public Skill getById(int id) {
    return findOne(id);
    }

    @Override
    public List<Skill> getAll() {
        return findAll();
    }

    @Override
    public void delete(int id) {
      deleteOne(id);

    }

    @Override
    public void update(Skill skill) {
     updateOne(skill.getId());

    }
}
