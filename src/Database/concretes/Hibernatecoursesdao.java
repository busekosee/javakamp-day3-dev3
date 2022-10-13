package Database.concretes;

import Database.abstracts.CoursesDao;
import Entities.concretes.MyCourses;

public class Hibernatecoursesdao implements CoursesDao {
	public void add(MyCourses course) {
		System.out.println("course hibernate veritabanına eklendi");
		
	}

}
