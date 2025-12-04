package com.example.JobAura.controller;

import com.example.JobAura.dto.UserPreferenceDTO;
import com.example.JobAura.entity.UserPreference;
import com.example.JobAura.service.UserPreferenceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user/preferences")
@RequiredArgsConstructor
public class UserPreferenceController {
    private  final UserPreferenceService preferenceService;
    @PostMapping("/{userId}")
    public UserPreference savePreferences (
            @PathVariable Long userId,
            @RequestBody UserPreferenceDTO dto
            )
    {
        return  preferenceService.savePreference(userId,dto);

    }
    @GetMapping("/{userId}")
    public  UserPreference getPreferences (@PathVariable Long userId) {
        return  preferenceService.getpreferences(userId);
    }
}
