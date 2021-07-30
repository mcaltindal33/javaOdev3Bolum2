package kodlama.io.business;

import kodlama.io.entities.Student;

public class StudentManager {
	public void add(Student student) {
		System.out.println(student.getFirstName() +" eklendi");
	}
	public void remove(Student student) {
		System.out.println(student.getFirstName() +" silindi");
	}
	public void update(Student student) {
		System.out.println(student.getFirstName() +" güncellendi");
	}
}
