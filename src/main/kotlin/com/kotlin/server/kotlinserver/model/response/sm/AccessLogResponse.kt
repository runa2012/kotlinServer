package com.kotlin.server.kotlinserver.model.response.sm

import com.fasterxml.jackson.annotation.JsonInclude
import io.swagger.v3.oas.annotations.media.Schema

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "임직원 임시 토큰 생성")
data class AccessLogResponse(
    @Schema(description = "출구 방향", example = "서2")
    val lbatSctNm : String? = null,
    @Schema(description = "구역 이름", example = "IN")
    val lbatZoneNm : String? = null,
    @Schema(description = "날짜", example = "2025-11-11 11:11:11")
    val lbatTagDtms : String? = null,
)