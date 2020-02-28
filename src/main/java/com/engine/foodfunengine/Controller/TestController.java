package com.engine.foodfunengine.Controller;


import com.engine.foodfunengine.Server.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value = "/foodfunengine/test")
public class TestController {

	@Autowired
	TestService testService;

	@RequestMapping(value = "/test/" )
	public String test() {
		return testService.test();

	}


}
