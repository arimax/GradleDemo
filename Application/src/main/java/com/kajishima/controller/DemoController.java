package com.kajishima.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kajishima.service.MyService;

@RestController
@RequestMapping("/api/v1/demo")

public class DemoController {
	@Autowired
	private MyService myService;

	@RequestMapping(method = RequestMethod.GET)
	public String test() {
	    return "Hello World " + myService.message();
	}

}
