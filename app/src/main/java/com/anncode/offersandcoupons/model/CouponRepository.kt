package com.anncode.offersandcoupons.model

import androidx.lifecycle.MutableLiveData

interface CouponRepository {

    fun getCouponsAPI(): MutableLiveData<List<Coupon>>
    fun callCouponsAPI()
}