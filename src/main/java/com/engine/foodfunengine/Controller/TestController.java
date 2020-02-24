package com.engine.foodfunengine.Controller;


import com.engine.foodfunengine.Server.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value = "/foodfunengine/test")
public class TestController {

	@Autowired
	TestService testService;
	//@RequestMapping(value = "/saveFile/", method = RequestMethod.POST )
	//public String saveFile(String fileName, MultipartFile fileData, String userAccount) {
	//	return testService.saveFile(fileName,  fileData, userAccount);
	//
	//}


}
