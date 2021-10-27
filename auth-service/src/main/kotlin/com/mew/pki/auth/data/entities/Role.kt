package com.mew.pki.auth.data.entities

import com.mew.pki.common.types.BaseEntity
import org.springframework.data.annotation.CreatedDate
import java.util.*
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name="role")
class Role(
    id: UUID? = null,
    val name: String,
    @CreatedDate val createdAt: Date,
    ) : BaseEntity(id)