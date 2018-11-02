package com.alizalang.opt.Controller;


import com.alizalang.opt.Model.Exercise;
import com.alizalang.opt.Repository_DAO.ExerciseRepository;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/homeexercise")
public class ExerciseController {


    ExerciseRepository exerciseRepository;

    @PostMapping
    public Exercise createHomeExercise(@RequestBody Exercise exercise) {
        return exerciseRepository.save(exercise);
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
