package com.bus.repository;

import java.util.List;
import com.bus.entity.Booking;

public interface BookingDAO {

	boolean save(Booking booking);

	public List<Booking> getBookings();
	
	public Booking GetBooking(int id);

	public Booking findBooking(String bookingId);

}
