package com.hyewon.deliveryfood.service

import com.hyewon.deliveryfood.dao.MemberDao
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service

@Service
@Repository
class MemberServiceImpl : MemberService {

    @Autowired(required = true)
    private lateinit var memberDao : MemberDao

    override fun selectUser(MEM_ID : String, MEM_PW : String) = memberDao.selectUser(MEM_ID, MEM_PW)
}