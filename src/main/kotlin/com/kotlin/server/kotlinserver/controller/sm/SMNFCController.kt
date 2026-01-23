package com.kotlin.server.kotlinserver.controller.sm

import com.kotlin.server.kotlinserver.model.ResponseResult
import com.kotlin.server.kotlinserver.model.request.sm.CreateEmpTempTokenRequest
import com.kotlin.server.kotlinserver.model.request.sm.CreateEmpTokenRequest
import com.kotlin.server.kotlinserver.model.request.sm.CreatePartnerTempTokenRequest
import com.kotlin.server.kotlinserver.model.request.sm.CreateWorkerTempTokenRequest
import com.kotlin.server.kotlinserver.model.request.sm.LogoutRequest
import com.kotlin.server.kotlinserver.model.request.smnfc.AppVersionRequest
import com.kotlin.server.kotlinserver.model.request.smnfc.NfcAccessLogListRequest
import com.kotlin.server.kotlinserver.model.request.smnfc.NfcZoneRelatedCardRequest
import com.kotlin.server.kotlinserver.model.request.smnfc.ZoneAccessLogRequest
import com.kotlin.server.kotlinserver.model.request.smnfc.ZoneListRequest
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
    name = "SM NFC API",
    description = "삼성 API 정보"
)
@RequestMapping("/cube_cca/v1")
class SMNFCController {

    @Operation(
        summary = "구역정보 조회",
    )
    @PostMapping("/nfc/mobile/selectZoneList")
    fun zoneList(
        @RequestBody body : ZoneListRequest
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
        summary = "NFC 프로젝트 조회",
    )
    @PostMapping("/nfc/mobile/selectNfcProjectList")
    fun nfcProjectList(
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
        summary = "NFC 출입 기록 조회 ",
    )
    @PostMapping("/nfc/mobile/selectNfcAccessLogList")
    fun accessLogList(
        @RequestBody body : NfcAccessLogListRequest
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
        summary = "앱 버전 조회",
    )
    @PostMapping("/nfc/mobile/selectAppVersion")
    fun appVersion(
        @RequestBody body : AppVersionRequest
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
        summary = "NFC구역 카드 연예 정보 등록",
    )
    @PostMapping("/nfc/mobile/insertNfcZoneRelatedCard")
    fun zoneRelatedCard(
        @RequestBody body : NfcZoneRelatedCardRequest
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
        summary = "NFC 출입 로그 등록",
    )
    @PostMapping("/nfc/mobile/insertAccessLog")
    fun zoneAccessLog(
        @RequestBody body : ZoneAccessLogRequest
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

}