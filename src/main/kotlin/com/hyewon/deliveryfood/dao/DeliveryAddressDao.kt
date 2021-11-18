package com.hyewon.deliveryfood.dao

import com.hyewon.deliveryfood.vo.Delivery_Address

interface DeliveryAddressDao {

    fun selectDeliveryAddress(MEM_ID : String) : List<Delivery_Address>

    fun changeDefaultAddress(MEM_ID : String, DELIVERY_ADDRESS_MAIN_ADDRESS : String) : Int

    fun updateDefaultAddress(MEM_ID: String) : Int
}