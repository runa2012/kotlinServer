package com.kotlin.server.kotlinserver.model.response.sm

import com.fasterxml.jackson.annotation.JsonInclude
import io.swagger.v3.oas.annotations.media.Schema

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "버전 정보")
data class VersionResponse(
    @Schema(description = "mbpnApsVerNo", example = "1.0.0")
    val mbpnApsVerNo : String? = null,
    @Schema(description = "mbpnOsNm", example = "ANDROID")
    val mbpnOsNm : String? = null,
    @Schema(description = "mbpnTpNm", example = "PHONE")
    val mbpnTpNm : String? = null,
    @Schema(description = "mbpnMdelNm", example = "M12345")
    val mbpnMdelNm : String? = null,
)