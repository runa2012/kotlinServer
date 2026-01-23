package com.kotlin.server.kotlinserver.controller.sm

import com.kotlin.server.kotlinserver.model.ResponseResult
import com.kotlin.server.kotlinserver.model.request.sm.CreateEmpTempTokenRequest
import com.kotlin.server.kotlinserver.model.request.sm.CreateEmpTokenRequest
import com.kotlin.server.kotlinserver.model.request.sm.CreatePartnerTempTokenRequest
import com.kotlin.server.kotlinserver.model.request.sm.CreateWorkerTempTokenRequest
import com.kotlin.server.kotlinserver.model.request.sm.LogoutRequest
import com.kotlin.server.kotlinserver.model.response.sm.EmpTokenCreateResponse
import com.kotlin.server.kotlinserver.model.response.sm.EmpTokenTempCreateResponse
import com.kotlin.server.kotlinserver.model.response.sm.OptCreateResponse
import com.kotlin.server.kotlinserver.model.response.sm.ProjectResponse
import com.kotlin.server.kotlinserver.model.response.sm.ProjectStageNoListResponse
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.OffsetDateTime

@RestController
@Tag(
    name = "SM API",
    description = "삼성 API 정보"
)
@RequestMapping("/cube_cca/v1")
class SMController {

    @Operation(
        summary = "임직원 임시 토큰 생성",
    )
    @PostMapping("/logins/employee/token/temp/create/item")
    fun createEmp(
        @RequestBody body : CreateEmpTempTokenRequest
    ) : ResponseEntity<ResponseResult<EmpTokenTempCreateResponse>> {
        return when( body.test ){
            1 -> ResponseEntity
                .status(HttpStatus.OK)
                .body(
                    ResponseResult(
                        "/cube_cca/v1/logins/employee/token/temp/create/item",
                        EmpTokenTempCreateResponse(
                            accTknVal = "asdfkljadlfkjasdklfjaslfkj",
                            succYn = "Y",
                            project = ProjectResponse(
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
                        ),
                        "SUCCESS",
                        "성공",
                        "2026-01-19T17: 23: 14.135+09:00"
                    )
                )
            2 -> ResponseEntity
                .status(HttpStatus.UNAUTHORIZED)
                .body(
                    ResponseResult(
                        "/cube_cca/v1/logins/employee/token/temp/create/item",
                        EmpTokenTempCreateResponse(
                            userId = "bk0228.choi@partner.samung.com",
                            userSecret = "@ch18401778",
                            userCelNo = "01064040054",
                        ),
                        "BAD_EMPLOYEE_INFO_ERROR",
                        "잘못된 정보입니다.",
                        "2026-01-19T17: 23: 14.135+09:00"
                    )
                )
            else -> ResponseEntity
                .status(HttpStatus.OK)
                .body(
                    ResponseResult(
                        "/cube_cca/v1/logins/employee/token/temp/create/item",
                        EmpTokenTempCreateResponse( null , null , null , null , null),
                        "BAD_EMPLOYEE_INFO_ERROR",
                        "입력하신 임직원 정보가 존재하지 않습니다.",
                        "2026-01-19T17: 23: 14.135+09:00"
                    )
                )
        }
    }

    @Operation(
        summary = "임직원 로그아웃",
    )
    @PostMapping("/logins/employee/token/remove/item")
    fun userLogout(
        @RequestBody body : LogoutRequest
    ) : ResponseEntity<ResponseResult<List<String>>> {
        return when( body.test ){
            1 -> ResponseEntity
                .status(HttpStatus.OK)
                .body(
                    ResponseResult(
                        "/cube_cca/v1/logins/employee/token/temp/create/item",
                        listOf(),
                        "SUCCESS",
                        "성공",
                        "2026-01-19T17: 23: 14.135+09:00"
                    )
                )
            2 -> ResponseEntity
                .status(HttpStatus.UNAUTHORIZED)
                .body(
                    ResponseResult(
                        "/cube_cca/v1/logins/employee/token/temp/create/item",
                        null,
                        "UNAUTHORIZED",
                        "다른기기에서 로그인되어 앱 사용이 종료됩니다.",
                        "2026-01-19T17: 23: 14.135+09:00",
                        errMsg = "다른기기에서 로그인되어 앱 사용이 종료됩니다.",
                    )
                )
            else -> ResponseEntity
                .status(HttpStatus.OK)
                .body(
                    ResponseResult(
                        "/cube_cca/v1/logins/employee/token/temp/create/item",
                        listOf(),
                        "FORBIDDEN",
                        "권한이 없습니다.",
                        "2026-01-19T17: 23: 14.135+09:00"
                    )
                )
        }
    }

    @Operation(
        summary = "임직원 토큰 생성",
    )
    @PostMapping("/logins/employee/token/create/item")
    fun createEmpTemp(
        @RequestBody body : CreateEmpTokenRequest
    ) : ResponseEntity<ResponseResult<EmpTokenCreateResponse>> {
        return when( body.test ){
            1 -> ResponseEntity
                .status(HttpStatus.OK)
                .body(
                    ResponseResult(
                        "/cube_cca/v1/logins/employee/token/temp/create/item",
                        EmpTokenCreateResponse(
                            accTknVal = "adlkfasdfasdfkjaslfk",
                            succYn = "Y",
                            staffType = "SITE_ADMIN",
                            userType = "GEC_EMPLOYEE",
                        ),
                        "SUCCESS",
                        "성공",
                        "2026-01-19T17: 23: 14.135+09:00"
                )
            )
            2 -> ResponseEntity
                .status(HttpStatus.UNAUTHORIZED)
                .body(
                    ResponseResult(
                        "/cube_cca/v1/logins/employee/token/temp/create/item",
                        null,
                        "UNAUTHORIZED",
                        "다른기기에서 로그인되어 앱 사용이 종료됩니다.",
                        "2026-01-19T17: 23: 14.135+09:00",
                        errMsg = "다른기기에서 로그인되어 앱 사용이 종료됩니다.",
                    )
                )
            else -> ResponseEntity
                .status(HttpStatus.UNAUTHORIZED)
                .body(
                    ResponseResult(
                        "/cube_cca/v1/logins/employee/token/temp/create/item",
                        EmpTokenCreateResponse( null , null , null , null ),
                        "UNAUTHORIZED",
                        "토큰권한이 없습니다.",
                        "2026-01-19T17: 23: 14.135+09:00"
                    )
                )
        }
    }

    @Operation(
        summary = "임직원 OPT 재발송",
        description = "직원 로그인 시 사용되는 일회용 인증번호(OTP)를 생성한다."
    )
    @PostMapping("/logins/employee/opt/create/item")
    fun optCreate() : ResponseResult<OptCreateResponse> {
        return ResponseResult(
            "/cube_cca/v1/logins/employee/token/temp/create/item",
            OptCreateResponse(
                succYn = "Y",
                userType = "GEC_EMPLOYEE",
            ),
            "SUCCESS",
            "성공",
            "2026-01-19T17: 23: 14.135+09:00"
        )
    }


    /*근로자 API */

    /*근로자*/
    @Operation(
        summary = "근로자 임시 토큰 생성",
    )
    @PostMapping("/logins/partner/token/temp/create/item/worker")
    fun createWorkerTemp(
        @RequestBody body : CreateWorkerTempTokenRequest
    ) : ResponseEntity<ResponseResult<EmpTokenTempCreateResponse>> {
        return when( body.userCelNo ){
            "01012345678" -> ResponseEntity
                .status(HttpStatus.OK)
                .body(
                    ResponseResult(
                        "/cube_cca/v1/logins/employee/token/temp/create/item",
                        EmpTokenTempCreateResponse(
                            accTknVal = "asdfkljadlfkjasdklfjaslfkj",
                            succYn = "Y",
                            project = ProjectResponse(
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
                                        nfcUseYn = "Y",
                                        nfcDwgFileId = "1231231-123123-1231-123123123",
                                        nfcCrdnFileId = "1231231-123123-1231-123123123",
                                    ),
                                    ProjectStageNoListResponse(
                                        pjtNo = "PC0008",
                                        pjtNm = "Bayer MMDI Project 1",
                                        pjtStgeNo = "PC00070001",
                                        pjtStgeNm = "Bayer MMDI Project 1",
                                        pjtStgeCd = "Ph2",
                                        pjtStgeBgnYmd = "202511120",
                                        pjtStgeEndYmd = "99990131",
                                        nfcUseYn = "Y",
                                        nfcDwgFileId = "1231231-123123-1231-123123123",
                                        nfcCrdnFileId = "1231231-123123-1231-123123123",
                                    ),
                                ),
                            ),
                        ),
                        "SUCCESS",
                        "성공",
                        "2026-01-19T17: 23: 14.135+09:00"
                    )
                )
            else -> ResponseEntity
                .status(HttpStatus.OK)
                .body(
                    ResponseResult(
                        "/cube_cca/v1/logins/employee/token/temp/create/item",
                        EmpTokenTempCreateResponse( null , null , null , null , null),
                        "BAD_EMPLOYEE_INFO_ERROR",
                        "입력하신 임직원 정보가 존재하지 않습니다.",
                        "2026-01-19T17: 23: 14.135+09:00"
                    )
                )
        }
    }


    @Operation(
        summary = "근로자 로그아웃",
    )
    @PostMapping("/logins/partner/token/remove/item")
    fun workerLogout(
        @RequestBody body : LogoutRequest
    ) : ResponseEntity<ResponseResult<List<String>>> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(
                ResponseResult(
                    "/cube_cca/v1/logins/employee/token/temp/create/item",
                    listOf(),
                    "SUCCESS",
                    "성공",
                    "2026-01-19T17: 23: 14.135+09:00"
                )
            )
    }


    @Operation(
        summary = "근로자 토큰 생성",
    )
    @PostMapping("/logins/partner/token/create/item/worker")
    fun createWorker(
        @RequestBody body : CreateEmpTokenRequest
    ) : ResponseEntity<ResponseResult<EmpTokenCreateResponse>> {
        return when( body.opt ){
            "123" -> ResponseEntity
                .status(HttpStatus.OK)
                .body(
                    ResponseResult(
                        "/cube_cca/v1/logins/employee/token/temp/create/item",
                        EmpTokenCreateResponse(
                            accTknVal = "adlkfasdfasdfkjaslfk",
                            succYn = "Y",
                            staffType = "PARTNER_WORKER",
                            userType = "PARTNER_WORKER",
                        ),
                        "SUCCESS",
                        "성공",
                        "2026-01-19T17: 23: 14.135+09:00"
                    )
                )
            else -> ResponseEntity
                .status(HttpStatus.UNAUTHORIZED)
                .body(
                    ResponseResult(
                        "/cube_cca/v1/logins/employee/token/temp/create/item",
                        EmpTokenCreateResponse( null , null , null , null ),
                        "UNAUTHORIZED",
                        "토큰권한이 없습니다.",
                        "2026-01-19T17: 23: 14.135+09:00"
                    )
                )
        }
    }


    @Operation(
        summary = "근로자 OPT 재발송",
        description = "직원 로그인 시 사용되는 일회용 인증번호(OTP)를 생성한다."
    )
    @PostMapping("/logins/partner/opt/create/item")
    fun optWorkerCreate() : ResponseResult<OptCreateResponse> {
        return ResponseResult(
            "/cube_cca/v1/logins/employee/token/temp/create/item",
            OptCreateResponse(
                succYn = "Y",
                userType = "TOKEN_CREATE_USER",
            ),
            "SUCCESS",
            "성공",
            "2026-01-19T17: 23: 14.135+09:00"
        )
    }

}