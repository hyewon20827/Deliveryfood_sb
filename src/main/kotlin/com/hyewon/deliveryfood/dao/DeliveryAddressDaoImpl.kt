package com.hyewon.deliveryfood.dao

import com.hyewon.deliveryfood.mapper.DeliveryAddressMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
class DeliveryAddressDaoImpl : DeliveryAddressDao {

    @Autowired(required = true)
    private lateinit var mapper : DeliveryAddressMapper

    override fun selectDeliveryAddress(MEM_ID: String) = mapper.selectDeliveryAddress(MEM_ID)

    override fun changeDefaultAddress(MEM_ID : String, DELIVERY_ADDRESS_MAIN_ADDRESS : String) = mapper.changeDefaultAddress(MEM_ID, DELIVERY_ADDRESS_MAIN_ADDRESS)

    override fun updateDefaultAddress(MEM_ID: String) = mapper.updateDefaultAddress(MEM_ID)
}