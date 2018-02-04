package main.java.net.petriv.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SKILL")
public class Skill implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;

    @Column (name = "skill_name")
    private String name;

    public Skill() { }

    public Skill(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Skill:\n" +
                "id: " + id + "\n" +
                "Name: " + name + "\n" ;

    }
}
