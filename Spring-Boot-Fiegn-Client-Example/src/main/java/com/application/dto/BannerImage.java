package com.application.dto;

public class BannerImage {
	private int id;
	private String bannerImageName;
	private String bannerImageUrl;
	private boolean active;
	private String startDisplayDate;
	private String stopDisplayDate;
	private String uploadedDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBannerImageName() {
		return bannerImageName;
	}

	public void setBannerImageName(String bannerImageName) {
		this.bannerImageName = bannerImageName;
	}

	public String getBannerImageUrl() {
		return bannerImageUrl;
	}

	public void setBannerImageUrl(String bannerImageUrl) {
		this.bannerImageUrl = bannerImageUrl;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getStartDisplayDate() {
		return startDisplayDate;
	}

	public void setStartDisplayDate(String startDisplayDate) {
		this.startDisplayDate = startDisplayDate;
	}

	public String getStopDisplayDate() {
		return stopDisplayDate;
	}

	public void setStopDisplayDate(String stopDisplayDate) {
		this.stopDisplayDate = stopDisplayDate;
	}

	public String getUploadedDate() {
		return uploadedDate;
	}

	public void setUploadedDate(String uploadedDate) {
		this.uploadedDate = uploadedDate;
	}

}
