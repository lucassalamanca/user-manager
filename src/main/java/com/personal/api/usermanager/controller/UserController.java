package com.personal.api.usermanager.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.personal.api.usermanager.model.User;
import com.personal.api.usermanager.services.UserService;

@RestController
@RequestMapping("/users/")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<String> getAllUsers() {
		List<String> users = new ArrayList<String>() ;
		users.add("Lucas");
		users.add("Pablo");
        return users;
    }
	
	@RequestMapping(method = RequestMethod.GET, path = "/{id}", produces = "application/json")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public void deleteUser(@PathVariable int id) {
    	userService.deleteUser(id);
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }


}
