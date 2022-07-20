package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
    @ManyToMany(mappedBy="skills" )


    private List<Job> jobs = new ArrayList<>();


    @NotBlank
    @Size(min = 5, max = 500, message = "Must be between 5 and 500 characters")
    private String description;

    public Skill(List<Job> jobs, String description) {
        super();
        this.description = description;
        this.jobs = jobs;
    }

    public Skill() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}