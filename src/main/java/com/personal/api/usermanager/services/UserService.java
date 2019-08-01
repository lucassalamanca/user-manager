package com.personal.api.usermanager.services;

import org.springframework.stereotype.Service;

import com.personal.api.usermanager.domain.User;

@Service
public class UserService {
	
    public User getUserById(int id) {
        return new User();
    }

    public User createUser(User user) {
    	User newUser = new User();
    	newUser.setFirstName("Lucas");
    	newUser.setLastName("Salamanca");
    	newUser.setId(2);
        return newUser;
    }

    public void deleteUser(int id) {

    }

}
