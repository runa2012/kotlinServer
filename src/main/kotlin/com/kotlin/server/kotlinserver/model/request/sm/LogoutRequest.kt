package com.kotlin.server.kotlinserver.model.request.sm

import io.swagger.v3.oas.annotations.media.Schema
import org.springframework.web.bind.annotation.RequestParam

data class LogoutRequest(
    @Schema(description = "성공 여부 (1:성공, 2:401, 에러 다른기기로그인,)", example = "1")
    @RequestParam val test : Int,
    @Schema(description = "토큰", example = "adl;kfjasl;dkjfal;ksdjasdfklasjflie")
    @RequestParam val accTknVal : String,
)