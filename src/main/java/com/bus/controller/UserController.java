package com.bus.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bus.entity.Bus;
import com.bus.entity.User;
import com.bus.repository.BusDAO;
import com.bus.repository.UserDAO;


@RestController
@CrossOrigin("localhost:3000/")
public class UserController {
	
	@Autowired
	private UserDAO userDAO;

	@PostMapping("/CreateUser")
	public boolean addUser(@RequestBody User user) {
		return userDAO.save(user);
	}
	@GetMapping("/GetAllUser")
	public List<User> loadFindAllUser() {
		return (List<User>) userDAO.getUsers();
	}
}

