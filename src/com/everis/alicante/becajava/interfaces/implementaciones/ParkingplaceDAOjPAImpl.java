package com.everis.alicante.becajava.interfaces.implementaciones;

import java.io.IOException;

import javax.persistence.EntityManager;

import com.everis.alicante.becajava.Parkingplace;
import com.everis.alicante.becajava.interfaces.ParkingplaceDAO;

public class ParkingplaceDAOjPAImpl implements ParkingplaceDAO {

	EntityManager em;
	
	public ParkingplaceDAOjPAImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public void create(Parkingplace parkingplace) throws IOException {
		  em.getTransaction().begin();
		  em.persist(parkingplace);
		  em.getTransaction().commit();	}

	@Override
	public Parkingplace readById(int id) throws IOException {
		return em.find(Parkingplace.class, id);
	}
	
	@Override
	public void update(Parkingplace parkingplace) throws IOException {
		em.merge(parkingplace);
		
	}

	@Override
	public void delete(Parkingplace parkingplace) throws IOException {
		em.remove(parkingplace);
	}
	
	
}
