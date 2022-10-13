package javakampıday3ödev3;

import java.util.ArrayList;
import java.util.List;

import Business.concretes.CategoryManager;
import Business.concretes.CourseManager;
import Database.concretes.Hibernatecategorydao;
import Database.concretes.Jdbccategorydao;
import Database.concretes.Jdbccoursesdao;
import Entities.concretes.Category;
import Entities.concretes.Member;
import Entities.concretes.MyCourses;

public class Main {

	

	public static void main(String[] args) throws Exception {
		Member member=new Member("buse", "köse", 12345);
		//course oluşturuyoruz
		MyCourses course=new MyCourses("java",1);
		
		List<MyCourses>mycourses=new ArrayList<MyCourses>();
		mycourses.add(course);
		MyCourses course1=new MyCourses("python",2);
		
		CourseManager coursemanager=new CourseManager(new Jdbccoursesdao(),mycourses);
		coursemanager.add(course1);
    

		
		
		//category oluşturuyoruz
		Category category=new Category("programlama", 1);
		List<Category>categories=new ArrayList<Category>();
		categories.add(category);
		//eklenecek olan kategori
		Category category1=new Category("teknoloji",2);
		CategoryManager categorymanager=new CategoryManager(new Jdbccategorydao(),categories);
		categorymanager.add(category1);
		
		
		
		
		
	
}
}