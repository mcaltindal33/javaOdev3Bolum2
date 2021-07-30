package kodlama.io.business;

import kodlama.io.entities.*;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getUserName() +" eklendi");
	}
	public void remove(User user) {
		System.out.println(user.getUserName() +" silindi");
	}
	public void update(User user) {
		System.out.println(user.getUserName() +" güncellendi");
	}
}
