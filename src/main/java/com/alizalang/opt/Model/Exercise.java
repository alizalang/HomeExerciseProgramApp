package com.alizalang.opt.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @ManyToOne
    private Patient patient;

    @NotNull
    private String videoURL;

    @NotNull
    private int sets;

    @NotNull
    private int reps;

    @NotNull
    private String frequencyPerWeek;




}