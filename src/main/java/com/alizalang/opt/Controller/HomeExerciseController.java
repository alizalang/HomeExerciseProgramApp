package com.alizalang.opt.Controller;


import com.alizalang.opt.Model.HomeExercise;
import com.alizalang.opt.Repository.HomeExerciseRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/homeexercise")
public class HomeExerciseController {


    HomeExerciseRepository homeExerciseRepository;

    @PostMapping
    public HomeExercise createHomeExercise(@RequestBody HomeExercise homeExercise) {
        return homeExerciseRepository.save(homeExercise);
    }


//    @GetMapping("/search")
//    public List<HomeExercise> readBySearch(
//            @RequestParam(value = "clinicianid", required = false) Long clinicianID,
//            @RequestParam(value = "patientid", required = false) Long patientID
//    ) {
//        if (clinicianID != null && patientID != null)
//            return homeExerciseRepository.findByClinicianIDAndPatientID(clinicianID, patientID);
//        else if (clinicianID != null)
//            return homeExerciseRepository.findByClinicianID(clinicianID);
//        else if (patientID != null)
//            return homeExerciseRepository.findByPatientID(patientID);
//        else
//            return homeExerciseRepository.findAll();
//    }


    @PutMapping
    public HomeExercise updateHomeExercise(@RequestBody HomeExercise homeExercise) {
        return homeExerciseRepository.save(homeExercise);
    }

    @DeleteMapping("/{id}")
    public void deleteHomeExercise(@PathVariable Long id) {
        homeExerciseRepository.deleteById(id);
    }


}
