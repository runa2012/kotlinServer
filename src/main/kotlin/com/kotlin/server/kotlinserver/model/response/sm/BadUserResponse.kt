package com.kotlin.server.kotlinserver.model.response.sm

import com.fasterxml.jackson.annotation.JsonInclude
import io.swagger.v3.oas.annotations.media.Schema

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "임직원 임시 토큰 생성")
data class BadUserResponse(
    @Schema(description = "No", example = "PC0007")
    val pjtNo : String? = null,
    @Schema(description = "Nm", example = "Bayer MMDI Project")
    val pjtNm : String? = null,
    @Schema(description = "StgeNo", example = "PC00070001")
    val pjtStgeNo : String? = null,
    @Schema(description = "StgeNm", example = "Bayer MMDI Project")
    val pjtStgeNm : String? = null,
    @Schema(description = "프로젝트 리스트", example = "{}")
    val projectStageNoList : List<ProjectStageNoListResponse>? = null,
)