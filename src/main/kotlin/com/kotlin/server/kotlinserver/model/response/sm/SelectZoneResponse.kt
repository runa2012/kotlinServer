package com.kotlin.server.kotlinserver.model.response.sm

import com.fasterxml.jackson.annotation.JsonInclude
import io.swagger.v3.oas.annotations.media.Schema

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "임직원 임시 토큰 생성")
data class SelectZoneResponse(
    @Schema(description = "pjtStgeNo", example = "SECLP00002")
    val pjtStgeNo : String? = null,
    @Schema(description = "lbatZoneId", example = "73")
    val lbatZoneId : Int? = null,
    @Schema(description = "pjtStgeNm", example = "GEC 2층 회의실 조성공사")
    val pjtStgeNm : String? = null,
    @Schema(description = "lbatZoneNm", example = "서2")
    val lbatZoneNm : String? = null,
    @Schema(description = "inCard", example = "5")
    val inCard : String? = null,
    @Schema(description = "outCard", example = "6")
    val outCard : String? = null,
    @Schema(description = "lbatUseYn", example = "Y")
    val lbatUseYn : String? = null,
    @Schema(description = "fstRgtrUsrNo", example = "BU008")
    val fstRgtrUsrNo : String? = null,
    @Schema(description = "fnlUpdDtms", example = "2025-11-25 17:24:22.091+09")
    val fnlUpdDtms : String? = null,
)