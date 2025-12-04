package com.example.JobAura.service;

import com.example.JobAura.dto.UserPreferenceDTO;

import com.example.JobAura.entity.User;
import com.example.JobAura.entity.UserPreference;
import com.example.JobAura.repository.UserPreferenceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class UserPreferenceService {
    private  final UserPreferenceRepository userPreferenceRepository;
    private  final UserService userService;

    public UserPreference savePreference (Long userId, UserPreferenceDTO dto) {
        User user = userService.getUser(userId);
        UserPreference pref = UserPreference.builder()
                .preferredRole(dto.getPreferredRole())
                .experienceLevel(dto.getExperienceLevel())
                .expectedSalary(dto.getExpectedSalary())
                .workType(dto.getWorkType())
                .skills(dto.getSkills())
                .preferredLocations(dto.getPreferredLocations())
                .user(user)
                .build();
                return userPreferenceRepository.save(pref);

    }
    public  UserPreference getpreferences(Long userId) {
        return  userPreferenceRepository.findByUserId(userId);
    }

}
