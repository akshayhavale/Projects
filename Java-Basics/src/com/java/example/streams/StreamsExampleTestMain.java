package com.java.example.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsExampleTestMain {

	private List<Image> images = Arrays.asList(new Image(true), new Image(true), new Image(false));

	public List<Image> getImages() {
		return images;
	}

	public static void main(String[] args) {
		StreamsExampleTestMain exampleTestMain = new StreamsExampleTestMain();
		List<Image> pimages= exampleTestMain.getImages();
		System.out.println("totalCount = " + pimages.size());
		
		System.out.println("totalActiveCount = "+ getActiveCount(pimages));

	}

	private static int getActiveCount(List<Image> images) {
		boolean flag = true;
		long count = images.stream().map(mapper->mapper.isActive()).filter(value->value.toString().equalsIgnoreCase("true")).count();
		return (int)count;
	}

	class Image {
		private boolean active;

		public Image(boolean active) {
			super();
			this.active = active;
		}

		public boolean isActive() {
			return active;
		}

		public void setActive(boolean active) {
			this.active = active;
		}

	}

}
