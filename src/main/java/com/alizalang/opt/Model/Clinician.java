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
public class Clinician {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @Column(unique = true)
    @NotNull
    private String email;

    @NotNull
    private String password;

    private String role = "clinician";

    @NotNull
    private String discipline;

//    @OneToMany(cascade = CascadeType.ALL,
//    fetch = FetchType.LAZY,
//    mappedBy = "clinician")
//    private Set<Patient> clinicianPatientDirectory = new HashSet<>();
//
//
//
//    public void addPatientToClinicianPatientDirectory(Patient patient){
//        clinicianPatientDirectory.add(patient);
//    }
//
//    public void removePatientFromClinicianPatientDirectory(Patient patient){
//        clinicianPatientDirectory.remove(patient);
//    }

}
