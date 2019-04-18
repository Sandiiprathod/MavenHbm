package com.clc.hbmdemo;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestStudent {

	public static void main(String[] args) {
		System.out.println("Inside main");
		Student st1=new Student(101,"Ajay");
		Student st2=new Student(102,"vijay");
		Student st3=new Student(103,"Niranjan");
		
		
		Session session=SessionUtil.getNewSession("mysql");
		Transaction tr=session.beginTransaction();
		session.save(st1);
		session.save(st2);
		session.save(st3);
		session.flush();
		tr.commit();
		
		session.close();
	}
	
}
