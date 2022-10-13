package Entities.concretes;

import Entities.abstracts.Icategory;

public class Category implements Icategory{
   String categoryname;
   int id;

public Category(String categoryname, int id) {
	super();
	this.categoryname = categoryname;
	this.id = id;
}
public String getCategoryname() {
	return categoryname;
}
public void setCategoryname(String categoryname) {
	this.categoryname = categoryname;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
   
}
