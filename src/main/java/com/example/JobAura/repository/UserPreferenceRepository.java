package com.example.JobAura.repository;

import com.example.JobAura.entity.User;
import com.example.JobAura.entity.UserPreference;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserPreferenceRepository extends JpaRepository<UserPreference, Long> {
    UserPreference findByUserId(Long userId);
    Optional<UserPreference> findByUser(User user);

}
