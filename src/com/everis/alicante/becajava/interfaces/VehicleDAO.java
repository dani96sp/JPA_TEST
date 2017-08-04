package com.everis.alicante.becajava.interfaces;

import java.io.IOException;

import com.everis.alicante.becajava.Vehicle;

public interface VehicleDAO {
	
	 void create(Vehicle vehicle) throws IOException;
	 
	 Vehicle readById(int id) throws IOException;

	 void update(Vehicle vehicle) throws IOException;

	 void delete(Vehicle vehicle) throws IOException;
	
	
}
