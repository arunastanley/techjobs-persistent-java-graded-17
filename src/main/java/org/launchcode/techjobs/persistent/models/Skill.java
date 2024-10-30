package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 300, message = "Location must not exceed 300 characters")
    private String description;

    public Skill(String description){
        super();
        this.description = description;
    }

    public Skill(){}

    public @Size(max = 300, message = "Location must not exceed 300 characters") String getDescription() {
        return description;
    }

    public void setDescription(@Size(max = 300, message = "Location must not exceed 300 characters") String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
