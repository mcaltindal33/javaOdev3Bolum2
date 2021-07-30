package kodlama.io.business;

import kodlama.io.entities.*;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() +" eklendi");
	}
	public void remove(Instructor instructor) {
		System.out.println(instructor.getFirstName() +" silindi");
	}
	public void update(Instructor instructor) {
		System.out.println(instructor.getFirstName() +" güncellendi");
	}
}
