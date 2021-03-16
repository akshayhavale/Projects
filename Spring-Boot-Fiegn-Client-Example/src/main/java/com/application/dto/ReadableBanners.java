package com.application.dto;

import java.util.List;

public class ReadableBanners {
	private int totalBannersCount;
	private List<Banner> banners;

	public int getTotalBannersCount() {
		return totalBannersCount;
	}

	public void setTotalBannersCount(int totalBannersCount) {
		this.totalBannersCount = totalBannersCount;
	}

	public List<Banner> getBanners() {
		return banners;
	}

	public void setBanners(List<Banner> banners) {
		this.banners = banners;
	}

}
