package com.example.JobAura.dto;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
public class UserDto {
    public  String  fullName;
    public  String email;
    public  String  password;
}
