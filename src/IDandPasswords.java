import java.util.HashMap;

public class IDandPasswords {
	private HashMap<String,String> loginInfo = new HashMap<String,String>();
	public IDandPasswords() {
		loginInfo.put("admin", "admin");
	}
	protected HashMap<String, String> getLoginInfo() {
		return loginInfo;
	}
	protected void addLoginInfo(String userID, String password) {
		loginInfo.put(userID, password);
	}
}
