package com.everis.alicante.becajava.interfaces.implementaciones;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.everis.alicante.becajava.Client;
import com.everis.alicante.becajava.interfaces.ClientDAO;

public class ClientDAOjPAImpl implements ClientDAO {

	EntityManager em;
	
	public ClientDAOjPAImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public void create(Client client) throws IOException {
		  em.getTransaction().begin();
		  em.persist(client);
		  em.getTransaction().commit();
	}

	@Override
	public Client readById(int id) throws IOException {
		return em.find(Client.class, id);
	}
	
	@Override
	public void update(Client client) throws IOException {
		em.merge(client);
		
	}

	@Override
	public void delete(Client client) throws IOException {
		em.remove(client);
	}

	@Override
	public List<Client> listClients() {
		Query query = em.createNamedQuery("Client.findAll");
		
		return query.getResultList();
	}
	
	

	
	
}
