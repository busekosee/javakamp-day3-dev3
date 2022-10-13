package Database.concretes;

import Database.abstracts.CategoryDao;
import Entities.concretes.Category;

public class Jdbccategorydao implements CategoryDao{
	public void add(Category category) {
		System.out.println("jdbc veritabanına category eklendi");
	}

}
