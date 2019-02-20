package com.estudos.Hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.estudos.model.Address;
import com.estudos.model.HibernateSession;
import com.estudos.model.Options;
import com.estudos.model.User;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		Session session = HibernateSession.getSessionFactory().openSession();
		
		User user = new User();
		Address address = new Address();
		Options optionsInst = new Options();
		List<Options> options = new ArrayList<Options>();
		
		options.add(optionsInst);
		
		address.setNumber(99);
		address.setStreet("valdemarbom");

		
		user.setUsername("jhonatan Grymuza");
		user.setName("jhonatan");
		user.setLastname("grymuza");
		
		
		address.setUser(user);
		user.setAddress(address);
		user.setOptions(options);
		System.out.println("hellow");
		System.out.println(session);
		
		
		System.out.println(user.toString());
		System.out.println(user.getAddress().getStreet()+" "+ user.getName());
		
		
		
	}
}
