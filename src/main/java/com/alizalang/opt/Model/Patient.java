package com.alizalang.opt.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Patient extends User {

    public Patient() {
       super.role = "patient";
    }

    @NotNull
    private Long clinicianIDForThisPatient;

    @OneToMany
    private Set<HomeExercise> homeExerciseProgram = new HashSet<>();


//    public void removeExerciseFromProgram(HomeExercise homeExercise){
//        homeExerciseProgram.remove(homeExercise);
//    }
//
//
//
//    public void addExercisetoProgram(HomeExercise homeExercise){
//        homeExerciseProgram.add(homeExercise);
//    }


}




