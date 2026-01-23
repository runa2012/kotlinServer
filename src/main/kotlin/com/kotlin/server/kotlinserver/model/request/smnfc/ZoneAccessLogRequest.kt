package com.kotlin.server.kotlinserver.model.request.smnfc

import io.swagger.v3.oas.annotations.media.Schema
import org.springframework.web.bind.annotation.RequestParam

data class ZoneAccessLogRequest(
    @Schema(description = "출역 인력 ID", example = "SECLP00002")
    @RequestParam val lbatMnpwId : Int,
    @Schema(description = "출입 일시", example = "N")
    @RequestParam val lbatTagDtms : String,
    @Schema(description = "NFC 카드 번호", example = "N")
    @RequestParam val nfcCrdNo : String,
    @Schema(description = "MDM 설치 여부", example = "N")
    @RequestParam val mdmIstlYn : String,
)