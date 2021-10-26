package com.mew.pki.auth.configuration

import com.mew.pki.auth.services.AuthUserDetailsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.password.NoOpPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder

@EnableWebSecurity
class SecurityConfigurator(disableDefaults: Boolean = false) : WebSecurityConfigurerAdapter(disableDefaults) {
    @Autowired
    lateinit var userDetailsService: AuthUserDetailsService;

    @Override
    override fun configure(auth: AuthenticationManagerBuilder) {
        auth.userDetailsService(userDetailsService)
        super.configure(auth)
    }

    @Override
    override fun configure(http: HttpSecurity) {
        super.configure(http)
    }

    @Bean
    fun passwordEncoder(): PasswordEncoder {
        return NoOpPasswordEncoder.getInstance();
    }
}