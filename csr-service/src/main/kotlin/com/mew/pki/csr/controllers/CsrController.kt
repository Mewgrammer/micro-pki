package com.mew.pki.csr.controllers

import com.mew.pki.csr.dto.CsrDto
import com.mew.pki.csr.services.CsrService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.validation.Valid

@RestController("/api/csr/v1")
@Validated
class CsrController {

    @Autowired
    lateinit var csrService: CsrService;

    @GetMapping
    @ResponseBody
    fun getAll(): List<CsrDto> {
        return csrService.findAll();
    }

    @GetMapping("/search")
    @ResponseBody
    fun searchCsr(@RequestParam csr: String): CsrDto {
        return csrService.findByCsr(csr);
    }

    @PostMapping
    @ResponseBody
    fun createCsr(@RequestBody @Valid dto: CsrDto): CsrDto {
        return csrService.createCsr(dto);
    }

    @DeleteMapping
    fun deleteCsr(id: String) {
        csrService.deleteCsr(UUID.fromString(id));
    }
}