package com.kotlin.server.kotlinserver.controller

import com.kotlin.server.kotlinserver.model.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/users")
class UserController {

    @GetMapping
    fun getUsers(): List<User> {
        return listOf(
            User(1, "alic", 25),
            User(2, "test", 21),
            User(3, "chilaa", 23)
        )
    }

}