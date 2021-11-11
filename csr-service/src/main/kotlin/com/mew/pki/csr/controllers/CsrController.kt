package com.mew.pki.csr.controllers

import com.mew.pki.csr.data.entities.Csr
import com.mew.pki.csr.dto.request.CreateCsrDto
import com.mew.pki.csr.dto.request.PaginationDto
import com.mew.pki.csr.dto.response.CsrDto
import com.mew.pki.csr.dto.response.PaginatedDataDto
import com.mew.pki.csr.services.CsrService
import org.modelmapper.ModelMapper
import org.springframework.http.HttpStatus
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException
import java.util.*

@RestController
@RequestMapping("/api/v1/csr")
@Validated
class CsrController(val csrService: CsrService, val mapper: ModelMapper) {

    @GetMapping
    fun getPaginatedCsrList(paginationDto: PaginationDto): PaginatedDataDto<Csr> {
        val data = csrService.findAll(paginationDto)
        return PaginatedDataDto(paginationDto.page, 0, 0, data);
    }

    @GetMapping("{id}")
    fun getById(@PathVariable id: UUID ): Csr {
        return csrService.findById(id) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/search")
    fun searchCsr(@RequestParam csr: String): Csr {
        return csrService.findByCsr(csr) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    fun createCsr(@RequestBody dto: CreateCsrDto): Csr {
        return csrService.createCsr(dto);
    }

    @DeleteMapping("{id}")
    fun deleteCsr(@PathVariable id: UUID ) {
        csrService.deleteCsrById(id);
    }
}