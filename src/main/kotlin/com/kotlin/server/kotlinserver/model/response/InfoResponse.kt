package com.kotlin.server.kotlinserver.model.response

import io.swagger.v3.oas.annotations.media.Schema

data class InfoResponse(

    val user : User,
    @Schema(description = "생년월일", example = "880808")
    val birthDay : String,
    @Schema(description = "성별", example = "M")
    val gender : String,
    @Schema(description = "이미지", example = "https://test.png")
    val profileUrl : String,
    @Schema(description = "근로 정보 리스트", example = "")
    val workerList : List<WorkerResponse>,
)