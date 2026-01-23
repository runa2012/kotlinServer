package com.kotlin.server.kotlinserver.model.request.sm

import io.swagger.v3.oas.annotations.media.Schema
import org.springframework.web.bind.annotation.RequestParam

data class CreateWorkerTempTokenRequest(
    @Schema(description = "유저이름", example = "홍길동")
    @RequestParam val userNm : String,
    @Schema(description = "휴대폰번호", example = "01012345678")
    @RequestParam val userCelNo : String,
    @Schema(description = "생년월일", example = "20260121")
    @RequestParam val dtbYmd : String,
)