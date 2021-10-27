package com.mew.pki.csr.data.repositories

import com.mew.pki.csr.data.entities.Csr
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface CsrRepository : CrudRepository<Csr, UUID> {
    fun findByCsr(csr: String): Csr?
}