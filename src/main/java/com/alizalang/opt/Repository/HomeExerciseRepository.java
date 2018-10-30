package com.alizalang.opt.Repository;


import com.alizalang.opt.Model.HomeExercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeExerciseRepository extends JpaRepository<HomeExercise, Long> {

//    Iterable<HomeExercise> findByPatientID(Long patientID);

}
