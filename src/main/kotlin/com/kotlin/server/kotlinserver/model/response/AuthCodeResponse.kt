package com.kotlin.server.kotlinserver.model.response

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "휴대폰 인증 번호")
data class AuthCodeResponse(
    @Schema(description = "인증 번호", example = "112312")
    val checkNumber : String,
)