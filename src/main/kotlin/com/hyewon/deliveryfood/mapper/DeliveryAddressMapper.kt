package com.hyewon.deliveryfood.mapper

import com.hyewon.deliveryfood.vo.Delivery_Address
import com.hyewon.deliveryfood.vo.Member
import org.apache.ibatis.annotations.Mapper
import org.springframework.stereotype.Repository

@Mapper
@Repository
interface DeliveryAddressMapper {

    fun selectDeliveryAddress(MEM_ID: String): List<Delivery_Address>

    fun changeDefaultAddress(MEM_ID : String, DELIVERY_ADDRESS_MAIN_ADDRESS : String) : Int

    fun updateDefaultAddress(MEM_ID : String) : Int
}