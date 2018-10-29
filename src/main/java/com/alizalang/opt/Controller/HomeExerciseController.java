//package com.alizalang.opt.Controller;
//
//
//import com.alizalang.opt.Model_Entity.HomeExercise;
//import com.alizalang.opt.Repository.HomeExerciseService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Optional;
//
//
//@RestController
//public class HomeExerciseController {
//
//    @Autowired
//    HomeExerciseService homeExerciseService;
//
//
//    @PostMapping("/homehealthexercise")
//    public HomeExercise create(@RequestBody HomeExercise homeExercise) {
//        return homeExerciseService.save(homeExercise);
//    }
//
//    @GetMapping("/homehealthexercise")
//    public Iterable<HomeExercise> read() {
//        return homeExerciseService.findAll();
//    }
//
//    @GetMapping("/homehealthexercise/{id}")
//    public Optional<HomeExercise> readById(@PathVariable Long id) {
//        return homeExerciseService.findById(id);
//    }
//
//
////    @GetMapping("/homehealthexercise/search")
////    public Iterable<HomeExercise> readBySearch(
////            @RequestParam(value = "clinicianid", required = false) Long clinicianID,
////            @RequestParam(value = "patientid", required = false) Long patientID
////    ) {
////        if (clinicianID != null && patientID != null)
////            return homeExerciseService.findByClinicianIDAndPatientID(clinicianID, patientID);
////        else if(clinicianID != null)
////            return homeExerciseService.findByClinicianID(clinicianID);
////        else if(patientID != null)
////            return homeExerciseService.findByPatientID(patientID);
////        else
////            return homeExerciseService.findAll();
////    }
//
//
//    @PutMapping("/homehealthexercise")
//    public HomeExercise update(@RequestBody HomeExercise homeExercise) {
//        return homeExerciseService.save(homeExercise);
//    }
//
//    @DeleteMapping("/homehealthexercise/{id}")
//    public void delete(@PathVariable Long id) {
//        homeExerciseService.deleteById(id);
//    }
//
//
//}
