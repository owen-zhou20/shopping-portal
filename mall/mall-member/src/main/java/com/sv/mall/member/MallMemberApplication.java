package com.sv.mall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 1, The steps to call other service from internet.
 * 		1), Import open-feign.--import open-feign dependency
 * 		2), Code a API, let SpringCloud know this API needs to call service from internet.
 * 		-- write a interface in feign folder and user @FeignClient("mall-coupon") in this API
 * 			1, In this API, declare every method that this method will call which request in other service.
 * 			--Copy the full method address to API
 * 		3), Open this call other service from internet function.  --@EnableFeignClients
 *
 */
@EnableFeignClients(basePackages = "com.sv.mall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class MallMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallMemberApplication.class, args);
	}

}
