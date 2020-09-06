package com.anncode.offersandcoupons.model

import androidx.databinding.BaseObservable

class CouponObservable: BaseObservable() {
    //Conexion directa con el repositirio

    private var couponRepository: CouponRepository = CouponRepositoryImpl()

    fun callCoupons(){
        couponRepository.callCouponsAPI()
    }
    //VM

}