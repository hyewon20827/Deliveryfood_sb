package com.hyewon.deliveryfood

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Configuration

@Configuration
@SpringBootApplication
@MapperScan(basePackages = arrayOf("com.hyewon.deliveryfood.mapper"))
class DeliveryfoodApplication

fun main(args: Array<String>) {
    runApplication<DeliveryfoodApplication>(*args)
}
