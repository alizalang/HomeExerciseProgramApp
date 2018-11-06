package com.alizalang.opt.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;


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

//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "clinician_id", nullable = false)
//    private Clinician clinician;
//
//    @OneToMany(cascade = CascadeType.ALL,
//            fetch = FetchType.LAZY,
//            mappedBy = "patient")
//    private Set<Exercise> homeExerciseProgram = new HashSet<>();
//
//    public void addExerciseToHEP(Exercise exercise) {
//        homeExerciseProgram.add(exercise);
//    }
//
//    public void removeExerciseFromHEP(Exercise exercise) {
//        homeExerciseProgram.remove(exercise);
//    }
}




