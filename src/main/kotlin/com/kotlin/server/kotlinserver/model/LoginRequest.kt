package com.kotlin.server.kotlinserver.model

import io.swagger.v3.oas.annotations.media.Schema
import org.springframework.web.bind.annotation.RequestParam


data class LoginRequest(
    @Schema(description = "사용자 ID", example = "1")
    @RequestParam val username : String,
    @Schema(description = "사용자 Password", example = "1")
    @RequestParam val password : String
)
