package com.ty.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Subject;
import com.ty.dto.Teacher;

public class GetSubject {
	public static void main(String[] args) {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = factory.createEntityManager();
	Subject subject=entityManager.find(Subject.class,4);
	System.out.println("Subject Id is :"+subject.getId());
	System.out.println("Subject Id is :"+subject.getName());
	System.out.println("Subject Id is :"+subject.getDays());
	System.out.println("----------------------");
	
	
	List<Teacher> teacher=subject.getTeachers();
	if(!teacher.isEmpty())
	{
		for(Teacher t: teacher)
		{
			System.out.println("Teacher Id is :"+t.getId());
			System.out.println("Teacher name is :"+t.getName());
			System.out.println("Teacher  age is :"+t.getAge());
			System.out.println("--------------------- ");




		}
	}
	



	

}
}
