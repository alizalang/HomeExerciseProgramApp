package com.alizalang.opt.Service;

import com.alizalang.opt.Model.Clinician;
import com.alizalang.opt.Repository_DAO.ClinicianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ClinicianService {

    private ClinicianRepository clinicianRepository;

    @Autowired
    public ClinicianService(ClinicianRepository clinicianRepository) {
        this.clinicianRepository = clinicianRepository;
    }

    public ResponseEntity<Clinician> createClinician(Clinician clinician){
        return new ResponseEntity<>(clinicianRepository.save(clinician), HttpStatus.CREATED);
    }

    public ResponseEntity<Clinician> getClinicianById(Long id){
        return new ResponseEntity<>(clinicianRepository.findById(id).get(), HttpStatus.CREATED);
    }

}
