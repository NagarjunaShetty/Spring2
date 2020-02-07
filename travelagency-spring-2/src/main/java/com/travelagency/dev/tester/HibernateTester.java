 package com.travelagency.dev.tester;

import com.travelagency.dev.dao.TravelDAOImpl;
import com.travelagency.dev.dto.TravelDTO;

public class HibernateTester 
{
	public static void main(String args[]) 
	{
		
		TravelDAOImpl travelDao = new TravelDAOImpl();
		TravelDTO travelDto = new TravelDTO();
		travelDto.setId(1);
		travelDto.setNoOfAgencys(100);
		travelDto.setRating(4);
		travelDao.createTravel(travelDto);	
	}
}
