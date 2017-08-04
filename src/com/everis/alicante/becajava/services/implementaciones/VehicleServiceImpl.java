package com.everis.alicante.becajava.services.implementaciones;

import java.util.List;

import com.everis.alicante.becajava.Client;
import com.everis.alicante.becajava.Vehicle;
import com.everis.alicante.becajava.interfaces.ClientDAO;
import com.everis.alicante.becajava.interfaces.VehicleDAO;
import com.everis.alicante.becajava.services.VehicleService;

public class VehicleServiceImpl implements VehicleService {

	private VehicleDAO vehicleDao;
//	VehicleDAO vehicleDao;
//	BookingDAO bookingDao;
	
	
	public VehicleServiceImpl(VehicleDAO vehicleDao) {
		super();
		this.vehicleDao = vehicleDao;
	}


	@Override
	public void createVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Vehicle> listVehicle() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void updateVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Vehicle findVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
