package com.ty.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Car;
import com.ty.dto.Features;

public class SaveCar {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Car car1 = new Car();
		car1.setBrand("BMW");
		car1.setCityName("Banglore");
		car1.setCost(500000);
		car1.setName("BWM 8");

		Car car2 = new Car();
		car2.setBrand("Honda");
		car2.setCityName("Mysore");
		car2.setCost(200000);
		car2.setName("Honda city");

		List<Car> cars = new ArrayList<Car>();
		cars.add(car1);

		List<Car> cars2 = new ArrayList<Car>();
		cars2.add(car2);

		Features features1 = new Features();
		features1.setName("power window");
		features1.setComfortLevel("4");
		features1.setCar(cars);
	

		
		Features features2 = new Features();
		features2.setName("Air bag");
		features2.setComfortLevel("3.5");
		features2.setCar(cars2);


		entityTransaction.begin();
		entityManager.persist(features1);
		entityManager.persist(features2);
		entityManager.persist(car1);
		entityManager.persist(car2);

		entityTransaction.commit();
		System.out.println("---data stored-------");

	}
}
