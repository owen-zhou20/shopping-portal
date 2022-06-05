package com.sv.mall.member.feign;

import com.sv.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * this is a request declaration from internet (remote call)
 */
@FeignClient("mall-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/memeber/list")
    public R membercoupons();
}
