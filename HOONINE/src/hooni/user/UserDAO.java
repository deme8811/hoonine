package hooni.user;

import java.util.ArrayList;

public interface UserDAO {

	int userJoin(User user);
	
	User userDetail(String userId);

	ArrayList<User> userLsit();

}
