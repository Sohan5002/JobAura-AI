package com.example.JobAura.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "user_preference")
public class UserPreference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String preferredRole;
    private String experienceLevel;
    private String expectedSalary;
    private String workType;

    @ElementCollection
    private List<String> skills;

    @ElementCollection
    private List<String> preferredLocations;

    @OneToOne
    @JsonIgnore      // prevents JSON infinite loop
    private User user;
}
