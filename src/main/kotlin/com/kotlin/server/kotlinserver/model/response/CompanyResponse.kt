package com.kotlin.server.kotlinserver.model.response

import io.swagger.v3.oas.annotations.media.Schema

data class CompanyResponse(

    @Schema(description = "회사", example = "두올테크")
    val companyName : String,

)