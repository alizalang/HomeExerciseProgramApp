package com.alizalang.opt.Controller;

import com.alizalang.opt.Model.Clinician;
import com.alizalang.opt.Model.Patient;
import com.alizalang.opt.Repository_DAO.ClinicianRepository;
import com.alizalang.opt.Repository_DAO.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Date;

@RestController
@CrossOrigin(origins = {"http://localhost:8080","http://localhost:8100"})
public class ClinicianController {


    @Autowired
    ClinicianRepository clinicianRepository;

    @PostMapping(value="/clinicians")
    public ResponseEntity<Clinician> createClinician(@RequestBody Clinician clinician) {
        return new ResponseEntity<>(clinicianRepository.save(clinician), HttpStatus.CREATED);
    }

    @GetMapping(value="/clinicians/email/{email}")
    public Clinician readClinicianByEmail(@PathVariable String email) {
        return clinicianRepository.findClinicianByEmail(email);
    }







}
