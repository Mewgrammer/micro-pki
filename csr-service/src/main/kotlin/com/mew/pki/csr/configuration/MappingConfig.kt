package com.mew.pki.csr.configuration

import org.modelmapper.ModelMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class MappingConfig {
    @Bean
    fun modelMapper(): ModelMapper {
        return ModelMapper();
    }
}
