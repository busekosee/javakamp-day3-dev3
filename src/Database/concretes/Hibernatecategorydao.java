package Database.concretes;

import Database.abstracts.CategoryDao;
import Entities.concretes.Category;

public class Hibernatecategorydao implements CategoryDao {
	public void add(Category category) {
		System.out.println("category hibernate veritabanına eklendi");
		
	}

}
