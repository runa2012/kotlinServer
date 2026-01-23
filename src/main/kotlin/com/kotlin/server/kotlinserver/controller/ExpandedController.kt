package com.kotlin.server.kotlinserver.controller

import com.kotlin.server.kotlinserver.model.ResponseResult
import com.kotlin.server.kotlinserver.model.request.DailyRequest
import com.kotlin.server.kotlinserver.model.response.DailyResponse
import com.kotlin.server.kotlinserver.model.response.AreaResponse
import com.kotlin.server.kotlinserver.model.response.sm.ProjectResponse
import com.kotlin.server.kotlinserver.model.response.sm.ProjectStageNoListResponse
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
            "true",
            listOf<DailyResponse>(
                DailyResponse(
                    name = "홍길동",
                    nationalityName = "한국",
                    gender = "M",
                    profileUrl = "https://www.cosinkorea.com/data/photos/20240939/art_17276123415305_b398a9.jpg",
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
                    profileUrl = "https://www.chosun.com/resizer/v2/TI3SOYYUMNJS63A7YYFA6F4ZF4.jpg?auth=25eeb6691dde903aea040bcd42121290f1101abf6f17062762fc91ac998f84a2&width=616",
                    birthDay = "1999-01-01",
                    checkInDateTime = "1999-01-01 15:01:00",
                    checkOutDateTime = "1999-01-01 23:01:00",
                    company = "두올테크",
                    tradeName = "인프라",
                    fieldName = "보통안부"
                )
            ),
            "SUCCESS",
            "",
            ""
        )
    }

    @PostMapping("/project")
    fun projectList(
    ) : ResponseResult<ProjectResponse> {
        return ResponseResult (
            "true",
            ProjectResponse(
                pjtNo = "PC0007",
                pjtNm = "Bayer MMDI Project",
                pjtStgeNo = "PC00070001",
                pjtStgeNm = "Bayer MMDI Project",
                projectStageNoList = listOf(
                    ProjectStageNoListResponse(
                        pjtNo = "PC0007",
                        pjtNm = "Bayer MMDI Project",
                        pjtStgeNo = "PC00070001",
                        pjtStgeNm = "Bayer MMDI Project",
                        pjtStgeCd = "Ph1",
                        pjtStgeBgnYmd = "202511119",
                        pjtStgeEndYmd = "99991231",
                        nfcUseYn = "Y"
                    ),
                    ProjectStageNoListResponse(
                        pjtNo = "PC0008",
                        pjtNm = "Bayer MMDI Project 1",
                        pjtStgeNo = "PC00070001",
                        pjtStgeNm = "Bayer MMDI Project 1",
                        pjtStgeCd = "Ph2",
                        pjtStgeBgnYmd = "202511120",
                        pjtStgeEndYmd = "99990131",
                        nfcUseYn = "Y"
                    ),
                ),
            ),
            "SUCCESS",
            "",
            ""
        )
    }

    @PostMapping("/project/area")
    fun areaList(
    ) : ResponseResult<List<AreaResponse>> {
        return ResponseResult (
            "true",
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
            "SUCCESS",
            "",
            ""
        )
    }

}