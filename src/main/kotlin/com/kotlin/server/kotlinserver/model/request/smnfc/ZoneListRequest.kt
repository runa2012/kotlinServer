package com.kotlin.server.kotlinserver.model.request.smnfc

import io.swagger.v3.oas.annotations.media.Schema
import org.springframework.web.bind.annotation.RequestParam

data class ZoneListRequest(
    @Schema(description = "프로젝트 단계 번호", example = "SECLP00002")
    @RequestParam val pjtStgeNo : String,
    @Schema(description = "사용중인 구역정보 중 카드 번호가 할당되지 않은 데이터만 조회할지 여부", example = "N")
    @RequestParam val emptyYn : String,
)