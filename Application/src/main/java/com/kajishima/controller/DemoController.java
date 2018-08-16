package com.kajishima.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kajishima.service.MyService;

@RestController
@RequestMapping("api/v1/demo")

public class DemoController {
	@ResponseBody
	public String test() {
		MyService myService;
	    return "Hello World";
	}

}
