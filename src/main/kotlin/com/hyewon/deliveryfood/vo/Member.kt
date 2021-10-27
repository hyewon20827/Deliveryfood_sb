package com.hyewon.deliveryfood.vo

data class Member(val MEM_ID : String, var GRADE_NO : Int = 1, var MEM_PW : String, val MEM_EMAIL : String
                  , val MEM_PHONE : String, val MEM_BIRTH : String, val MEM_GENDER : String, val MEM_RECOMMAND_PATH : String
                  , var MEM_POINT : Int = 0)
