package com.kotlin.server.kotlinserver.model.response

import io.swagger.v3.oas.annotations.media.Schema

data class AreaResponse(

    @Schema(description = "구역 정보 ID", example = "1")
    val areaId : Int,
    @Schema(description = "구역 정보", example = "E-1")
    val areaName : String,

)