package com.entreprise.sbdemo.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table
public class Users {

    @Id
    @SequenceGenerator(name = "user_seq", sequenceName = "user_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    private Long id;
    private String name;
    private String email;
    private String password;
    private int age;
    private float height;
    private float weight;
    private Timestamp created;
    private Timestamp updated;

    protected Users() {}

    public Users(String name, String email, String password, int age, Float heigh, Float weight)
    {
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
        this.height = heigh;
        this.weight = weight;
        this.created = new Timestamp(System.currentTimeMillis());
        this.updated = null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }
}
