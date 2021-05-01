package odevInheritance;

public class UserManager {

	public void add(User user) {
		
		System.out.println( user.getFirstName() +" adli kullanici sisteme eklendi");
	}
	public void delete(User user) {
		System.out.println( user.getFirstName() +" adli kullanici sistemden silindi");
	}
	public void update(User user) {
		System.out.println(user.getFirstName() +" adli kullanici sistemde güncellendi");
	}
}
