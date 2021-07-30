package kodlama.io;

import kodlama.io.business.InstructorManager;
import kodlama.io.business.StudentManager;
import kodlama.io.entities.Instructor;
import kodlama.io.entities.Student;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(1, "User1", "passs12334", "user1@gmail.com", "Mustafa Çaðrý", "Altýndal", 37);
		
		Instructor instructor = new Instructor(1, "engin", "endeog123", "engindemirog@gmail.com", "Engin", "Demirog", 35, "Yazýlým Eðitmeni");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		
		InstructorManager instructorManager  = new InstructorManager();
		instructorManager.add(instructor);

	}

}
