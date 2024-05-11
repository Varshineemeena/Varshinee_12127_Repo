package com.bus.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bus.entity.Bus;
import com.bus.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO {
	private EntityManager entitymanager;

	public UserDAOImpl() {
		super();
	}

	@Autowired
	public UserDAOImpl(EntityManager entitymanager) {
		super();
		this.entitymanager = entitymanager;
	}

	@Override
	public boolean save(User user) {
		entitymanager.persist(user);
		return true;
	}

	@Override
	public List<User> getUsers() {
		return entitymanager.createQuery("from User").getResultList();
	}

	

}
