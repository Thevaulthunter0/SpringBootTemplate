package com.entreprise.sbdemo.Repository;

import com.entreprise.sbdemo.Entity.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRepo extends JpaRepository<Workout, Long> {
}
