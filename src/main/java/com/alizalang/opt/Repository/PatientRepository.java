package com.alizalang.opt.Repository;

import com.alizalang.opt.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {



}
