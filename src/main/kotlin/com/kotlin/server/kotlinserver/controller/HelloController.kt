package com.kotlin.server.kotlinserver.controller

import com.kotlin.server.kotlinserver.model.LoginRequest
import com.kotlin.server.kotlinserver.model.User
import com.kotlin.server.kotlinserver.model.ResponseResult
import io.swagger.v3.oas.annotations.media.Schema
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/auth")
class HelloController {

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