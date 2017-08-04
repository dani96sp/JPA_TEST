package com.everis.alicante.becajava.interfaces;

import java.io.IOException;
import java.util.List;

import com.everis.alicante.becajava.Client;

public interface ClientDAO {
	
	 void create(Client client) throws IOException;
	 
	 Client readById(int id) throws IOException;

	 void update(Client client) throws IOException;

	 void delete(Client client) throws IOException;
	
		List<Client> listClients();
	
}
