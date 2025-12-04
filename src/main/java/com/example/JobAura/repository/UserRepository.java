package com.example.JobAura.repository;

import com.example.JobAura.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface   UserRepository extends JpaRepository<User,Long> {
    boolean existsByEmail(String email);

}
