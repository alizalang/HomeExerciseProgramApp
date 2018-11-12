package com.alizalang.opt.Controller;


import com.alizalang.opt.Model.Exercise;
import com.alizalang.opt.Model.Patient;
import com.alizalang.opt.Repository_DAO.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@CrossOrigin(origins = {"http://localhost:8080","http://localhost:8100"})
public class ExerciseController {


    @Autowired
    ExerciseRepository exerciseRepository;

    @PostMapping(value="/exercises")
    public ResponseEntity<Exercise> createExercise(@RequestBody Exercise exercise) {
        return new ResponseEntity<>(exerciseRepository.save(exercise), HttpStatus.CREATED);
    }

    @GetMapping(value="/patients/{patientId}")
    public ResponseEntity<Collection<Exercise>> readExerciseByPatientId(@PathVariable Long patientId) {
        return new ResponseEntity<>(exerciseRepository.readExerciseByPatientId(patientId), HttpStatus.OK);
    }





//    @PutMapping
//    public Exercise updateHomeExercise(@RequestBody Exercise exercise) {
//        return exerciseRepository.save(exercise);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteHomeExercise(@PathVariable Long id) {
//        exerciseRepository.deleteById(id);
//    }


}
