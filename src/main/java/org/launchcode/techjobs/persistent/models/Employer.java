package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location is required")
    @Size(max = 80, message = "Location must not exceed 80 characters")
    private String location;

    public Employer(String location) {
        super();
        this.location = location;
    }

    public Employer() {}

    public @NotBlank @Size(max = 80) String getLocation() {
        return location;
    }

    public void setLocation(@NotBlank @Size(max = 80) String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return location;
    }


}

