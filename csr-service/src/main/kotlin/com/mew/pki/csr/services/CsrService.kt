package com.mew.pki.csr.services

import com.mew.pki.csr.data.entities.Csr
import com.mew.pki.csr.data.repositories.CsrRepository
import com.mew.pki.csr.dto.CsrDto
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import java.util.*

@Service
class CsrService {

    @Autowired
    lateinit var mapper: ModelMapper;

    @Autowired
    lateinit var repository: CsrRepository;

    fun findAll(): List<CsrDto> {
        return repository.findAll().map { c -> mapper.map(c, CsrDto::class.java) };
    }

    fun findByCsr(csr: String): CsrDto {
        val match = repository.findByCsr(csr) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND, "CSR not found");
        return mapper.map(match, CsrDto::class.java);
    }

    fun createCsr(csrDto: CsrDto): CsrDto {
        val csr = mapper.map(csrDto, Csr::class.java);
        return mapper.map(repository.save(csr), CsrDto::class.java);
    }

    fun deleteCsr(id: UUID) {
        return repository.deleteById(id);
    }
}