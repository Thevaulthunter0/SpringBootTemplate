package com.entreprise.sbdemo.Service;

import com.entreprise.sbdemo.Repository.ExerciceLogRepo;
import org.springframework.stereotype.Service;

@Service
public class ExcerciceLogService {

    public ExerciceLogRepo exerciceLogRepo;

    public ExcerciceLogService(ExerciceLogRepo exerciceLogRepo)
    {
        this.exerciceLogRepo = exerciceLogRepo;
    }
}
