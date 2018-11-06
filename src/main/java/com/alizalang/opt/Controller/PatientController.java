package com.alizalang.opt.Controller;

import com.alizalang.opt.Model.Patient;
import com.alizalang.opt.Repository_DAO.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;


@RestController
@CrossOrigin(origins = {"http://localhost:8080","http://localhost:8100"})
public class PatientController {


    @Autowired
    public PatientRepository patientRepository;

    //METHODS:

    @PostMapping(value="/patients")
    public ResponseEntity<Patient> createNewPatient(@RequestBody Patient patient) {
        return new ResponseEntity<>(patientRepository.save(patient), HttpStatus.CREATED);
    }

    @GetMapping(value="/patients")
    public ResponseEntity<Collection<Patient>> readAllPatients() {
        return new ResponseEntity<>(patientRepository.findAll(), HttpStatus.OK);
    }
//
//    @PutMapping(value="/patients/{id}")
//    public ResponseEntity<Patient> clientRequestToUpdatePatient(@PathVariable Long id, @RequestBody Patient patient) {
//        return new ResponseEntity<>(patientRepository.save(patient), HttpStatus.OK);    }
//
//    @DeleteMapping(value="/patients")
//    public ResponseEntity<Patient> clientRequestToDeletePatient(@RequestBody Patient patient) {
//        patientRepository.delete(patient);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }




}
