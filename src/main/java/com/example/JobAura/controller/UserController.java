package com.example.JobAura.controller;

import com.example.JobAura.dto.UserDto;
import com.example.JobAura.entity.User;
import com.example.JobAura.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/user")
public class UserController {
    private  final UserService userService;
     @PostMapping("/register")
    public User registerUser(@RequestBody UserDto userDto) {
         return  userService.register(userDto);
     }
     @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {

         return  userService.getUser(id);
     }
}
