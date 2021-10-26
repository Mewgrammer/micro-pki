package com.mew.pki.auth.data.entities

import org.springframework.data.annotation.CreatedDate
import java.util.*
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name="roles")
class Role(
    id: UUID? = null,
    val name: String,
    @CreatedDate val createdAt: Date,
    ) : BaseEntity(id)