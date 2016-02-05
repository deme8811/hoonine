package hooni.user;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO dao;
	
	@Override
	public int userJoin(User user) {
		return dao.userJoin(user);
	}

	@Override
	public User userDetail(String id) {
		return dao.userDetail(id);
	}

	@Override
	public User userLogin(User user) {
		
		User user2 = dao.userDetail(user.getUserId());
		
		if (user2 != null) {
			String dbpass = user2.getUserPass();
			String pass = user.getUserPass();
			
			if (dbpass.equals(pass)) {
				return user2;
			} else {
				return null;
			}
		}
		return null;
	}

	@Override
	public User userIdCheck(User user) {
		
		User user2 = dao.userDetail(user.getUserId());
		
		if (user2 == null) {
			return user2;
		}
		
		return user;
	}

	@Override
	public ArrayList<User> userList() {
		// TODO Auto-generated method stub
		
		return dao.userLsit();
	}

}
