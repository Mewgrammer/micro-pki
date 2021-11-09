package com.mew.pki.auth.types

enum class UserRole(val roleName: String) {
    GUEST(Names.GUEST),
    USER(Names.USER),
    ADMIN(Names.ADMIN);

    class Names {
        companion object {
            const val GUEST = "guest"
            const val USER = "user"
            const val ADMIN = "admin"
        }
    }
}