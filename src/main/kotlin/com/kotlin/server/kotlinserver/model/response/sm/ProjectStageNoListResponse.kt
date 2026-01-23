package com.kotlin.server.kotlinserver.model.response.sm

import com.fasterxml.jackson.annotation.JsonInclude
import io.swagger.v3.oas.annotations.media.Schema

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "임직원 임시 토큰 생성")
data class ProjectStageNoListResponse(
    @Schema(description = "pjtNo", example = "PC0007")
    val pjtNo : String,
    @Schema(description = "Nm", example = "Bayer MMDI Project")
    val pjtNm : String,
    @Schema(description = "StgeNo", example = "PC00070001")
    val pjtStgeNo : String,
    @Schema(description = "StgeNm", example = "Bayer MMDI Project")
    val pjtStgeNm : String,
    @Schema(description = "pjtStgeCd", example = "Ph1")
    val pjtStgeCd : String,
    @Schema(description = "pjtStgeBgnYmd", example = "202511119")
    val pjtStgeBgnYmd : String,
    @Schema(description = "pjtStgeEndYmd", example = "99991231")
    val pjtStgeEndYmd : String,
    @Schema(description = "nfcUseYn", example = "Y")
    val nfcUseYn : String,

    @Schema(description = "nfcDwgFileId", example = "1231231-123123-1231-123123123")
    val nfcDwgFileId : String? = null,
    @Schema(description = "nfcCrdnFileId", example = "1231231-123123-1231-123123123")
    val nfcCrdnFileId : String? = null,

)
