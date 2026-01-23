package com.kotlin.server.kotlinserver.model.response.sm

import com.fasterxml.jackson.annotation.JsonInclude
import io.swagger.v3.oas.annotations.media.Schema

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "임직원 임시 토큰 생성")
data class OptCreateResponse(
    @Schema(description = "succYn", example = "Y")
    val succYn : String? = null,
    @Schema(description = "userType", example = "토큰 권한")
    val userType : String? = null,
)
