package com.mew.pki.auth.data.entities

import com.mew.pki.common.types.BaseEntity
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.util.*
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name="user")
class User(
    id: UUID? = null,
    val username: String,
    val password: String,
    @CreatedDate val createdAt: Date,
    @LastModifiedDate val updatedAt: Date,
    ) : BaseEntity(id)