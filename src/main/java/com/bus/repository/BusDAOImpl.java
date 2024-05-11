package com.bus.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bus.entity.Booking;
import com.bus.entity.Bus;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class BusDAOImpl implements BusDAO {
	private EntityManager entitymanager;

	public BusDAOImpl() {
		super();
	}

	@Autowired
	public BusDAOImpl(EntityManager entitymanager) {
		super();
		this.entitymanager = entitymanager;
	}

	@Override
	public boolean save(Bus bus) {
		entitymanager.persist(bus);
		return true;
	}

	@Override
	public List<Bus> getBuss() {
		return entitymanager.createQuery("from Bus").getResultList();
	}


}
