package com.hyewon.deliveryfood.vo

import org.springframework.lang.Nullable

data class KakaoAPI(val zonecode : Int = 0, val address : String = "", val addressEnglish : String = "", val addressType : String = "",
                    val userSelectedType : String = "", val noSelected : String = "", val userLanguageType : String = "",
                    val roadAddress : String = "", val roadAddressEnglish : String = "", val jibunAddress : String = "",
                    val autoRoadAddress : String = "", val autoRoadAddressEnglish : String = "", val autoJibunAddress : String = "",
                    val autoJibunAddressEnglish : String = "", val buildingCode : String = "", val buildingName : String = "",
                    val apartment : String = "", val sido : String = "", val sidoEnglish : String = "", val sigungu : String = "",
                    val sigunguEnglish : String = "", val sigunguCode : String = "", val roadnameCode : String = "", val bcode : String = "",
                    val roadname : String = "", val roadnameEnglish : String = "", val bname : String = "",
                    val bnameEnglish : String = "", @Nullable val bname1 : String = "", @Nullable val bname1English : String = "",
                    val bname2 : String = "", val bname2English : String = "", val query : String = "")