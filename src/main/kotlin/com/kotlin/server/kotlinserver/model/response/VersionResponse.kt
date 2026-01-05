package com.kotlin.server.kotlinserver.model.response

import io.swagger.v3.oas.annotations.media.Schema

data class VersionResponse(

    @Schema(description = "최신버전", example = "1.0.0")
    val version : String,
    @Schema(description = "강제 업데이트 여부", example = "false")
    val isForce : Boolean,

)