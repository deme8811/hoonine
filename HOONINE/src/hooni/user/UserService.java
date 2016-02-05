package hooni.user;

import java.util.ArrayList;

public interface UserService {

	int userJoin(User user);

	User userDetail(String userId);

	User userLogin(User user);

	User userIdCheck(User user);

	ArrayList<User> userList();

}
