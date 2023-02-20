import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		IDandPasswords idandPasswords = new IDandPasswords();
		//You can add a new user here
		idandPasswords.addLoginInfo("user", "user");
		LoginSystem loginPage = new LoginSystem(idandPasswords.getLoginInfo());
	}

}
