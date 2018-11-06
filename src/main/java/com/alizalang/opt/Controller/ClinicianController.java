package com.alizalang.opt.Controller;

import com.alizalang.opt.Model.Clinician;
import com.alizalang.opt.Repository_DAO.ClinicianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://localhost:8080","http://localhost:8100"})
public class ClinicianController {


    @Autowired
    ClinicianRepository clinicianRepository;


    @PostMapping(value="/clinicians")
    public ResponseEntity<Clinician> createNewClinician(@RequestBody Clinician clinician) {
        return new ResponseEntity<>(clinicianRepository.save(clinician), HttpStatus.CREATED);
    }

    @GetMapping(value="/clinicians/email/{email}")
    public Long readClinicianByEmail(@PathVariable String email) {
        return clinicianRepository.findByClinicianEmail(email);
    }



}
