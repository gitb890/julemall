package com.junjie.jule.coupon.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("jule-member")
public interface MemberFeignService {
}
