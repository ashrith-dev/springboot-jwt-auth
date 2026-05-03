package com.ashrith.authdemo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestBody User user) {

        // simple check (hardcoded)
        if (user.getName().equals("admin") && user.getEmail().equals("admin@example.com")) {
            return JwtUtil.generateToken(user.getName());
        }

        return "Invalid credentials";
    }
}