package co.mmdoss;

public class LoginApp {

	public LoginApp() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]) {
		int counter=0;
		while(counter<3) {
			String username=KeyboardUtil.getString("Enter username : ");
			String password=KeyboardUtil.getString("Enter password : ");
			if(username.equals("mmdoss")) {
				if(password.equals("password")) {
					System.out.println("Welcome "+ username);
					System.exit(0);
				}
			}
			counter++;
		}
		System.out.println("Contact Admin");
	}

}
