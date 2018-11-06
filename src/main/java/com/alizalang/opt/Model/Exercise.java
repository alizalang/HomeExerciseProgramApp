package com.alizalang.opt.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "patient_id", nullable = false)
//    private Patient patient;

    @NotNull
    private String video;

    @NotNull
    private int sets;

    @NotNull
    private int reps;

    @NotNull
    private String frequencyPerWeek;




}