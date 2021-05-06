package day2HomeWork1;

public class Main {

	public static void main(String[] args) {
		Category category1 = new Category(1, "Programlama");

		Instructor instructor1 = new Instructor(1, "Engin Demiro�");

		Course course1 = new Course(1, "Programlamaya Giri� i�in Temel Kurs", "Engin Demiro�", "Programlama");
		Course course2 = new Course(2, "Yaz�l�m Geli�tirici Kamp�(C#-ANGULAR)", "Engin Demiro�", "Programlama");
		Course course3 = new Course(3, "Yaz�l�m Geli�tirici Kamp�(JAVA-REACT)", "Engin Demiro�", "Programlama");

		Category[] categories = { category1 };
		for (Category category : categories) {
			System.out.println("Kategoriler:\n" + category.name);
		}

		Instructor[] instructors = { instructor1 };
		for (Instructor instructor : instructors) {
			System.out.println("E�itmenler:\n" + instructor.name);
		}

		Course[] courses = { course1, course2, course3 };

		System.out.println("Kurslar:");
		for (Course course : courses) {
			System.out.println(course.name);
		}

		System.out.println("***********");

		CategoryManager categoryManager = new CategoryManager();
		categoryManager.update(category1);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);

		CourseManager courseManager = new CourseManager();
		courseManager.add(course3);
		courseManager.update(course2);

	}

}
