package com.kotlin.server.kotlinserver.model.response

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "사용자 정보")
data class User(
    @Schema(description = "사용자 ID", example = "1")
    val id : Long,
    @Schema(description = "사용자 이름", example = "이름")
    val name : String,
    @Schema(description = "사용자 나이", example = "25")
    val age : Int
)