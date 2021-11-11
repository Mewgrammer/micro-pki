package com.mew.pki.csr.data.entities

import com.mew.pki.common.types.BaseEntity
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.util.*
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "csr")
class Csr(
    id: UUID? = null,
    val csr: String,
    val comment: String,
    val subject: String,
    val publicKey: String,
) : BaseEntity(id) {
    @CreatedDate
    var createdAt: Date? = null

    @LastModifiedDate
    var updatedAt: Date? = null

}