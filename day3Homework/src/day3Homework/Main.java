package day3Homework;

public class Main {

	public static void main(String[] args) {
			User user1=new User();
			user1.setId(1);
			user1.setFirstName("R�veyha");
			user1.setLastName("R�zgar");
			user1.setEmail("ruveyharuzgar.108@gmail.com");
			
			UserManager studentManager=new StudentManager();
			studentManager.add(user1);
			
			StudentManager studentManager2=new StudentManager();
			studentManager2.uploadHomework();
		}

	}

