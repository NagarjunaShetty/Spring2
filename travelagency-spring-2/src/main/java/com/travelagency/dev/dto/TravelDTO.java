package com.travelagency.dev.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;

@Entity
public class TravelDTO 
{
	@Id
	private int id;
	private int noOfAgencys;
	private int rating;
	
	public TravelDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNoOfAgencys() {
		return noOfAgencys;
	}

	public void setNoOfAgencys(int noOfAgencys) {
		this.noOfAgencys = noOfAgencys;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public void disply() 
	{
		System.out.println("Data Stored in Database");
	}

	@Override
	public String toString() {
		return "TravelDTO [id=" + id + ", noOfAgencys=" + noOfAgencys + ", rating=" + rating + "]";
	}
}
