package com.mew.pki.csr.dto.response

import com.mew.pki.common.annotations.NoArg
import java.util.*

@NoArg
data class CsrDto(val id: UUID, val csr: String, val createdAt: Date, val requestor: UUID);