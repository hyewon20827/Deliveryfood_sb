package com.hyewon.deliveryfood.controller

import com.hyewon.deliveryfood.service.MemberService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import javax.websocket.server.PathParam

@RestController
@RequestMapping("")
class MemberController {

    @Autowired(required = true)
    private lateinit var memberService : MemberService

    @PostMapping("users/{user}/repos")
    fun selectUser(@RequestBody @PathParam("user") MEM_ID : String, @RequestBody MEM_PW : String) = memberService.selectUser(MEM_ID, MEM_PW)

    @GetMapping()
    fun helloWorld() = "Hello World!"
}