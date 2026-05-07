package com.kotlin.server.kotlinserver.controller

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.core.io.FileSystemResource
import org.springframework.core.io.Resource
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.nio.file.Paths

@RestController
@Tag(name = "Download API", description = "파일 다운로드")
@RequestMapping("/download")
class DownloadController {

    private val assetsPath = Paths.get("src/assets").toAbsolutePath()

    @GetMapping("/{fileName}")
    @Operation(summary = "assets 폴더 파일 다운로드")
    fun download(@PathVariable fileName: String): ResponseEntity<Resource> {
        val file = assetsPath.resolve(fileName).toFile()

        if (!file.exists() || !file.canonicalPath.startsWith(assetsPath.toFile().canonicalPath)) {
            return ResponseEntity.notFound().build()
        }

        val resource = FileSystemResource(file)
        return ResponseEntity.ok()
            .contentType(MediaType.APPLICATION_OCTET_STREAM)
            .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"${file.name}\"")
            .contentLength(file.length())
            .body(resource)
    }
}
