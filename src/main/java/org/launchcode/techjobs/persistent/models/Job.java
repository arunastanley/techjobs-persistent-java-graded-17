package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity {

//    @Id
//    @GeneratedValue
//    private int id;

//    private String name;

    @ManyToOne
    private Employer employer;

    @ManyToMany
    private List<Skill> skills = new ArrayList<>();
//    private Skill skills;


    public Job() {
    }

    // Initialize the id and value fields.
    public Job(Employer anEmployer, List<Skill> someSkills) {
//        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.
    
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

}
