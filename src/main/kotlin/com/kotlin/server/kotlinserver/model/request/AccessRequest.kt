package com.kotlin.server.kotlinserver.model.request

import io.swagger.v3.oas.annotations.media.Schema
import org.springframework.web.bind.annotation.RequestParam

data class AccessRequest(
    @Schema(description = "NFC Card ID", example = "-486400466299747104")
    @RequestParam val nfcCardId : String,
)