package kodlama.io.entities;

public class Instructor extends User {
	private String firstName;
	private String lastName;
	private int age;
	private String branch;
	public Instructor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Instructor(int id, String userName, String userPassword, String email,String firstName, String lastName, int age, String branch) {
		super(id, userName, userPassword, email);
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.branch = branch;
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
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
}
