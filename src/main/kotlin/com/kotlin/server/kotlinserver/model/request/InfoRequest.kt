package com.kotlin.server.kotlinserver.model.request

import io.swagger.v3.oas.annotations.media.Schema
import org.springframework.web.bind.annotation.RequestParam

data class InfoRequest(
    @Schema(description = "사용자 ID", example = "1")
    @RequestParam val userId : Long,
)