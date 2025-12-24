package com.kotlin.server.kotlinserver.model.response

import io.swagger.v3.oas.annotations.media.Schema

data class PlaceResponse(
    @Schema(description = "이름", example = "홍길동")
    val name : String,
    @Schema(description = "장소 이름", example = "삼성E&A")
    val placeName : String,
    @Schema(description = "직급", example = "[관리자(공통)]관리")
    val grade : String,
)
