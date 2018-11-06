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
    public ResponseEntity<Exercise> createNewExercise(@RequestBody Exercise exercise) {
        return new ResponseEntity<>(exerciseRepository.save(exercise), HttpStatus.OK);
    }

    @GetMapping(value="/exercises")
    public ResponseEntity<Collection<Exercise>> readHomeExerciseProgram() {
        return new ResponseEntity<>(exerciseRepository.findAll(), HttpStatus.OK);
    }




//    @GetMapping("/search")
//    public List<Exercise> readBySearch(
//            @RequestParam(value = "clinicianid", required = false) Long clinicianID,
//            @RequestParam(value = "patientid", required = false) Long patientID
//    ) {
//        if (clinicianID != null && patientID != null)
//            return exerciseRepository.findByClinicianIDAndPatientID(clinicianID, patientID);
//        else if (clinicianID != null)
//            return exerciseRepository.findByClinicianID(clinicianID);
//        else if (patientID != null)
//            return exerciseRepository.findByPatientID(patientID);
//        else
//            return exerciseRepository.findAll();
//    }


    @PutMapping
    public Exercise updateHomeExercise(@RequestBody Exercise exercise) {
        return exerciseRepository.save(exercise);
    }

    @DeleteMapping("/{id}")
    public void deleteHomeExercise(@PathVariable Long id) {
        exerciseRepository.deleteById(id);
    }


}
