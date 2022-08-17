package com.ty.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Subject;
import com.ty.dto.Teacher;

public class SaveTeacher {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Teacher teachers = new Teacher();
		teachers.setName("champkka");
		teachers.setAge(38);

		Teacher teacher1 = new Teacher();
		teacher1.setName("renukka");
		teacher1.setAge(39);

//		Subject subject1 = new Subject();
//		subject1.setName("Java");
//		subject1.setDays(60);
//
//		Subject subject2 = new Subject();
//		subject2.setName("AdvanceJava");
//		subject2.setDays(80);
		
		Subject subject3 = new Subject();
		subject3.setName("HTML");
		subject3.setDays(90);

		Subject subject4 = new Subject();
		subject4.setName("HTML");
		subject4.setDays(90);

		

		List<Teacher> teacher = new ArrayList<Teacher>();
		teacher.add(teachers);
		teacher.add(teacher1);
		subject3.setTeachers(teacher);
		subject4.setTeachers(teacher);

		entityTransaction.begin();
		entityManager.persist(subject3);
		entityManager.persist(subject4);
		entityManager.persist(teacher1);
		entityTransaction.commit();
		System.out.println("-----data stored-------");

	}

}
