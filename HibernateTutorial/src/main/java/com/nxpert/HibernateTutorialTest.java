package com.nxpert;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateTutorialTest {
	private static SessionFactory factory;
	private static ServiceRegistry serviceRegistry;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Session session = HibernateUtils.getSessionFactory().openSession();
        
        session.beginTransaction();
        User user=new User();
        user.setFirstName("nilesh");
        session.save(user);
        session.getTransaction().commit();
	}

}
