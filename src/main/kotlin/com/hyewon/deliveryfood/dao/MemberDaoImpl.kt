package com.hyewon.deliveryfood.dao

import com.hyewon.deliveryfood.mapper.MemberMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class MemberDaoImpl : MemberDao {

    @Autowired(required = true)
    private lateinit var mapper : MemberMapper

    override fun selectUser(MEM_ID : String, MEM_PW : String) = mapper.selectUser(MEM_ID, MEM_PW)
}