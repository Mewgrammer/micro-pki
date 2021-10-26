package com.mew.pki.auth.data.repositories

import com.mew.pki.auth.data.entities.Role
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface RoleRepository : CrudRepository<Role, UUID> {
    fun findByName(name: String): Role?
}