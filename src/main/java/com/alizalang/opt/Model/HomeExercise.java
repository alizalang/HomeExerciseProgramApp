package com.alizalang.opt.Model;

import lombok.Getter;
import lombok.Setter;

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
    private Long patientID;

    @NotNull
    private Long clinicianID;

    @NotNull
    private String videoURL;

    @NotNull
    private long sets;

    @NotNull
    private long reps;

    @NotNull
    private String frequencyPerWeek;


}