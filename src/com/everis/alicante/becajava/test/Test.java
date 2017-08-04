package com.everis.alicante.becajava.test;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.everis.alicante.becajava.Client;
import com.everis.alicante.becajava.interfaces.ClientDAO;
import com.everis.alicante.becajava.interfaces.implementaciones.ClientDAOjPAImpl;
import com.everis.alicante.becajava.services.ClientService;
import com.everis.alicante.becajava.services.implementaciones.ClientServiceImpl;

public class Test {

	public static void main(String[] args) throws IOException {

		EntityManager em = createEntityManager();
		
		ClientDAO dao = new ClientDAOjPAImpl(em);
		
		ClientService service = new ClientServiceImpl(dao);

		
		System.out.println("");
		System.out.println(dao.readById(1));
		
		Client client = new Client();
		client.setName("Pepe");
		client.setSurname("Apellido");
		client.setNif("nif123");
		client.setTelephone("999333222");
//		client.set
		dao.create(client);
		System.out.println(dao.readById(2));
		
//		System.out.println(dao.listClients());
		System.out.println(service.listClients());

		em.close();

	}

	
	static EntityManager createEntityManager() {
		return Persistence.createEntityManagerFactory("JPA_TEST").createEntityManager();
	}
	
	static void iniciarAplicacion() {

		System.out.println("*******************************************************");	
		
		System.out.println("Bienvenido a nuestro garaje, seleccione una opcion: ");
		System.out.println("1:Listar Plazas Garaje Libre ");
		System.out.println("2:Listar Plazas Garaje Ocupadas ");
		System.out.println("3:Reservar Plazas");
		System.out.println("4:Listar Clientes");
		System.out.println("5:Listar Reservas");
		System.out.println("6:Listar Vehiculos");
		System.out.println("7:Listar por Fecha de Reserva");
		System.out.println("8:Insertar un Vehiculo ");
		System.out.println("9:Borrar un Vehiculo ");
		System.out.println("10:Listar un Vehiculo");
		System.out.println("11:Listar Vehiculos");

		
		try {
		
			Scanner in = new Scanner(System.in);
			Integer opcion = in.nextInt();
//		    boolean resultado = true;   
		   
			
			System.out.println("Ha elegido la opcion :" + opcion);
		
	
							
			switch (opcion) {
				case 1:	
					
					break;
				case 2:			
					
					break;
				case 3:			
					
					break;
				case 4:			
					
					break;
				case 5:			
					
					break;
				case 6:			
					
					break;
				case 7:	
					
					break;
				case 8:	
					
					break;
				case 9:	
					
					break;
				case 10:			
					
					break;
				case 11:			
					
					break;
				case 0:		
					break;
				default:
					System.out.println("Error");
					break;
				}
		} catch(Exception e) {
			
		}
}
}
