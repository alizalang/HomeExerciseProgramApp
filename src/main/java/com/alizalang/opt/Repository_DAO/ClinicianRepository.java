package com.alizalang.opt.Repository_DAO;

import com.alizalang.opt.Model.Clinician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClinicianRepository extends JpaRepository<Clinician, Long> {

    @Query("select id from Clinician c where email = :email")
    Long findByClinicianEmail(@Param("email")String email);
}
