package com.everis.alicante.becajava.services.implementaciones;

import java.io.IOException;
import java.util.List;

import com.everis.alicante.becajava.Client;
import com.everis.alicante.becajava.Vehicle;
import com.everis.alicante.becajava.interfaces.ClientDAO;
import com.everis.alicante.becajava.interfaces.VehicleDAO;
import com.everis.alicante.becajava.services.ClientService;

public class ClientServiceImpl implements ClientService {

	private ClientDAO clientDao;
	private VehicleDAO vehicleDao;
//	VehicleDAO vehicleDao;
//	BookingDAO bookingDao;
	
	
	public ClientDAO getClientDao() {
		return clientDao;
	}

	public void setClientDao(ClientDAO clientDao) {
		this.clientDao = clientDao;
	}

	@Override
	public void createClient(Client client, Vehicle vehicle) throws IOException {
		clientDao.create(client);
		vehicleDao.create(vehicle);
		
	}

	@Override
	public List<Client> listClients() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateClient(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Client findClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	public ClientServiceImpl(ClientDAO clientDao) {
		super();
		this.clientDao = clientDao;
	}

	
	
	
}
