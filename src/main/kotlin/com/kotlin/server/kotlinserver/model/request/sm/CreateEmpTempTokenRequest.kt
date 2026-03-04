package com.kotlin.server.kotlinserver.model.request.sm

import io.swagger.v3.oas.annotations.media.Schema
import org.springframework.web.bind.annotation.RequestParam

data class CreateEmpTempTokenRequest(
    @Schema(description = "유저아이디", example = "bk028.choi@partner.samsung.com")
    @RequestParam val userId : String,
    @Schema(description = "비밀번호", example = "@ch18401778")
    @RequestParam val userSecret : String,
    @Schema(description = "휴대폰번호", example = "010323323232")
    @RequestParam val userCelNo : String,
)