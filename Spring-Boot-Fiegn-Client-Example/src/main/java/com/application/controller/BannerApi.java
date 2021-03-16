package com.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.dto.ReadableBanners;
import com.application.services.BannerService;

@RestController
@RequestMapping("/api")
public class BannerApi {
	
	@Autowired
	private BannerService bannerService;
	
	@GetMapping(path = "/banners")
	public ReadableBanners getAllBanners() {
		return bannerService.getAllBanners();
	}

}
