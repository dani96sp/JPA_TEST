package com.everis.alicante.becajava.services.implementaciones;

import java.util.List;

import com.everis.alicante.becajava.Parkingplace;
import com.everis.alicante.becajava.interfaces.ClientDAO;
import com.everis.alicante.becajava.interfaces.ParkingplaceDAO;
import com.everis.alicante.becajava.services.ParkingplaceService;

public class ParkingplaceServiceImpl implements ParkingplaceService {

	private ParkingplaceDAO parkingplaceDao;
//	VehicleDAO vehicleDao;
//	BookingDAO bookingDao;
	
	
	public ParkingplaceServiceImpl(ParkingplaceDAO parkingplaceDao) {
		super();
		this.parkingplaceDao = parkingplaceDao;
	}
@Override
public void createParkingplace(Parkingplace parkingplace) {
	// TODO Auto-generated method stub
	
}
@Override
public List<Parkingplace> listParkingplace() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public void updateParkingplace(Parkingplace parkingplace) {
	// TODO Auto-generated method stub
	
}
@Override
public Parkingplace findParkingplace(Parkingplace parkingplace) {
	// TODO Auto-generated method stub
	return null;
}

	
	
	
}
