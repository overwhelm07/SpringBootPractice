package com.restPractice.restAPI;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	/**
	 * Author: John 
	 * 
	 * REST API URL Rule
	 * 1. 소문자만 사용
	 * 2. 하이픈(-)은 사용하지 않고 밑줄(_)을 사용
	 * 3. 확장자를 표시하지 않음
	 * 
	 * @return
	 */
	
	//localhost:8080/api/test
	@RequestMapping(value = "/api/test", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public String getApiTest() {
		return "{\"result\":\"ok\"}";
	}
	
	
	@RequestMapping(value = "/api/test2", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public String getApiTest2() {
		return "{\"result\":\"sendTest\"}";
	}
	
}
