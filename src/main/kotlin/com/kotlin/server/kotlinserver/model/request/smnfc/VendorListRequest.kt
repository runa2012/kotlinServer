package com.kotlin.server.kotlinserver.model.request.smnfc

import io.swagger.v3.oas.annotations.media.Schema
import org.springframework.web.bind.annotation.RequestParam

data class VendorListRequest(
    @Schema(description = "프로젝트 넘버", example = "SECLP0002")
    @RequestParam val pjtStgeNo : String,
)