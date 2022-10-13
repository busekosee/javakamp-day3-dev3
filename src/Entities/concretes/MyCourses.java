package Entities.concretes;

import Entities.abstracts.Icourses;

public class MyCourses implements Icourses {
	String coursename;
	int price;

	public MyCourses(String coursename,int price) {
		super();
		this.coursename = coursename;
		this.price = price;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

}
