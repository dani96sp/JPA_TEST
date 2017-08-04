package com.everis.alicante.becajava.interfaces;

import java.io.IOException;

import com.everis.alicante.becajava.Parkingplace;

public interface ParkingplaceDAO {
	
	 void create(Parkingplace parkingplace) throws IOException;
	 
	 Parkingplace readById(int id) throws IOException;

	 void update(Parkingplace parkingplace) throws IOException;

	 void delete(Parkingplace parkingplace) throws IOException;
	
	
}
