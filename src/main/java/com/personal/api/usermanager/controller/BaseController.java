package com.personal.api.usermanager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BaseController {
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public String getAllUsers() {
        return "Welcome page Lucas";
    }

}
