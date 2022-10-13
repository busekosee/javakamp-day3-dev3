package snippet;

public class Snippet {
	public void add(MyCourses course1)throws Exception {
			for(MyCourses course:mycourses) {
				if(course1.getCoursename()==course.getCoursename()) {
					System.out.println("aynı ürün bidaha girilemez");
				}
			}
}

