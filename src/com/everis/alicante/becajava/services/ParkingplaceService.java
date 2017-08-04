package com.everis.alicante.becajava.services;

import java.util.List;

import com.everis.alicante.becajava.Parkingplace;

public interface ParkingplaceService {
	
	
	void createParkingplace(Parkingplace parkingplace);
	
	List<Parkingplace> listParkingplace();
	
	void updateParkingplace(Parkingplace parkingplace);
	
	Parkingplace findParkingplace(Parkingplace parkingplace);
	
}
