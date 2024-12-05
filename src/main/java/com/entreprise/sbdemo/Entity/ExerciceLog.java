package com.entreprise.sbdemo.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class ExerciceLog
{
    @Id
    @SequenceGenerator(name = "exerciceLog_seq", sequenceName = "exerciceLog_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "exerciceLog_seq")
    private Long id;
    @ManyToOne
    @JoinColumn(name="user_id", nullable= false)
    private Users user;
    @ManyToOne
    @JoinColumn(name="workout_id")
    private Workout workout;
    private String custom_name;
    private Date date;
    private int duration;
    private float calories_burned;
    private String notes;

    protected ExerciceLog() {}

    public ExerciceLog(Users user, Workout workout_id, String custom_name, Date date, int duration, float calories_burned, String notes)
    {
        this.user = user;
        this.workout = workout_id;
        this.custom_name = custom_name;
        this.date = date;
        this.duration = duration;
        this.calories_burned = calories_burned;
        this.notes = notes;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public float getCalories_burned() {
        return calories_burned;
    }

    public void setCalories_burned(float calories_burned) {
        this.calories_burned = calories_burned;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCustom_name() {
        return custom_name;
    }

    public void setCustom_name(String custom_name) {
        this.custom_name = custom_name;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
