package com.mew.pki.csr.dto.response

class PaginatedDataDto<T>(
    val page: Int,
    val pageSize: Int,
    val pages: Int,
    val data: Iterable<T>
)