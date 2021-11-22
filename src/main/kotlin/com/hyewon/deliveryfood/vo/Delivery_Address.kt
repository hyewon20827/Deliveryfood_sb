package com.hyewon.deliveryfood.vo

import org.springframework.lang.Nullable

data class Delivery_Address(@Nullable val MEM_ID : String = "", @Nullable val DELIVERY_ADDRESS_MAIN_ADDRESS : String = "",
                       @Nullable val DELIVERY_ADDRESS_SUB_ADDRESS : String = "", @Nullable val DELIVERY_ADDRESS_SENDING_MESSAGE_TIME : Int? = 1,
                       @Nullable val DELIVERY_ADDRESS_NOT_RELEASING_ACTION : Int? = 1, @Nullable val SENDING_PERSON_NAME : String? = "",
                       @Nullable val SENDING_PHONE_NUMBER : String? = "", @Nullable val DEFAULT_ADDRESS : Boolean? = false, @Nullable val SELECTED_ADDRESS : Boolean? = false,
                       @Nullable val DELIVERY_TYPE : String? = "")