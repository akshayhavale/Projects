package com.application.dto;

import java.util.List;

public class Banner {
	private int totalCount;
	private int activeImagesCount;
	private int id;
	private String bannerName;
	private List<BannerImage> bannerImages;

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getActiveImagesCount() {
		return activeImagesCount;
	}

	public void setActiveImagesCount(int activeImagesCount) {
		this.activeImagesCount = activeImagesCount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBannerName() {
		return bannerName;
	}

	public void setBannerName(String bannerName) {
		this.bannerName = bannerName;
	}

	public List<BannerImage> getBannerImages() {
		return bannerImages;
	}

	public void setBannerImages(List<BannerImage> bannerImages) {
		this.bannerImages = bannerImages;
	}

}