package Database.concretes;

import Database.abstracts.CoursesDao;
import Entities.concretes.MyCourses;

public class Jdbccoursesdao implements CoursesDao{
	public void add(MyCourses course) {
		System.out.println("Jdbc veritabanına courses eklendi");
	}

	

}
