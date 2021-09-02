package com.hyewon.deliveryfood.service

import com.hyewon.deliveryfood.dao.TestDao
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service

@Service
@Repository
class TestServiceImpl : TestService {

    @Autowired(required = true)
    private lateinit var testDao : TestDao
}