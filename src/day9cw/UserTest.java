package day9cw;

public class UserTest {

	public static void main(String[] args) {
		User admin=new AdminUser();
		User guest=new GuestUser();
		admin.displayUserType();
		guest.displayUserType();
		admin.ShowMessage();
		guest.ShowMessage();
		

	}

}
