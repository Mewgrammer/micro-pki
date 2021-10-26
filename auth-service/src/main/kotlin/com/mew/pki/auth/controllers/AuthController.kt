package com.mew.pki.auth.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/api/auth/v1")
class AuthController {

    @GetMapping
    fun authenticate(): String {
        return "authenticated";
    }

    @GetMapping("admin")
    fun authenticateAdmin(): String {
        return "Admin";
    }

    @PostMapping
    fun login(): String {
        return "login";
    }

    @PostMapping("register")
    fun register(): String {
        return "register";
    }
}