package com.alizalang.opt.Model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotNull;


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

}
