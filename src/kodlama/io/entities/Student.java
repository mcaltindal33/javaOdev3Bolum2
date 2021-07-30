package kodlama.io.entities;

public class Student extends User {
	private String firstName;
	private String lastName;
	private int age;
	public Student() {
		
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String userName, String userPassword, String email,String firstName, String lastName, int age) {
		super(id, userName, userPassword, email);
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
