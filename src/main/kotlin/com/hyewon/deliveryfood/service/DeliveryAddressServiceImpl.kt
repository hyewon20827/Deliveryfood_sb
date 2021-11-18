package com.hyewon.deliveryfood.service

import com.hyewon.deliveryfood.dao.DeliveryAddressDao
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service

@Service
@Repository
class DeliveryAddressServiceImpl : DeliveryAddressService {

    @Autowired
    private lateinit var deliveryAddressDao : DeliveryAddressDao

    override fun selectDeliveryAddress(MEM_ID: String) = deliveryAddressDao.selectDeliveryAddress(MEM_ID)

    override fun changeDefaultAddress(MEM_ID: String, DELIVERY_ADDRESS_MAIN_ADDRESS : String) = deliveryAddressDao.changeDefaultAddress(MEM_ID, DELIVERY_ADDRESS_MAIN_ADDRESS)

    override fun updateDefaultAddress(MEM_ID: String) = deliveryAddressDao.updateDefaultAddress(MEM_ID)
}