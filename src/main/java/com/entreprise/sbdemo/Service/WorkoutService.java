package com.entreprise.sbdemo.Service;

import com.entreprise.sbdemo.Repository.WorkoutRepo;
import org.springframework.stereotype.Service;

@Service
public class WorkoutService {

    public WorkoutRepo workoutRepo;

    public WorkoutService(WorkoutRepo workoutRepo) {
        this.workoutRepo = workoutRepo;
    }
}
