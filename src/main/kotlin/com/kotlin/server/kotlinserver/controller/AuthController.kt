package com.kotlin.server.kotlinserver.controller

import com.kotlin.server.kotlinserver.model.request.LoginRequest
import com.kotlin.server.kotlinserver.model.response.User
import com.kotlin.server.kotlinserver.model.ResponseResult
import com.kotlin.server.kotlinserver.model.request.AuthCodeRequest
import com.kotlin.server.kotlinserver.model.response.AuthCode
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@Tag(
    name = "Auth API",
    description = "사용자 인증 및 로그인 관련 API"
)
@RequestMapping("/auth")
class AuthController {

    @Schema(description = "사용자 로그인")
    @PostMapping("/login")
    fun postUserLogin(
        @RequestBody request: LoginRequest

    ): ResponseResult<User> {
        return ResponseResult(
            true,
            User(1, "alic", 25),
            200,
            ""
        )
    }


    @Schema(description = "인증번호 요청")
    @PostMapping("/code")
    fun postAuthCode(
        @RequestBody request: AuthCodeRequest
    ): ResponseResult<AuthCode> {
        return ResponseResult(
            true,
            AuthCode(123456),
            200,
            ""
        )
    }


    @GetMapping("/{id}")
    fun getUser( @PathVariable id : Long ) : User? {
        return when( id ){
            1L -> User(1, "alic", 25)
            2L -> User(2, "test", 21)
            3L -> User(3, "chilaa", 23)
            else -> null
        }

    }

}