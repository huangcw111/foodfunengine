package com.engine.foodfunengine.Dao;


import com.engine.foodfunengine.Server.TestService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
@Service
public class TestDao implements TestService {
	@Override
	public String  test(String fileName, MultipartFile fileData, String userAccount) {
		return "";
	}

}
