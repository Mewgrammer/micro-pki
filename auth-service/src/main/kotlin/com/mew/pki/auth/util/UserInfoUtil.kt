package com.mew.pki.auth.util

import org.keycloak.KeycloakPrincipal
import org.keycloak.representations.AccessToken
import org.springframework.context.annotation.Scope
import org.springframework.security.core.Authentication
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Component

@Component
@Scope("request")
class UserInfoUtil {

    private val authentication: Authentication = SecurityContextHolder.getContext().authentication
    val principal: KeycloakPrincipal<*> = authentication.principal as KeycloakPrincipal<*>;

    fun getPreferredUsername(): String {
        return principal.keycloakSecurityContext.token.preferredUsername
    }

    fun getRoles(): Collection<String> {
        return authentication.authorities.map { a -> a.authority }
    }

    fun getUserId(): String {
        return getAccessToken().subject
    }

    fun getAccessToken(): AccessToken {
        return principal.keycloakSecurityContext.token
    }
}