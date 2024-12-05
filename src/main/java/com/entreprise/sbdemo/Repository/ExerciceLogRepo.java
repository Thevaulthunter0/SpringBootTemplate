package com.entreprise.sbdemo.Repository;

import com.entreprise.sbdemo.Entity.ExerciceLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciceLogRepo extends JpaRepository<ExerciceLog, Long> {
}
