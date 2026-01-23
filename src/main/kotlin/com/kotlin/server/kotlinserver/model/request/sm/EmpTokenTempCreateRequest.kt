package com.kotlin.server.kotlinserver.model.request.sm

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "임직원 임시 토큰 생성")
data class EmpTokenTempCreateRequest(
    @Schema(description = "유저 아이디", example = "bk0228.choi@partner.samung.com")
    val userId : String,
    @Schema(description = "유저 비밀번호", example = "@ch18401778")
    val userSecret : String,
    @Schema(description = "유저 휴대폰 번호", example = "01064040054")
    val userCelNo : String,
)