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

import com.bus.entity.Booking;
import com.bus.repository.BookingDAO;

@RestController
@CrossOrigin("localhost:3000/")
public class BookingController {

	@Autowired
	private BookingDAO bookingDAO;

	@PostMapping("/CreateBooking")
	public boolean addBooking(@RequestBody Booking booking) {
		return bookingDAO.save(booking);
	}
	@GetMapping("/GetAllBooking")
	public List<Booking> loadFindAllBooking() {
		return (List<Booking>) bookingDAO.getBookings();
	}
	@GetMapping("/GetBooking/{id}")
	public Booking performFind(@PathVariable("id") int id) {
		return bookingDAO.GetBooking(id);
 
	}
		

}
