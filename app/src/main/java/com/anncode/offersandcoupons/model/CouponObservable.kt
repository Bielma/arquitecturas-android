package com.anncode.offersandcoupons.model

import androidx.databinding.BaseObservable
import androidx.lifecycle.MutableLiveData

class CouponObservable: BaseObservable() {
    //Conexion directa con el repositirio

    private var couponRepository: CouponRepository = CouponRepositoryImpl()

    fun callCoupons(){
        couponRepository.callCouponsAPI()
    }
    //ViewModel
    fun getCoupons(): MutableLiveData<List<Coupon>>{
        return couponRepository.getCouponsAPI()
    }

}