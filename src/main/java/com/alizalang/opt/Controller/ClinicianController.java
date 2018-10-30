package com.alizalang.opt.Controller;

import com.alizalang.opt.Model.Clinician;
import com.alizalang.opt.Repository.ClinicianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users/clinicians")
public class ClinicianController {


    @Autowired
    private ClinicianRepository clinicianRepository;


    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createNewClinician(@RequestBody Clinician clinician) {
        clinicianRepository.save(clinician);
    }
}
