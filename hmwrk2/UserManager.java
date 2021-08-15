package hmwrk2;

public class UserManager {
	public void addUser(User user) {
		System.out.println(user.getUserName() + " kiþisi " + user.getPosition() + " alaný ile kaydedildi");
	}
	public void addMultiply(User[] users) {
		for (User user : users) {
			addUser(user);
		}
	}
		
}
