package com.alizalang.opt.Model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;


@Setter
@Getter
@Entity
public class Clinician extends User{



    public Clinician(){
       super.role = "clinician";
    }

    @NotNull
    private enum discipline{PT, OT};

    @OneToMany
    private Set<Patient> patients = new HashSet<>();






//    public void createNewPatient(Patient patient){
//        patients.add(patient);
//    }
//
//    public void deletePatient(Patient patient){
//        if (patients.contains(patient))
//        patients.remove(patient);
//    }


}
