package com.kotlin.server.kotlinserver.model.request.smnfc

import io.swagger.v3.oas.annotations.media.Schema
import org.springframework.web.bind.annotation.RequestParam

data class NfcAccessLogListRequest(
    @Schema(description = "", example = "SECLP00002")
    @RequestParam val searchDate : Int,
    @Schema(description = "", example = "N")
    @RequestParam val mbpnTlno : String,
)