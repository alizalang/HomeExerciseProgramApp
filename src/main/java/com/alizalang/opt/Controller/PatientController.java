package com.alizalang.opt.Controller;

import com.alizalang.opt.Model.Patient;
import com.alizalang.opt.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users/patients")
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createNewPatient(@RequestBody Patient patient) {
        patientRepository.save(patient);
    }



    @GetMapping
    public List<Patient> readPatientDirectory() {
        return patientRepository.findAll();
    }

}
