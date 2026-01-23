package com.kotlin.server.kotlinserver.model.request.smnfc

import io.swagger.v3.oas.annotations.media.Schema
import org.springframework.web.bind.annotation.RequestParam

data class NfcZoneRelatedCardRequest(
    @Schema(description = "", example = "SECLP00002")
    @RequestParam val nfcCrdId : Int,
    @Schema(description = "", example = "N")
    @RequestParam val lbatZoneId : String,
    @Schema(description = "", example = "N")
    @RequestParam val pjtStgeNo : String,
    @Schema(description = "", example = "N")
    @RequestParam val lbatSctNm : String,
    @Schema(description = "", example = "N")
    @RequestParam val nfcCrdNo : String,
)