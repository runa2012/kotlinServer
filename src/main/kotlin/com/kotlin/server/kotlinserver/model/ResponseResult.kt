package com.kotlin.server.kotlinserver.model

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class ResponseResult<T>(
    val path : String? = null,
    val payload : T? = null,
    val errCode : String? = null,
    val message : String? = null,
    val timestamp: String? = null,
    val errMsg : String? = null
)
