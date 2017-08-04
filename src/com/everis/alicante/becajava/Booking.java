package com.everis.alicante.becajava;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the booking database table.
 * 
 */
@Entity
@NamedQuery(name="Booking.findAll", query="SELECT b FROM Booking b")
public class Booking implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idBooking;

	@Temporal(TemporalType.TIMESTAMP)
	private Date bookingDate;

	//bi-directional many-to-one association to Parkingplace
	@ManyToOne
	@JoinColumn(name="idParkingPlace")
	private Parkingplace parkingplace;

	//bi-directional many-to-one association to Vehicle
	@ManyToOne
	@JoinColumn(name="idVehicle")
	private Vehicle vehicle;

	//bi-directional many-to-one association to Client
	@ManyToOne
	@JoinColumn(name="idClient")
	private Client client;

	public Booking() {
	}

	public int getIdBooking() {
		return this.idBooking;
	}

	public void setIdBooking(int idBooking) {
		this.idBooking = idBooking;
	}

	public Date getBookingDate() {
		return this.bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Parkingplace getParkingplace() {
		return this.parkingplace;
	}

	public void setParkingplace(Parkingplace parkingplace) {
		this.parkingplace = parkingplace;
	}

	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}