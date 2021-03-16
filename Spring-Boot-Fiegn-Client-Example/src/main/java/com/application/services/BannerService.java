package com.application.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.application.dto.ReadableBanners;

//@Service
@FeignClient(url = "http://104.237.9.45:32122", value = "bannersHolder")
public interface BannerService {

	@GetMapping(path = "/api/v1/banners/images", headers = "X-API-VERSION=v1")
	public ReadableBanners getAllBanners();

}
