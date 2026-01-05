package com.kotlin.server.kotlinserver.controller

import com.kotlin.server.kotlinserver.model.ResponseResult
import com.kotlin.server.kotlinserver.model.request.DailyRequest
import com.kotlin.server.kotlinserver.model.response.DailyResponse
import com.kotlin.server.kotlinserver.model.response.AreaResponse
import com.kotlin.server.kotlinserver.model.response.ProjectResponse
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@Tag(
    name = "Expanded API",
    description = "설정"
)
@RequestMapping("/expanded")
class ExpandedController {

    @PostMapping("/daily")
    fun getUser(
        @RequestBody body : DailyRequest
    ) : ResponseResult<List<DailyResponse>> {
        return ResponseResult (
            true,
            listOf<DailyResponse>(
                DailyResponse(
                    name = "홍길동",
                    nationalityName = "한국",
                    gender = "M",
                    profileUrl = "https://i.namu.wiki/i/1YZju6c94ZO4pY2iQjRK5J9iCSN88XueZC1xb9n7BLrU4gsSeYt9G7-_30nL2ZeAGRoACpK6o3Rc5mRwr0hKUw.webp",
                    birthDay = "1999-11-02",
                    checkInDateTime = "1999-01-01 18:01:00",
                    checkOutDateTime = "1999-01-01 22:01:00",
                    company = "삼성전자",
                    tradeName = "인프라",
                    fieldName = "보통안부"
                ),
                DailyResponse(
                    name = "원지안",
                    nationalityName = "한국",
                    gender = "F",
                    profileUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTHcHT8PKA-7PnTUkRIXVdqE177-lGQ5J6pkg&s",
                    birthDay = "1999-01-01",
                    checkInDateTime = "1999-01-01 15:01:00",
                    checkOutDateTime = "1999-01-01 23:01:00",
                    company = "두올테크",
                    tradeName = "인프라",
                    fieldName = "보통안부"
                )
            ),
            200,
            ""
        )
    }

    @PostMapping("/project")
    fun projectList(
    ) : ResponseResult<List<ProjectResponse>> {
        return ResponseResult (
            true,
            listOf(
                ProjectResponse(
                    projectName = "Project A",
                    projectId = 1
                ),
                ProjectResponse(
                    projectName = "Project B",
                    projectId = 2
                ),
            ),
            200,
            ""
        )
    }

    @PostMapping("/project/area")
    fun areaList(
    ) : ResponseResult<List<AreaResponse>> {
        return ResponseResult (
            true,
            listOf(
                AreaResponse(
                    areaId = 1,
                    areaName = "E-1"
                ),
                AreaResponse(
                    areaId = 2,
                    areaName = "E-2"
                ),
            ),
            200,
            ""
        )
    }

}