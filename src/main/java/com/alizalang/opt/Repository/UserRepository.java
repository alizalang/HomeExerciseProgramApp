package com.alizalang.opt.Repository;

import com.alizalang.opt.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
