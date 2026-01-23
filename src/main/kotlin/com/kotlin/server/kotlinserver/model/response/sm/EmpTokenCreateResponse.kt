package com.kotlin.server.kotlinserver.model.response.sm

import com.fasterxml.jackson.annotation.JsonInclude
import io.swagger.v3.oas.annotations.media.Schema

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "임직원 임시 토큰 생성")
data class EmpTokenCreateResponse(
    @Schema(description = "", example = "adlkfasdfasdfkjaslfk")
    val accTknVal : String? = null,
    @Schema(description = "succYn", example = "Y")
    val succYn : String? = null,
    @Schema(description = "staffType", example = "SITE_ADMIN")
    val staffType : String? = null,
    @Schema(description = "사용자 권한", example = "GEC_EMPLOYEE")
    val userType : String? = null,
)