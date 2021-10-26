package com.mew.pki.auth.data.repositories

import com.mew.pki.auth.data.entities.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserRepository : CrudRepository<User, UUID> {
    fun findByUsername(username: String): User?
}