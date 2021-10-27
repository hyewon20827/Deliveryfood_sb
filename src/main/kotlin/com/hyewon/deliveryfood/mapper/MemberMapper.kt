package com.hyewon.deliveryfood.mapper

import com.hyewon.deliveryfood.vo.Member
import org.apache.ibatis.annotations.Mapper
import org.springframework.stereotype.Repository

@Mapper
@Repository
interface MemberMapper {

    fun selectUser(MEM_ID: String, MEM_PW: String): Member
}