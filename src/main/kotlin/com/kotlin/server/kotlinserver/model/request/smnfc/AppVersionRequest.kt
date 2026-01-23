package com.kotlin.server.kotlinserver.model.request.smnfc

import io.swagger.v3.oas.annotations.media.Schema
import org.springframework.web.bind.annotation.RequestParam

data class AppVersionRequest(
    @Schema(description = "", example = "SECLP00002")
    @RequestParam val mbpnApsVerNo : Int,
    @Schema(description = "", example = "N")
    @RequestParam val mbpnOsNm : String,
    @Schema(description = "", example = "N")
    @RequestParam val mbpnTpNm : String,
    @Schema(description = "", example = "N")
    @RequestParam val nbpnMdelNm : String,
)