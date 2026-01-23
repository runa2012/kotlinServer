package com.kotlin.server.kotlinserver.model.request.sm

import io.swagger.v3.oas.annotations.media.Schema
import org.springframework.web.bind.annotation.RequestParam

data class CreatePartnerTempTokenRequest(
    @Schema(description = "성공 여부(1:성공, 2:다른기기가 사용해서 종료, 3:토큰 권한이 없음.)", example = "1")
    @RequestParam val test : Int,
    @Schema(description = "유저아이디", example = "근로자1")
    @RequestParam val userNm : String,
    @Schema(description = "휴대폰번호", example = "010323323232")
    @RequestParam val userCelNo : String,
    @Schema(description = "생년월일", example = "20251120")
    @RequestParam val dtbYmd : String,
)