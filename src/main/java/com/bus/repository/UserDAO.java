package com.bus.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bus.entity.Bus;
import com.bus.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;


public interface UserDAO{
	boolean save(User user);

	public List<User> getUsers();



}
