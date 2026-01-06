package com.kotlin.server.kotlinserver.controller

import com.kotlin.server.kotlinserver.model.response.User
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
                true,
                InfoResponse(
                    user = User(1, "홍길동", 25),
                    birthDay = "1999-08-08",
                    gender = "M",
                    profileUrl = "https://i.namu.wiki/i/1YZju6c94ZO4pY2iQjRK5J9iCSN88XueZC1xb9n7BLrU4gsSeYt9G7-_30nL2ZeAGRoACpK6o3Rc5mRwr0hKUw.webp",
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
                200,
                ""
            )
            else -> ResponseResult(
                true,
                InfoResponse(
                    user = User(0, "", 0),
                    birthDay = "",
                    gender = "",
                    profileUrl = "",
                    workerList = listOf()
                ),
                200,
                ""
            )
        }
    }

}