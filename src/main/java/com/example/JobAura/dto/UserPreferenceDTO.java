package com.example.JobAura.dto;

import com.example.JobAura.entity.UserPreference;
import lombok.Data;
import java.util.List;

@Data
public class UserPreferenceDTO {

    private String preferredRole;
    private String experienceLevel;
    private String expectedSalary;
    private String workType;
    private List<String> skills;
    private List<String> preferredLocations;

    // ENTITY → DTO
    public static UserPreferenceDTO fromEntity(UserPreference p) {
        UserPreferenceDTO dto = new UserPreferenceDTO();
        dto.setPreferredRole(p.getPreferredRole());
        dto.setExperienceLevel(p.getExperienceLevel());
        dto.setExpectedSalary(p.getExpectedSalary());
        dto.setWorkType(p.getWorkType());
        dto.setSkills(p.getSkills());
        dto.setPreferredLocations(p.getPreferredLocations());
        return dto;
    }

    // DTO → ENTITY
    public UserPreference toEntity() {
        return UserPreference.builder()
                .preferredRole(this.preferredRole)
                .experienceLevel(this.experienceLevel)
                .expectedSalary(this.expectedSalary)
                .workType(this.workType)
                .skills(this.skills)
                .preferredLocations(this.preferredLocations)
                .build();
    }
}
/* yeh per thida issue ho sakta he ki jab
api hit kerne per 500 error show hota iska reasin dto file me mappting sahi se nahi hui h

http://localhost:8080/api/user/preferences/
Controller → DTO → Service → Entity → DB
Controller ← DTO ← Service ← Entity ← DB

 */