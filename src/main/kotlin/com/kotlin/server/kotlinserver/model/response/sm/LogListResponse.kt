package com.kotlin.server.kotlinserver.model.response.sm

import com.fasterxml.jackson.annotation.JsonInclude
import io.swagger.v3.oas.annotations.media.Schema

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "NFC 출입 기록")
data class LogListResponse(
    @Schema(description = "lbatMnpwId", example = "12312")
    val lbatMnpwId : Int? = null,
    @Schema(description = "wrkrNm", example = "고*남")
    val wrkrNm : String? = null,
    @Schema(description = "dtb", example = "1777**03")
    val dtb : String? = null,
    @Schema(description = "vendNm", example = "Samsung E&A Co.Ltd")
    val vendNm : String? = null,
    @Schema(description = "pjtStgeNm", example = "유티동-SECLP00002")
    val pjtStgeNm : String? = null,
    @Schema(description = "날짜", example = "20271231")
    val lbatYmd : String? = null,
    @Schema(description = "출근 날짜시간", example = "20260120090909")
    val attnDtm : String? = null,
    @Schema(description = "퇴근 날짜시간", example = "20260121090909")
    val lvffcDtm : String? = null,
    @Schema(description = "ocpNm", example = "261")
    val ocpNm : String? = null,
    @Schema(description = "stdDsplNm", example = "34")
    val stdDsplNm : String? = null,
    @Schema(description = "empTpCd", example = "S")
    val empTpCd : String? = null,
)
