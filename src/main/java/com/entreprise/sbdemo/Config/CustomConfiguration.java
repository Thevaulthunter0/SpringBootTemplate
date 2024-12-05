package com.entreprise.sbdemo.Config;

import com.entreprise.sbdemo.Entity.ExerciceLog;
import com.entreprise.sbdemo.Entity.Users;
import com.entreprise.sbdemo.Entity.Workout;
import com.entreprise.sbdemo.Repository.ExerciceLogRepo;
import com.entreprise.sbdemo.Repository.UsersRepo;
import com.entreprise.sbdemo.Repository.WorkoutRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Date;
import java.util.List;

@Configuration
public class CustomConfiguration
{
    @Bean
    CommandLineRunner commandLineRunner(UsersRepo usersRepo, ExerciceLogRepo exerciceLogRepo, WorkoutRepo workoutRepo) {
        return args -> {
            Users u1 = new Users("Mathieu", "Mathieu@hotmail.com", "1234", 25,123f,123f);
            Users u2 = new Users("Sarah", "Sarah@hotmail.com", "5678", 23,123f,123f);
            Users u3 = new Users("Jocelyn", "Jocelyn@hotmail.com", "1357", 60,123f,123f);
            usersRepo.saveAll(List.of(u1,u2,u3));

            Workout w1 = new Workout("Jambes","Gym",2,"2 heures d'entraînement de jambes.");
            Workout w2 = new Workout("Course","Exterieur",1,"1 heure de course à l'extérieur.");
            Workout w3 = new Workout("Course","Gym",1,"1 heure de course à l'intérieur.");
            workoutRepo.saveAll(List.of(w1,w2,w3));

            ExerciceLog e1 = new ExerciceLog(u1,w1,null, Date.valueOf("2024-04-04"),2,200,"good");
            ExerciceLog e2 = new ExerciceLog(u1,null,"Ultra Leg Day", Date.valueOf("2024-04-10"),3,400,"Super good");
            ExerciceLog e3 = new ExerciceLog(u2,w2,null, Date.valueOf("2024-04-05"),1,500,"Bad");
            ExerciceLog e4 = new ExerciceLog(u3,w3,null, Date.valueOf("2024-04-18"),1,600,"Got hurt");
            exerciceLogRepo.saveAll(List.of(e1,e2,e3,e4));
        };
    }
}
