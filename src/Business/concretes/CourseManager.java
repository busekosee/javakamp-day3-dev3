package Business.concretes;

import java.util.ArrayList;
import java.util.List;

import Database.abstracts.CoursesDao;
import Entities.concretes.MyCourses;

public class CourseManager {
	public CoursesDao coursesdao;
	List<MyCourses> mycourses = new ArrayList<MyCourses>();
	
	public CourseManager(CoursesDao coursesdao,List<MyCourses>mycourses) {
		super();
		this.coursesdao = coursesdao;
		this.mycourses=mycourses;
	}

	

	public void add(MyCourses course1)throws Exception {
		for(MyCourses course:mycourses) {
			if(course1.getCoursename()==course.getCoursename()) {
				System.out.println("aynı ürün bidaha girilemez");
			}
		}
		
		if(course1.getPrice()<0) {
			throw new Exception("ürünün fiyatı sıfırdan küçük olamaz");
		}
	
	coursesdao.add(course1);
	}

}
