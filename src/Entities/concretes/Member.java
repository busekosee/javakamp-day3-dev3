package Entities.concretes;

import Entities.abstracts.Imember;

public class Member implements Imember {
	
	String name;
	String surname;
	int password;
	public Member(String name, String surname, int password) {
		super();
		this.name = name;
		this.surname = surname;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	

}
