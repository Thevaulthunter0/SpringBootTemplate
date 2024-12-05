package com.entreprise.sbdemo.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table
public class Workout
{
    @Id
    @SequenceGenerator(name = "workout_seq", sequenceName = "workout_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "workout_seq")
    private Long id;
    private String name;
    private String type;
    private int duration;
    private String description;
    private Timestamp created;

    protected Workout() {}

    public Workout(String name, String type, int duration, String description)
    {
        this.name = name;
        this.type = type;
        this.duration = duration;
        this.description = description;
        this.created = new Timestamp(System.currentTimeMillis());;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
