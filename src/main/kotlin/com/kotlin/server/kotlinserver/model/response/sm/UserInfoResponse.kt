package com.kotlin.server.kotlinserver.model.response.sm

import com.fasterxml.jackson.annotation.JsonInclude
import io.swagger.v3.oas.annotations.media.Schema

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "유저 정보 조회")
data class UserInfoResponse(
    @Schema(description = "프로젝트 이름", example = "Bayer MMDI Project")
    val pjtStgeNm : String? = null,
    @Schema(description = "프로젝트 번호", example = "PC00070001")
    val pjtStgeNo : String? = null,
    @Schema(description = "업체명", example = "PC00070001")
    val vendNm : String? = null,
    @Schema(description = "근로자/임직원 이름", example = "PC00070001")
    val wrkrNm : String? = null,
    @Schema(description = "직종", example = "PC00070001")
    val ocpNm : String? = null,
    @Schema(description = "공종", example = "PC00070001")
    val stdDsplNm : String? = null,
    @Schema(description = "근로자 고유아이디", example = "0")
    val lbatMnpwId : Int? = null,
    @Schema(description = "사진 정보", example = "adfkd-asdf-asdf-daf")
    val photoFileId : String? = null,
    @Schema(description = "생년월일", example = "1999**11")
    val dtb : String? = null,
    @Schema(description = "성별", example = "M")
    val gndrCd : String? = null,
)