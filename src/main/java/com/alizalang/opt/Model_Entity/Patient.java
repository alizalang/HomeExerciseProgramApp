package com.alizalang.opt.Model_Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @Column(unique = true)
    private String email;

    private String password;

//    @ManyToOne
//    @JoinColumn(name="clinician_id")
//    private Clinician clinician;

    @OneToMany(mappedBy = "patientID", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<HomeExercise> homeExerciseProgram = new HashSet<>();

    @JsonBackReference
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Clinician> clinicians = new HashSet<>();

}




