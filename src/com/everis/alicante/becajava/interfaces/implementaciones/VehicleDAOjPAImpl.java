package com.everis.alicante.becajava.interfaces.implementaciones;

import java.io.IOException;

import javax.persistence.EntityManager;

import com.everis.alicante.becajava.Vehicle;
import com.everis.alicante.becajava.interfaces.VehicleDAO;

public class VehicleDAOjPAImpl implements VehicleDAO {

	EntityManager em;
	
	public VehicleDAOjPAImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public void create(Vehicle vehicle) throws IOException {
		  em.getTransaction().begin();
		  em.persist(vehicle);
		  em.getTransaction().commit();	}

	@Override
	public Vehicle readById(int id) throws IOException {
		return em.find(Vehicle.class, id);
	}
	
	@Override
	public void update(Vehicle vehicle) throws IOException {
		em.merge(vehicle);
		
	}

	@Override
	public void delete(Vehicle vehicle) throws IOException {
		em.remove(vehicle);
	}
	
}
