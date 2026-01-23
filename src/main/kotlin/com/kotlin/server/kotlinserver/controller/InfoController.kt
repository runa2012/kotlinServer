package com.kotlin.server.kotlinserver.controller

import com.kotlin.server.kotlinserver.model.response.UserResponse
import com.kotlin.server.kotlinserver.model.ResponseResult
import com.kotlin.server.kotlinserver.model.request.InfoRequest
import com.kotlin.server.kotlinserver.model.response.InfoResponse
import com.kotlin.server.kotlinserver.model.response.WorkerResponse
import io.swagger.v3.oas.annotations.tags.Tag
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

    @PostMapping
    fun getUser(
        @RequestBody body : InfoRequest
    ) : ResponseResult<InfoResponse> {
        return when( body.userId ){
            1L -> ResponseResult(
                "true",
                InfoResponse(
                    user = UserResponse(1, "홍길동", 25),
                    birthDay = "1999-08-08",
                    gender = "M",
                    profileUrl = "https://www.chosun.com/resizer/v2/TI3SOYYUMNJS63A7YYFA6F4ZF4.jpg?auth=25eeb6691dde903aea040bcd42121290f1101abf6f17062762fc91ac998f84a2&width=616",
                    workerList = listOf(
                        WorkerResponse(
                            name = "홍길동",
                            placeName = "삼성E&A",
                            grade = "현장소장"
                        ),
                        WorkerResponse(
                            name = "홍길동",
                            placeName = "(p3/복합동-PH1)두올테크",
                            grade = "[관리자(공통)]관리"
                        )
                    )
                ),
                "SUCCESS",
                "",
                ""
            )
            else -> ResponseResult(
                "true",
                InfoResponse(
                    user = UserResponse(0, "", 0),
                    birthDay = "",
                    gender = "",
                    profileUrl = "",
                    workerList = listOf()
                ),
                "SUCCESS",
                "",
                ""
            )
        }
    }

}