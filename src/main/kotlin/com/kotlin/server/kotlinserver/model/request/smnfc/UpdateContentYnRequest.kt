package com.kotlin.server.kotlinserver.model.request.smnfc

import io.swagger.v3.oas.annotations.media.Schema
import org.springframework.web.bind.annotation.RequestParam

data class UpdateContentYnRequest(
    @Schema(description = "lbatMnpwId", example = "123123")
    @RequestParam val lbatMnpwId : String,
    @Schema(description = "nfcSrvcTrmsConsYn", example = "Y")
    @RequestParam val nfcSrvcTrmsConsYn : String,
    @Schema(description = "출입 방향", example = "Y")
    @RequestParam val nfcIndvInfmChcConsYn : String,
    @Schema(description = "nfcIndvInfmEsnConsYn", example = "Y")
    @RequestParam val nfcIndvInfmEsnConsYn : String,
    @Schema(description = "", example = "")
    @RequestParam val regUserNo : String,
    @Schema(description = "", example = "")
    @RequestParam val regPrgmUri : String,
)