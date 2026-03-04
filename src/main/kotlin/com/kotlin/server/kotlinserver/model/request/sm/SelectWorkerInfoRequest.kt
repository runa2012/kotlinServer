package com.kotlin.server.kotlinserver.model.request.sm

import io.swagger.v3.oas.annotations.media.Schema
import org.springframework.web.bind.annotation.RequestParam

data class SelectWorkerInfoRequest(
    @Schema(description = "휴대폰 번호", example = "1")
    @RequestParam val mbpnTlno : String,
    @Schema(description = "프로젝트 번호", example = "1231")
    @RequestParam val pjtStgeNo : String,
)