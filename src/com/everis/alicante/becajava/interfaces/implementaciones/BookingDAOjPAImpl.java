package com.everis.alicante.becajava.interfaces.implementaciones;

import java.io.IOException;

import javax.persistence.EntityManager;

import com.everis.alicante.becajava.Booking;
import com.everis.alicante.becajava.interfaces.BookingDAO;

public class BookingDAOjPAImpl implements BookingDAO {

	EntityManager em;
	
	public BookingDAOjPAImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public void create(Booking booking) throws IOException {
		  em.getTransaction().begin();
		  em.persist(booking);
		  em.getTransaction().commit();	}

	@Override
	public Booking readById(int id) throws IOException {
		return em.find(Booking.class, id);
	}
	
	@Override
	public void update(Booking booking) throws IOException {
		em.merge(booking);
		
	}

	@Override
	public void delete(Booking booking) throws IOException {
		em.remove(booking);
	}
}
