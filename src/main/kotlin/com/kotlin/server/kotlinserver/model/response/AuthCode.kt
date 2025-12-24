package com.kotlin.server.kotlinserver.model.response

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "휴대폰 인증 번호")
data class AuthCode(
    @Schema(description = "인증 번호", example = "1")
    val checkNumber : Int,
)