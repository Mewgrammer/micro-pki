package com.mew.pki.auth.controllers

import com.mew.pki.auth.types.UserRole
import com.mew.pki.auth.types.models.UserModel
import com.mew.pki.auth.util.UserInfoUtil
import org.springframework.context.annotation.Scope
import org.springframework.security.access.annotation.Secured
import org.springframework.web.bind.annotation.*
import javax.servlet.http.HttpServletRequest

@RestController
@Scope("request")
@RequestMapping("/api/auth/v1")
class AuthController(val userUtils: UserInfoUtil) {

    @GetMapping("ping")
    fun ping(): Boolean {
        return true;
    }

    @GetMapping
    @ResponseBody
    fun getUserDetails(): UserModel {
        return UserModel(userUtils.getUserId(), userUtils.getPreferredUsername(), userUtils.getRoles() )
    }
}