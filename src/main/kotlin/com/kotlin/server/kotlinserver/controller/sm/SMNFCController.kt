package com.kotlin.server.kotlinserver.controller.sm

import com.kotlin.server.kotlinserver.model.ResponseResult
import com.kotlin.server.kotlinserver.model.request.sm.CreateEmpTempTokenRequest
import com.kotlin.server.kotlinserver.model.request.sm.CreateEmpTokenRequest
import com.kotlin.server.kotlinserver.model.request.sm.CreatePartnerTempTokenRequest
import com.kotlin.server.kotlinserver.model.request.sm.CreateWorkerTempTokenRequest
import com.kotlin.server.kotlinserver.model.request.sm.LogoutRequest
import com.kotlin.server.kotlinserver.model.request.sm.SelectWorkerInfoRequest
import com.kotlin.server.kotlinserver.model.request.smnfc.AppVersionRequest
import com.kotlin.server.kotlinserver.model.request.smnfc.NfcAccessLogListRequest
import com.kotlin.server.kotlinserver.model.request.smnfc.NfcZoneRelatedCardRequest
import com.kotlin.server.kotlinserver.model.request.smnfc.VendorListRequest
import com.kotlin.server.kotlinserver.model.request.smnfc.ZoneAccessLogRequest
import com.kotlin.server.kotlinserver.model.request.smnfc.ZoneListRequest
import com.kotlin.server.kotlinserver.model.response.sm.AccessLogResponse
import com.kotlin.server.kotlinserver.model.response.sm.EmpTokenCreateResponse
import com.kotlin.server.kotlinserver.model.response.sm.EmpTokenTempCreateResponse
import com.kotlin.server.kotlinserver.model.response.sm.LogListResponse
import com.kotlin.server.kotlinserver.model.response.sm.OptCreateResponse
import com.kotlin.server.kotlinserver.model.response.sm.ProjectResponse
import com.kotlin.server.kotlinserver.model.response.sm.ProjectStageNoListResponse
import com.kotlin.server.kotlinserver.model.response.sm.SelectZoneResponse
import com.kotlin.server.kotlinserver.model.response.sm.UserInfoResponse
import com.kotlin.server.kotlinserver.model.response.sm.VendorListResponse
import com.kotlin.server.kotlinserver.model.response.sm.VersionResponse
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
    ) : ResponseEntity<ResponseResult<List<SelectZoneResponse>>> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(
                ResponseResult(
                    "/cube_cca/v1/logins/employee/token/temp/create/item",
                    listOf(
                        SelectZoneResponse(
                            "SECLP00002",
                            73,
                            pjtStgeNm = "GEC 2층 회의실 조성공사",
                            lbatZoneNm = "서2",
                            inCard = "5",
                            outCard = "6",
                            lbatUseYn = "Y",
                            fstRgtrUsrNo = "BU008",
                            fnlUpdDtms = "2025-11-25 17:24:22.091+09"
                        ),
                        SelectZoneResponse(
                            "SECLP00002",
                            73,
                            pjtStgeNm = "GEC 2층 회의실 조성공사",
                            lbatZoneNm = "서6",
                            inCard = "5",
                            outCard = "6",
                            lbatUseYn = "Y",
                            fstRgtrUsrNo = "BU008",
                            fnlUpdDtms = "2025-11-25 17:24:22.091+09"
                        )
                    ),
                    "SUCCESS",
                    "성공",
                    "2026-01-19T17: 23: 14.135+09:00"
                )
            )
    }

    @Operation(
        summary = "휴대폰 번호로 근로자 정보 조회",
    )
    @PostMapping("/nfc/mobile/selectWorkerByMobileNo")
    fun selectWorkerByMobileNo(
        @RequestBody body : SelectWorkerInfoRequest
    ) : ResponseEntity<ResponseResult<List<UserInfoResponse>>> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(
                ResponseResult(
                    "/cube_cca/v1/logins/employee/token/temp/create/item",
                    listOf(
                        UserInfoResponse(
                            pjtStgeNm = "PC00081",
                            pjtStgeNo = "삼성 E&A 프로젝트2",
                            vendNm = "삼성 E&A",
                            wrkrNm = "홍*동",
                            ocpNm = "[관리자(공통)]관리",
                            stdDsplNm = "목수",
                            lbatMnpwId = 111,
                            photoFileId = "adlfka-asdfa-sdf-dfa",
                            dtb = "1999**11",
                            gndrCd = "M"
                        ),
                        UserInfoResponse(
                            pjtStgeNm = "PC00081",
                            pjtStgeNo = "(P3/복함동-PH1)두올테크",
                            vendNm = "(P3/복함동-PH1)두올테크",
                            wrkrNm = "홍*동",
                            ocpNm = "현장소장",
                            stdDsplNm = "목수",
                            lbatMnpwId = 111,
                            photoFileId = "adlfka-asdfa-sdf-dfa",
                            dtb = "1999**11",
                            gndrCd = "M"
                        ),
                        UserInfoResponse(
                            pjtStgeNm = "PC0008",
                            pjtStgeNo = "삼성 E&A 프로젝트",
                            vendNm = "삼성 SDS",
                            wrkrNm = "홍*동",
                            ocpNm = "현장소장",
                            stdDsplNm = "목수",
                            lbatMnpwId = 11,
                            photoFileId = "adlfka-asdfa-sdf-dfa",
                            dtb = "1999**11",
                            gndrCd = "M"
                        ),
                    ),
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
    ) : ResponseEntity<ResponseResult<List<ProjectResponse>>> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(
                ResponseResult(
                    "/cube_cca/v1/logins/employee/token/temp/create/item",
                    listOf(
                        ProjectResponse(
                            pjtNo = "SE7009",
                            pjtStgeNo = "SE8901231231",
                            pjtStgeCd = "에스텍 공용11",
                            pjtStgeNm = "P4 FAB",
                            pjtStgeBgnYmd = "20251201",
                            pjtStgeEndYmd = "20271231"
                        ),
                        ProjectResponse(
                            pjtNo = "SE7009",
                            pjtStgeNo = "SE8901231231",
                            pjtStgeCd = "대기방지",
                            pjtStgeNm = "P4 FAB",
                            pjtStgeBgnYmd = "20251201",
                            pjtStgeEndYmd = "20271231"
                        )
                    ),
                    "SUCCESS",
                    "성공",
                    "2026-01-19T17: 23: 14.135+09:00"
                )
            )
    }

    @Operation(
        summary = "NFC 출입 기록 조회 ",
    )
    @PostMapping("/nfc/mobile/selectAccessStatusList")
    fun accessLogList(
        @RequestBody body : NfcAccessLogListRequest
    ) : ResponseEntity<ResponseResult<List<LogListResponse>>> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(
                ResponseResult(
                    "/cube_cca/v1/logins/employee/token/temp/create/item",
                    listOf(
                        LogListResponse(
                            lbatMnpwId = 123123,
                            wrkrNm = "고*남",
                            dtb = "1777**03",
                            vendNm = "Samsung E&A Co.Ltd",
                            pjtStgeNm = "유티동-SECLP00002",
                            lbatYmd = "20271231",
                            attnDtm = "20260122090909",
                            lvffcDtm = "20260122160909",
                            ocpNm = "보통안부",
                            stdDsplNm = "인프라",
                            empTpCd = "관리자"
                        ),
                        LogListResponse(
                            lbatMnpwId = 123123,
                            wrkrNm = "고*남",
                            dtb = "1777**03",
                            vendNm = "Samsung E&A Co.Ltd",
                            pjtStgeNm = "유티동-SECLP00002",
                            lbatYmd = "20271231",
                            attnDtm = "20260122090909",
                            lvffcDtm = "20260123090909",
                            ocpNm = "안전감시단",
                            stdDsplNm = "안전",
                            empTpCd = "기술인"
                        )
                    ),
                    "SUCCESS",
                    "성공",
                    "2026-01-19T17: 23: 14.135+09:00"
                )
            )
    }

    @Operation(
        summary = "업체 목록 조회",
    )
    @PostMapping("/nfc/mobile/selectVendorList")
    fun currentZoneInfo(
        @RequestBody body : VendorListRequest
    ) : ResponseEntity<ResponseResult<List<VendorListResponse>>> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(
                ResponseResult(
                    "/cube_cca/v1/logins/employee/token/temp/create/item",
                    listOf(
                        VendorListResponse (
                            vendCd = "x10000",
                            vendNm = "삼성 E&A Co.Ltd"
                        ),
                        VendorListResponse (
                            vendCd = "x20000",
                            vendNm = "삼성 SDS Co.Ltd"
                        )
                    ),
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
    ) : ResponseEntity<ResponseResult<VersionResponse>> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(
                ResponseResult(
                    "/cube_cca/v1/logins/employee/token/temp/create/item",
                    VersionResponse(
                        mbpnApsVerNo = "1.0.0",
                        mbpnOsNm = "ANDROID",
                        mbpnTpNm = "PHONE",
                        mbpnMdelNm = "M12345"
                    ),
                    "SUCCESS",
                    "성공",
                    "2026-01-19T17: 23: 14.135+09:00"
                )
            )
    }

    @Operation(
        summary = "NFC구역 카드 연계 정보 등록",
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

    //리턴 값 필요
    @Operation(
        summary = "NFC 출입 로그 등록",
    )
    @PostMapping("/nfc/mobile/insertAccessLog")
    fun zoneAccessLog(
        @RequestBody body : ZoneAccessLogRequest
    ) : ResponseEntity<ResponseResult<AccessLogResponse>> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(
                ResponseResult(
                    "/cube_cca/v1/logins/employee/token/temp/create/item",
                    AccessLogResponse(
                        lbatSctNm = "I",
                        lbatZoneNm = "S-1",
                        lbatTagDtms = "20250901150000"
                    ),
                    "SUCCESS",
                    "성공",
                    "2026-01-19T17: 23: 14.135+09:00"
                )
            )
    }

    @Operation(
        summary = "NFC 출입 로그 등록 MDM",
    )
    @PostMapping("/nfc/mobile/insertAccessLogForMDM")
    fun zoneAccessLogMDM(
        @RequestBody body : ZoneAccessLogRequest
    ) : ResponseEntity<ResponseResult<AccessLogResponse>> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(
                ResponseResult(
                    "/cube_cca/v1/logins/employee/token/temp/create/item",
                    AccessLogResponse(
                        lbatSctNm = "O",
                        lbatZoneNm = "서2",
                        lbatTagDtms = "20250901150000"
                    ),
                    "SUCCESS",
                    "성공",
                    "2026-01-19T17: 23: 14.135+09:00"
                )
            )
    }

}