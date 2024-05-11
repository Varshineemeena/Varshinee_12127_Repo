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
import com.bus.entity.Bus;
import com.bus.repository.BookingDAO;
import com.bus.repository.BusDAO;


@RestController
@CrossOrigin("localhost:3000/")
public class BusController {
	
	@Autowired
	private BusDAO busDAO;

	@PostMapping("/CreateBus")
	public boolean addBus(@RequestBody Bus bus) {
		return busDAO.save(bus);
	}
	@GetMapping("/GetAllBus")
	public List<Bus> loadFindAllBus() {
		return (List<Bus>) busDAO.getBuss();
	}

}


