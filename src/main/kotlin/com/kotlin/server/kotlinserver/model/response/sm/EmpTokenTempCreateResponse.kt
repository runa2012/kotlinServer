package com.kotlin.server.kotlinserver.model.response.sm

import com.fasterxml.jackson.annotation.JsonInclude
import io.swagger.v3.oas.annotations.media.Schema

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "임직원 임시 토큰 생성")
data class EmpTokenTempCreateResponse(
    @Schema(description = "", example = "adlkfasdfasdfkjaslfk")
    val accTknVal : String? = null,
    @Schema(description = "succYn", example = "Y")
    val succYn : String? = null,
    @Schema(description = "프로젝트", example = "")
    val project : ProjectResponse? = null,

    @Schema(description = "잘못된 요청", example = "{}")
    val userId : String? = null,
    @Schema(description = "잘못된 요청", example = "{}")
    val userSecret : String? = null,
    @Schema(description = "잘못된 요청", example = "{}")
    val userCelNo : String? = null,
)