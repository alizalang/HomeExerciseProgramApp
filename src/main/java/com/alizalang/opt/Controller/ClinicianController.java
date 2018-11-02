package com.alizalang.opt.Controller;

import com.alizalang.opt.Model.Clinician;
import com.alizalang.opt.Service.ClinicianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clinicians")
@CrossOrigin(origins = {"http://localhost:8080","http://localhost:8100"})
public class ClinicianController {

    private ClinicianService clinicianService;

    @Autowired
    public ClinicianController(ClinicianService clinicianService) {
        this.clinicianService = clinicianService;
    }

    //METHODS:

    @PostMapping
    public ResponseEntity<Clinician> createNewClinician(@RequestBody Clinician clinician) {
        return clinicianService.createClinician(clinician);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Clinician> readClinicianById(@PathVariable("id") Long id) {
        return clinicianService.getClinicianById(id);
    }


}
