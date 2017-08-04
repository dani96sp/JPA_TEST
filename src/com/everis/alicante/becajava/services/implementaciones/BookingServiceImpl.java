package com.everis.alicante.becajava.services.implementaciones;

import java.util.List;

import com.everis.alicante.becajava.Booking;
import com.everis.alicante.becajava.interfaces.BookingDAO;
import com.everis.alicante.becajava.services.BookingService;

public class BookingServiceImpl implements BookingService {

	private BookingDAO bookingDao;
//	VehicleDAO vehicleDao;
//	BookingDAO bookingDao;
	
	
	public BookingServiceImpl(BookingDAO bookingDao) {
		super();
		this.bookingDao = bookingDao;
	}

	@Override
	public void createBooking(Booking booking) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Booking> listBooking() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBooking(Booking booking) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Booking findBooking(Booking booking) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
