package com.clc.hbmdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtil {
	public static SessionFactory factory = null;
	public static Session session = null;

	public static Session getNewSession(String str) {

		if (str.equalsIgnoreCase("Mysql")) {
			if (factory == null) {

				factory = new Configuration().configure("/mysql.hibernate.cfg.xml").buildSessionFactory();
				session = factory.openSession();
				System.out.println("Mysql Session is Started");
				return session;
				}
			} 
		else if (str.equalsIgnoreCase("Hsql")) {
				if(factory==null){
				factory = new Configuration().configure("/hsql.hibernate.cfg.xml").buildSessionFactory();
				session = factory.openSession();
				System.out.println("Hsql Session is Started");
				return session;
				}
			}
		
		return null;
	}

	
}
