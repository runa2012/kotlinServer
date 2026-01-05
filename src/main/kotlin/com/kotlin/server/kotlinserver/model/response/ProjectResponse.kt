package com.kotlin.server.kotlinserver.model.response

import io.swagger.v3.oas.annotations.media.Schema

data class ProjectResponse(


    @Schema(description = "프로젝트 ID", example = "1")
    val projectId : Int,
    @Schema(description = "프로젝트 이름", example = "프로젝트 A")
    val projectName : String,

)