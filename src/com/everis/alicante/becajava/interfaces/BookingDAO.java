package com.everis.alicante.becajava.interfaces;

import java.io.IOException;

import com.everis.alicante.becajava.Booking;

public interface BookingDAO {
	
	 void create(Booking booking) throws IOException;
	 
	 Booking readById(int id) throws IOException;

	 void update(Booking booking) throws IOException;

	 void delete(Booking booking) throws IOException;
	
	
}
