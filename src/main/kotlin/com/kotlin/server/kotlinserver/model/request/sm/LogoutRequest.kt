package com.kotlin.server.kotlinserver.model.request.sm

import io.swagger.v3.oas.annotations.media.Schema
import org.springframework.web.bind.annotation.RequestParam

data class LogoutRequest(
    @Schema(description = "토큰", example = "adl;kfjasl;dkjfal;ksdjasdfklasjflie")
    @RequestParam val accTknVal : String,
)