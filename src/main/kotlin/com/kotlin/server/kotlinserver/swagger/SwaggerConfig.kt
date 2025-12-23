package com.kotlin.server.kotlinserver.swagger

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import org.springframework.context.annotation.Configuration

@OpenAPIDefinition(
    info = Info(
        title = "Kotlin Server API",
        version = "1.0.0",
        description = "하드코딩 Kotlin 서버 Swagger 예제"
    )
)
@Configuration
class SwaggerConfig {
}