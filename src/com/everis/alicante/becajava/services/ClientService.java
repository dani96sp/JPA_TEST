package com.everis.alicante.becajava.services;

import java.io.IOException;
import java.util.List;

import com.everis.alicante.becajava.Client;
import com.everis.alicante.becajava.Vehicle;

public interface ClientService {
	
	
	List<Client> listClients() throws IOException;
	
	void updateClient(Client client) throws IOException;
	
	Client findClient(Client client) throws IOException;

	void createClient(Client client, Vehicle vehicle) throws IOException;
	
}
