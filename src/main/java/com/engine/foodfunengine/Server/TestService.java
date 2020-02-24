package com.engine.foodfunengine.Server;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;

public interface TestService  {
	String test(String fileName, MultipartFile fileData, String userAccount);

}
