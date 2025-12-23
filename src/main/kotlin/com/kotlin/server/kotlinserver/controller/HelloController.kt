package com.kotlin.server.kotlinserver.controller

import com.kotlin.server.kotlinserver.model.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/auth")
class HelloController {

    @GetMapping("/login")
    fun hello(): User {
        return User(1, "sejun", 25)
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