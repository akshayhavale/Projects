package com.application.controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.google.cloud.ReadChannel;
import com.google.cloud.storage.Blob;
import com.google.cloud.storage.BlobId;
import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Storage;

@RestController
public class FileUploadApi {

	@Autowired
	private Storage storage;

	@Value("&{file.location}")
	private Resource fileLocation;

	@GetMapping("/writeFile")
	public String writeToBucket(@RequestParam MultipartFile file) throws IOException {
		InputStream in = file.getInputStream();

		BlobId blobId = BlobId.of("ywc_banners", "test/Puma_black_sneakers.jpg");
		BlobInfo blobInfo = BlobInfo.newBuilder(blobId).setContentType("image/jpeg").build();

		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		byte[] buffer = new byte[1024];
		int len;
		while ((len = in.read(buffer)) > -1) {
			baos.write(buffer, 0, len);
		}
		baos.flush();
		
		InputStream is1 = new ByteArrayInputStream(baos.toByteArray());
	
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		IOUtils.copy(is1, outputStream);

		byte[] bytes = outputStream.toByteArray();
		

//		File fileToRead = new File(
//				"C:\\Users\\aksha\\Downloads\\Work Folder\\Puma Product Image\\Puma_black_sneakers.jpg");
//		byte[] data = Files.readAllBytes(Paths.get(fileToRead.toURI()));
		Blob create = storage.create(blobInfo, bytes);
		return "SUCESS";

	}

	@GetMapping(value = "/static/getImage", produces = MediaType.IMAGE_JPEG_VALUE)
	public @ResponseBody byte[] getImage(HttpServletResponse response) throws IOException {
		String bucketName = "ywc_banners";
		String blobName = "test/Puma_black_sneakers.jpg";
		BlobId blobId = BlobId.of(bucketName, blobName);
		Blob blob = storage.get(blobId);

		ReadChannel reader = blob.reader();

		InputStream inputStream = Channels.newInputStream(reader);
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		IOUtils.copy(inputStream, outputStream);

		byte[] bytes = outputStream.toByteArray();
		ByteArrayResource resource = new ByteArrayResource(bytes);

		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		BufferedImage bImage2 = ImageIO.read(bis);
		ImageIO.write(bImage2, "jpg", new File("C:\\Users\\aksha\\Downloads\\output.jpg"));
		System.out.println("image created");
		return bytes;

//		InputStream inputStream = Channels.newInputStream(reader);
//		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//		IOUtils.copy(inputStream, outputStream);
//		byte[] bytes = outputStream.toByteArray();
//		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
//		BufferedImage bImage2 = ImageIO.read(bis);
//		ByteArrayOutputStream os = new ByteArrayOutputStream();
//		ImageIO.write(bImage2, "jpg", os);
//		InputStream is = new ByteArrayInputStream(os.toByteArray());
//		ByteArrayOutputStream output = new ByteArrayOutputStream();
//		IOUtils.copy(is, output);
//		byte[] d = output.toByteArray();
//		return d;
	}

}
