package com.hyewon.deliveryfood.controller

import com.hyewon.deliveryfood.service.TestService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("")
class TestController {

    @Autowired(required = true)
    private lateinit var testService : TestService

    @GetMapping("/")
    fun test() = "Hello World!"
}