package com.alizalang.opt.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;



@Setter
@Getter
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Patient {

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

    private final String role = "patient";

    @NotNull
    private Long clinicianId;


//    @OneToMany(cascade = CascadeType.ALL,
//            fetch = FetchType.LAZY,
//            mappedBy = "patient")
//    private Set<Exercise> homeExerciseProgram = new HashSet<>();

//    public void addExerciseToHEP(Exercise exercise) {
//        homeExerciseProgram.add(exercise);
//    }

//    public void removeExerciseFromHEP(Exercise exercise) {
//        homeExerciseProgram.remove(exercise);
//    }

}




