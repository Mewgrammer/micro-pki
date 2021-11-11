package com.mew.pki.csr.dto.request

import com.mew.pki.common.annotations.IsEnum
import org.springframework.data.domain.Sort
import javax.validation.constraints.Positive
import javax.validation.constraints.PositiveOrZero

class PaginationDto(
    @PositiveOrZero
    val page: Int,

    @Positive
    val limit: Int,

    @IsEnum(Sort.Direction::class)
    val sort: Sort.Direction = Sort.Direction.ASC,

    val sortBy: String? = null
)