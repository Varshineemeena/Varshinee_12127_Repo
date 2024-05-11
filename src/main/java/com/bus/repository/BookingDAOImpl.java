package com.bus.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bus.entity.Booking;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class BookingDAOImpl implements BookingDAO {

	private EntityManager entitymanager;

	public BookingDAOImpl() {
		super();
	}

	@Autowired
	public BookingDAOImpl(EntityManager entitymanager) {
		super();
		this.entitymanager = entitymanager;
	}

	@Override
	public boolean save(Booking booking) {
		entitymanager.persist(booking);
		return true;
	}

	@Override
	public List<Booking> getBookings() {
		return entitymanager.createQuery("from Booking").getResultList();
	}

	@Override
	public Booking findBooking(String bookingId) {
		Booking obj = entitymanager.find(Booking.class, bookingId);
		return obj;

	}
	@Override
	public Booking GetBooking(int id) {
		try {
			return entitymanager.find(Booking.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Booking();
	}

}
