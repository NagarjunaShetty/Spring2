package com.travelagency.dev.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.travelagency.dev.dao.TravelDao;
import com.travelagency.dev.dto.TravelDTO;

public class SpringTester
{
	public static void main(String[] args) 
	{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
		TravelDao dao = applicationContext.getBean(TravelDao.class);
		TravelDTO dto = new TravelDTO();
		dto.setId(1);
		dto.setNoOfAgencys(100);
		dto.setRating(4);
		dao.createTravel(dto);
	}
}
