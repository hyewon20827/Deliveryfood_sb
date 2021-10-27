package com.hyewon.deliveryfood.dao

import com.hyewon.deliveryfood.vo.Member

interface MemberDao {

    fun selectUser(MEM_ID : String, MEM_PW : String) : Member
}