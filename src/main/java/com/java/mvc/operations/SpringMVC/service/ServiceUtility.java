package com.java.mvc.operations.SpringMVC.service;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.multipart.MultipartFile;

public class ServiceUtility {
	
	public static boolean fileUploadService(MultipartFile multipartFile) {
		boolean uploadFlag = false;
		try {
			String absolutePath = new ClassPathResource("\\static\\files\\").getFile().getAbsolutePath();
			//	"C:\\Users\\hp\\Downloads\\SpringMVC\\SpringMVC\\src\\main\\resources\\static\\files\\";
		Files.copy(multipartFile.getInputStream(), Paths.get(absolutePath+File.separator+multipartFile.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
		uploadFlag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return uploadFlag;
	}

}
