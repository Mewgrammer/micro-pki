package com.mew.pki.csr.data.repositories

import com.mew.pki.csr.data.entities.Csr
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface CsrRepository : PagingAndSortingRepository<Csr, UUID> {
    fun findByCsr(csr: String): Csr?
    fun findByPublicKey(publicKey: String): Csr?
    fun findBySubject(subject: String): Csr?

}