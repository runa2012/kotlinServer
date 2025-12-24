package com.kotlin.server.kotlinserver.model.request

import io.swagger.v3.oas.annotations.media.Schema
import org.springframework.web.bind.annotation.RequestParam

data class AuthCodeRequest(
    @Schema(description = "유저 이름", example = "이름")
    @RequestParam val username : String,
    @Schema(description = "사용자 Password", example = "01012341234")
    @RequestParam val phoneNumber : String
)