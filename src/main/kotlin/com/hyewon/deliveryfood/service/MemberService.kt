package com.hyewon.deliveryfood.service

import com.hyewon.deliveryfood.vo.Member

interface MemberService {

    fun selectUser(MEM_ID : String, MEM_PW : String) : Member
}