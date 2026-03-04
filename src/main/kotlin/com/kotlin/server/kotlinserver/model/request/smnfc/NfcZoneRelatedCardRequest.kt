package com.kotlin.server.kotlinserver.model.request.smnfc

import io.swagger.v3.oas.annotations.media.Schema
import org.springframework.web.bind.annotation.RequestParam

data class NfcZoneRelatedCardRequest(
    @Schema(description = "프로젝트 단계 번호", example = "SECLP00002")
    @RequestParam val nfcCrdId : String,
    @Schema(description = "출역 구역 ID", example = "123123")
    @RequestParam val lbatZoneId : String,
    @Schema(description = "출입 방향", example = "I/O")
    @RequestParam val lbatSctNm : String,
    @Schema(description = "NFC 카드 번호", example = "123123")
    @RequestParam val nfcCrdNo : String,
    @Schema(description = "", example = "N")
    @RequestParam val regUserNo : String,
    @Schema(description = "", example = "N")
    @RequestParam val regPrgmUri : String,
)