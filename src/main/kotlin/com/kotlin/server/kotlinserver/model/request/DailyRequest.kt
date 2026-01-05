package com.kotlin.server.kotlinserver.model.request

import io.swagger.v3.oas.annotations.media.Schema
import org.springframework.web.bind.annotation.RequestParam

data class DailyRequest(
    @Schema(description = "회사 이름", example = "주식회사 두올테크")
    @RequestParam val company : String,
    @Schema(description = "이름", example = "홍길동")
    @RequestParam val name : String,
    @Schema(description = "일자", example = "2025-02-02")
    @RequestParam val date : String,
    @Schema(description = "페이지", example = "1")
    @RequestParam val page : String,
    @Schema(description = "사이즈", example = "20")
    @RequestParam val size : String,
)