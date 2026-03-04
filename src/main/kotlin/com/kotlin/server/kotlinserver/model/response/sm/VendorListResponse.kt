package com.kotlin.server.kotlinserver.model.response.sm

import com.fasterxml.jackson.annotation.JsonInclude
import io.swagger.v3.oas.annotations.media.Schema

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "NFC 출입 기록")
data class VendorListResponse(
    @Schema(description = "회사 코드", example = "x10000")
    val vendCd : String? = null,
    @Schema(description = "회사 이름", example = "삼성 E&A Co.Ltd")
    val vendNm : String? = null,
)
