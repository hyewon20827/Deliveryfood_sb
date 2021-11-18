package com.hyewon.deliveryfood.controller

import com.hyewon.deliveryfood.service.DeliveryAddressService
import com.hyewon.deliveryfood.vo.Delivery_Address
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user/*")
class DeliveryAddressController {

    @Autowired
    private lateinit var deliveryAddressService : DeliveryAddressService

    @GetMapping("/address")
    fun selectDeliveryAddress(@RequestParam("MEM_ID") MEM_ID : String) = deliveryAddressService.selectDeliveryAddress(MEM_ID)

    @PutMapping("/address/{MEM_ID}")
    fun changeDefaultAddress(@PathVariable("MEM_ID") MEM_ID : String, @RequestBody DELIVERY_ADDRESS_MAIN_ADDRESS : String)
        = if(deliveryAddressService.updateDefaultAddress(MEM_ID) > -1) deliveryAddressService.changeDefaultAddress(MEM_ID, DELIVERY_ADDRESS_MAIN_ADDRESS) else -1
}