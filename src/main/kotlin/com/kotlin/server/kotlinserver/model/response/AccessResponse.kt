package com.kotlin.server.kotlinserver.model.response

import io.swagger.v3.oas.annotations.media.Schema

data class AccessResponse(

    @Schema(description = "구역 이름", example = "S-1")
    val areaName : String,
    @Schema(description = "구역 ID", example = "12312312313")
    val areaId : String,
    @Schema(description = "In Out", example = "true" )
    val stateIn : Boolean,
    @Schema(description = "In Out 날짜", example = "2025-09-11 15:00:00" )
    val inOutDate : String,
    @Schema(description = "근로 정보 리스트", example = "")
    val workerList : List<WorkerResponse>,
)