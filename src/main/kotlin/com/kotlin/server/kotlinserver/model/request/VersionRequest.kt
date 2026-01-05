package com.kotlin.server.kotlinserver.model.request

import io.swagger.v3.oas.annotations.media.Schema
import org.springframework.web.bind.annotation.RequestParam

data class VersionRequest(
    @Schema(description = "앱 버전", example = "1.0.0")
    @RequestParam val appVersion : String,
)