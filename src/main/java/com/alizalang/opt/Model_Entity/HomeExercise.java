package com.alizalang.opt.Model_Entity;

import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.util.PerformanceSensitive;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
public class HomeExercise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "clinician_id")
    private Clinician clinician;

    private Long patientID;

    @NotNull
    private String videoURL;

    @NotNull
    private long sets;

    @NotNull
    private long reps;

    @NotNull
    private String frequencyPerWeek;



}