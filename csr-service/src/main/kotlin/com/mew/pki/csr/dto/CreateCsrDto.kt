package com.mew.pki.csr.dto

import com.mew.pki.common.annotations.NoArg
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

@NoArg
class CreateCsrDto(
    @NotNull
    @NotBlank
    var csr: String,
);