import java.util.HashMap;

public class UserDB {
	public static HashMap<String, String> userDB = new HashMap<>();
	public static  void addUser1(String number, String password){userDB.put(number, password);}
	public static  void addUser2(String email, String password) {userDB.put(email, password);}
}
