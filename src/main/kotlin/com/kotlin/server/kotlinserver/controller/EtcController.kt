package com.kotlin.server.kotlinserver.controller

import com.kotlin.server.kotlinserver.model.request.LoginRequest
import com.kotlin.server.kotlinserver.model.response.User
import com.kotlin.server.kotlinserver.model.ResponseResult
import com.kotlin.server.kotlinserver.model.request.AuthCodeRequest
import com.kotlin.server.kotlinserver.model.request.DailyRequest
import com.kotlin.server.kotlinserver.model.request.InfoRequest
import com.kotlin.server.kotlinserver.model.request.VersionRequest
import com.kotlin.server.kotlinserver.model.response.AuthCode
import com.kotlin.server.kotlinserver.model.response.CompanyResponse
import com.kotlin.server.kotlinserver.model.response.DailyResponse
import com.kotlin.server.kotlinserver.model.response.InfoResponse
import com.kotlin.server.kotlinserver.model.response.PlaceResponse
import com.kotlin.server.kotlinserver.model.response.VersionResponse
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@Tag(
    name = "ETC API",
    description = "설정"
)
@RequestMapping("/etc")
class EtcController {

    @PostMapping("/company")
    fun companyList(
    ) : ResponseResult<List<CompanyResponse>> {
        return ResponseResult (
            true,
            listOf(
                CompanyResponse(
                    companyName = "두올테크"
                ),
                CompanyResponse(
                    companyName = "삼성전자"
                )
            ),
            200,
            ""
        )
    }

    @PostMapping("/version")
    fun version(
        @RequestBody body : VersionRequest
    ) : ResponseResult<VersionResponse> {
        return ResponseResult (
            true,
            VersionResponse(
                version = "1.0.1",
                isForce = false
            ),
            200,
            ""
        )
    }

}