package com.kotlin.server.kotlinserver.model.request.smnfc

import io.swagger.v3.oas.annotations.media.Schema
import org.springframework.web.bind.annotation.RequestParam

data class NfcAccessLogListRequest(
    @Schema(description = "프로젝트 이름", example = "20251224")
    @RequestParam val pjtStgeNm : String,
    @Schema(description = "날짜", example = "20251224")
    @RequestParam val searchDate : String,
    @Schema(description = "이름", example = "N")
    @RequestParam val wrkrNm : String,
    @Schema(description = "", example = "N")
    @RequestParam val vendCd : String,
    @Schema(description = "", example = "N")
    @RequestParam val vendNm : String,
    @Schema(description = "", example = "N")
    @RequestParam val zoneNm : String,
)