package com.kotlin.server.kotlinserver.model

data class ResponseResult<T>(
    val success : Boolean,
    val result : T,
    val errCode : Int,
    val errMsg : String
)
