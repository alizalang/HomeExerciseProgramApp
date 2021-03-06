package com.alizalang.opt.Repository_DAO;


import com.alizalang.opt.Model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {

    Collection<Exercise> readExerciseByPatientId(Long patientId);
}
