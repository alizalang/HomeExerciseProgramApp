package com.alizalang.opt.Controller;

import com.alizalang.opt.Model.Clinician;
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

    @PostMapping(value="/patients")
    public ResponseEntity<Patient> createPatient(@RequestBody Patient patient) {
        return new ResponseEntity<>(patientRepository.save(patient), HttpStatus.CREATED);
    }

    @GetMapping(value ="/clinicians/{clinicianId}")
    public ResponseEntity<Collection<Patient>> readPatientsByClinicianId(@PathVariable Long clinicianId) {
        return new ResponseEntity<>(patientRepository.findPatientByClinicianId(clinicianId), HttpStatus.OK);
    }





}
