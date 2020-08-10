package com.anncode.offersandcoupons.view

import com.anncode.offersandcoupons.model.Coupon

interface CouponView{
    fun getCoupon()
    fun showCoupon(coupons: ArrayList<Coupon>?)

}