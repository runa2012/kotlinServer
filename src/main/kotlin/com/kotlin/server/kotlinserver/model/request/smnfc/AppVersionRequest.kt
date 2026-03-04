package com.kotlin.server.kotlinserver.model.request.smnfc

import io.swagger.v3.oas.annotations.media.Schema
import org.springframework.web.bind.annotation.RequestParam

data class AppVersionRequest(
    @Schema(description = "휴대기기 OS", example = "ANDROID")
    @RequestParam val mbpnOsNm : String,
    @Schema(description = "휴대기기 타입", example = "PHONE")
    @RequestParam val mbpnTpNm : String,
    @Schema(description = "모델 이름", example = "SM12345")
    @RequestParam val nbpnMdelNm : String,
)