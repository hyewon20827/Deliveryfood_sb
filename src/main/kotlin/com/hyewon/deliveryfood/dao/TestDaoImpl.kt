package com.hyewon.deliveryfood.dao

import com.hyewon.deliveryfood.mapper.TestMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class TestDaoImpl : TestDao{

    @Autowired(required = true)
    private lateinit var mapper : TestMapper
}