package com.alizalang.opt.Controller;

import com.alizalang.opt.Model.Patient;
import com.alizalang.opt.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("/patients")
@CrossOrigin(origins = {"http://localhost:8080","http://localhost:8100"})
public class PatientController {

    private PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    //METHODS:

    @PostMapping
    public ResponseEntity<Patient> clientRequestToCreateNewPatient(@RequestBody Patient patient) {
        return patientService.savePatientToDatabase(patient);
    }

    @GetMapping
    public ResponseEntity<Collection<Patient>> clientRequestToReadAllPatients() {
        return new ResponseEntity<>(patientService.retrieveAllPatientsFromDatabase(), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Patient> clientRequestToUpdatePatient(@PathVariable Long id, @RequestBody Patient patient) {
        return patientService.updatePatientInDatabase(id, patient);
    }

    @DeleteMapping
    public ResponseEntity<Patient> clientRequestToDeletePatient(@RequestBody Patient patient) {
        return patientService.removePatientFromDatabase(patient);
    }
}
