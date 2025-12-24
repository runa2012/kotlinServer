package com.kotlin.server.kotlinserver.controller

import com.kotlin.server.kotlinserver.model.request.LoginRequest
import com.kotlin.server.kotlinserver.model.response.User
import com.kotlin.server.kotlinserver.model.ResponseResult
import com.kotlin.server.kotlinserver.model.request.AuthCodeRequest
import com.kotlin.server.kotlinserver.model.response.AuthCode
import com.kotlin.server.kotlinserver.model.response.InfoResponse
import com.kotlin.server.kotlinserver.model.response.PlaceResponse
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
    name = "Info API",
    description = "사용자 정보"
)
@RequestMapping("/info")
class InfoController {

    @GetMapping("/{id}")
    fun getUser( @PathVariable id : Long ) : InfoResponse? {
        return when( id ){
            1L -> InfoResponse(
                user = User(1, "alic", 25),
                birthDay = "880808",
                gender = "M",
                profileUrl = "",
                placeList = listOf(
                    PlaceResponse(
                        name = "홍길동",
                        placeName = "삼성E&A",
                        grade = "현장소장"
                    ),
                    PlaceResponse(
                        name = "홍길동",
                        placeName = "삼성E&A",
                        grade = "[관리자(공통)]관리"
                    )
                )
            )
            2L -> InfoResponse(
                user = User(1, "alic", 25),
                birthDay = "880808",
                gender = "M",
                profileUrl = "",
                placeList = listOf(
                    PlaceResponse(
                        name = "홍길동",
                        placeName = "삼성E&A",
                        grade = "현장소장"
                    ),
                    PlaceResponse(
                        name = "홍길동",
                        placeName = "삼성E&A",
                        grade = "현장소장"
                    )
                )
            )
            3L -> InfoResponse(
                user = User(1, "alic", 25),
                birthDay = "880808",
                gender = "M",
                profileUrl = "",
                placeList = listOf(
                    PlaceResponse(
                        name = "홍길동",
                        placeName = "삼성E&A",
                        grade = "현장소장"
                    ),
                    PlaceResponse(
                        name = "홍길동",
                        placeName = "삼성E&A",
                        grade = "현장소장"
                    )
                )
            )
            else -> null
        }
    }

}