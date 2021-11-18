package com.hyewon.deliveryfood.controller

import com.hyewon.deliveryfood.service.MemberService
import com.hyewon.deliveryfood.vo.Member
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import javax.websocket.server.PathParam

@RestController
@RequestMapping("/login")
class MemberController {

    @Autowired(required = true)
    private lateinit var memberService : MemberService

    @PostMapping("/repos")
    fun selectUser(@RequestParam("MEM_ID") MEM_ID : String, @RequestParam("MEM_PW") MEM_PW : String) = memberService.selectUser(MEM_ID, MEM_PW)

    @GetMapping()
    fun helloWorld() = "Hello World!"
}