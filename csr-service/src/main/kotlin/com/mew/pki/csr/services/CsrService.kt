package com.mew.pki.csr.services

import com.mew.pki.csr.data.entities.Csr
import com.mew.pki.csr.data.repositories.CsrRepository
import com.mew.pki.csr.dto.request.CreateCsrDto
import com.mew.pki.csr.dto.request.PaginationDto
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service
import java.util.*

@Service
class CsrService(val repository: CsrRepository) {

    fun findAll(pagination: PaginationDto): Iterable<Csr> {
        return repository.findAll(
            PageRequest.of(pagination.page, pagination.limit).withSort(pagination.sort, pagination.sortBy)
        );
    }

    fun findByCsr(csr: String): Csr? {
        return repository.findByCsr(csr);
    }

    fun createCsr(csrDto: CreateCsrDto): Csr {
        val csr = Csr(csr = csrDto.csr, comment = "", subject = "", publicKey = "");
        return repository.save(csr);
    }

    fun deleteCsrById(id: UUID) {
        return repository.deleteById(id);
    }

    fun findById(id: UUID): Csr? {
        val csr = repository.findById(id);
        return if (csr.isPresent) csr.get() else null;
    }
}