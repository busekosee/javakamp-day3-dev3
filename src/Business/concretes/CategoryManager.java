package Business.concretes;

import java.util.ArrayList;
import java.util.List;

import Database.abstracts.CategoryDao;
import Entities.concretes.Category;

public class CategoryManager {
	public CategoryDao categorydao;
	List<Category> categories = new ArrayList<Category>();
	public CategoryManager(CategoryDao categorydao, List<Category> categories) {
		super();
		this.categorydao = categorydao;
		this.categories = categories;
	}
	public void add(Category categori1 )throws Exception {
		for(Category category:categories) {
			if(categori1.getCategoryname()==category.getCategoryname()) {
				System.out.println("aynı kategori bidaha seçilemez");
			}
			
		}
		categories.add(categori1);
		categorydao.add(categori1);
	

	}
	
	}
