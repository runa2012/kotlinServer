package com.kotlin.server.kotlinserver.model.response

import io.swagger.v3.oas.annotations.media.Schema

data class DailyResponse(

    @Schema(description = "이름", example = "홍길동")
    val name : String,
    @Schema(description = "국가", example = "한국")
    val nationalityName: String,
    @Schema(description = "성별", example = "M")
    val gender : String,
    @Schema(description = "이미지", example = "https://test.png")
    val profileUrl : String,
    @Schema(description = "생일", example = "1999-01-01")
    val birthDay : String,
    @Schema(description = "출근", example = "1999-01-01 18:01:00")
    val checkInDateTime : String,
    @Schema(description = "퇴근", example = "1999-01-01 18:01:00")
    val checkOutDateTime : String,
    @Schema(description = "회사이름", example = "두올테크")
    val company : String,
    @Schema(description = "공종", example = "인프라")
    val tradeName : String,
    @Schema(description = "직종", example = "보통안부")
    val fieldName : String,

)