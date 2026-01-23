package com.kotlin.server.kotlinserver.controller

import com.kotlin.server.kotlinserver.model.ResponseResult
import com.kotlin.server.kotlinserver.model.request.AccessRequest
import com.kotlin.server.kotlinserver.model.response.AccessResponse
import com.kotlin.server.kotlinserver.model.response.WorkerResponse
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@Tag(
    name = "Access API",
    description = "출입 관리"
)
@RequestMapping("/access")
class AccessController {

    @PostMapping
    fun getUser(
        @RequestBody body : AccessRequest
    ) : ResponseEntity<ResponseResult<AccessResponse>> {
        return when( body.nfcCardId ){
            "-4864600466299747104" -> ResponseEntity
                .status(HttpStatus.OK)
                .body(
                    ResponseResult(
                        "true",
                        AccessResponse(
                            areaId = "-4864600466299747104",
                            areaName = "S-1",
                            stateIn = true,
                            inOutDate = "2025-09-01 13:00:00",
                            workerList = listOf(
                                WorkerResponse(
                                    name = "원지안",
                                    placeName = "삼성 E&A",
                                    grade = "현장소장"
                                ),
                                WorkerResponse(
                                    name = "원지안",
                                    placeName = "(P3/복합동-PH1)두올테크",
                                    grade = "[관리자(공통)]관리"
                                )
                            )
                        ),
                        "SUCCESS",
                        "",
                        ""
                    )
                )
            "-859774497660533536" -> ResponseEntity
                .status(HttpStatus.OK)
                .body(
                    ResponseResult(
                        "true",
                        AccessResponse(
                            areaId = "-859774497660533536",
                            areaName = "S-2",
                            stateIn = true,
                            inOutDate = "2025-09-01 07:00:00",
                            workerList = listOf(
                                WorkerResponse(
                                    name = "원지안",
                                    placeName = "(P3/복합동-PH1)두올테크",
                                    grade = "[관리자(공통)]관리"
                                )
                            )
                        ),
                        "200",
                        "",
                        ""
                    )
                )
            "-5931880499067681568" ->
                ResponseEntity
                    .status(HttpStatus.OK)
                    .body(
                        ResponseResult(
                            "true",
                            AccessResponse(
                                areaId = "-5931880499067681568",
                                areaName = "S-3",
                                stateIn = true,
                                inOutDate = "",
                                workerList = listOf()
                            ),
                            "SUCCESS",
                            "",
                            ""
                        )
                    )
            else -> ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(
                    ResponseResult(
                        "false",
                        AccessResponse(
                            areaId = "",
                            areaName = "",
                            stateIn = true,
                            inOutDate = "",
                            workerList = listOf()
                        ),
                        "SUCCESS",
                        "",
                        ""
                    )
                )
        }
    }

}