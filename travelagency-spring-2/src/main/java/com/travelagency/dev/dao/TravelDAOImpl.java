package com.travelagency.dev.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.travelagency.dev.dto.TravelDTO;

public class TravelDAOImpl implements TravelDao
{
	private SessionFactory sf;
	
	public void setSf(SessionFactory sf) 
	{
		this.sf = sf;
	}

	public void createTravel(TravelDTO traveldto)
	{	
		
		Session session = null;
		try
		{
			session = sf.openSession();
			session.save(traveldto);
			Transaction transaction = session.beginTransaction();
			transaction.commit();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
			sf.close();
		}
	}
}
