package com.alizalang.opt.Service;

import com.alizalang.opt.Model.Patient;
import com.alizalang.opt.Repository_DAO.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PatientService {

    PatientRepository patientRepository;

    @Autowired
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public ResponseEntity <Patient> savePatientToDatabase(Patient patient) {
        return new ResponseEntity<>(patientRepository.save(patient), HttpStatus.CREATED);
    }

    public Collection<Patient> retrieveAllPatientsFromDatabase() {
        return patientRepository.findAll();
    }

    public ResponseEntity <Patient> updatePatientInDatabase(Long id, Patient patient) {
        return new ResponseEntity<>(patientRepository.save(patient), HttpStatus.OK);
    }

    public ResponseEntity <Patient>  removePatientFromDatabase(Patient patient) {
        patientRepository.delete(patient);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
